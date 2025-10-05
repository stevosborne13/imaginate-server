package com.osborne.imaginateserver.datafetcher

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument
import com.osborne.imaginateserver.service.UserService

@DgsComponent
class UserDataFetcher(private val userService: UserService) {
    @DgsQuery
    fun user(@InputArgument id: Long): UserDto? {
        return userService.getUserById(id)
    }

    /*@DgsQuery
    fun allUsers(): List<User> {
        return users
    }*/
}

data class UserDto(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val email: String
)