package com.robencosta.query.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQLTest {

    @Test
    void shouldReturnsASelectQueryFromUsersTable() {

        String allUsers = SQL.newQuery()
                             .select("u.name", "u.id")
                             .from("u.users")
                             .get();

        assertEquals("SELECT u.name, u.id FROM u.users", allUsers);
    }
}
