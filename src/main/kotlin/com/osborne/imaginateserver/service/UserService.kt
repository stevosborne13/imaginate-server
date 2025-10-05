package com.osborne.imaginateserver.service


import com.imaginate.jooq.tables.Users.USERS
import com.imaginate.jooq.tables.records.UsersRecord
import com.osborne.imaginateserver.datafetcher.UserDto
import org.jooq.DSLContext
import org.springframework.stereotype.Service

@Service
class UserService(private val dsl: DSLContext) {

    fun getUserById(id: Long): UserDto? {
        return dsl.selectFrom(USERS)
            .where(USERS.ID.eq(id))
            .fetchOne()
            ?.toDto()
    }

    fun UsersRecord.toDto() = UserDto(
        id = this.id,
        firstName = this.firstName,
        lastName = this.lastName,
        email = this.email
    )
}
