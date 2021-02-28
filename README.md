[![Build Status](https://travis-ci.org/klugjo/hexo-autolinker.svg?branch=master)](https://travis-ci.org/github/robencosta/mimosa-sql-builder)

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
                     .select("name", "id")
                     .from("users")
                     .build();
```
**Output:** SELECT name, id FROM users
