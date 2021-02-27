# Mimosa SQL Builder
A simple SQL query builder library

## Stack

* Java 8
* JUnit and Mockito for tests
* Maven

## Creating a simple SELECT query

``java
String allUsers = SQL.newQuery()
                     .select("u.name", "u.id")
                     .from("u.users")
                     .get();
                             
