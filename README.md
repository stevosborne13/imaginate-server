# Setup
- Install PostgreSQL 17
- Create a new role
```sql
  CREATE ROLE imaginate WITH
	LOGIN
	NOSUPERUSER
	CREATEDB
	NOCREATEROLE
	INHERIT
	NOREPLICATION
	NOBYPASSRLS
	CONNECTION LIMIT -1
	PASSWORD 'xxxxxx';
```
- Create the `imaginate` database
```sql
CREATE DATABASE imaginate
    WITH
    OWNER = imaginate
    ENCODING = 'UTF8'
    LOCALE_PROVIDER = 'libc'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
```