# Mimosa SQL Builder
A simple SQL query builder library

## Stack

* Java 8
* JUnit and Mockito for tests
* Maven

## How to use?

### 1. Creating a simple SELECT query

```java
String allUsers = SQL.builder()
                     .select("u.name", "u.id")
                     .from("u.users")
                     .build();
```
**Output:** SELECT u.name, u.id FROM u.users
