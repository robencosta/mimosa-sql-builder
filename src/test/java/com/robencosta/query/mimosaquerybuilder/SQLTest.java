package com.robencosta.query.mimosaquerybuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQLTest {

    @Test
    void shouldReturnsASelectQueryFromUsersTable() {

        String allUsers = SQL.builder()
                             .select("u.name", "u.id")
                             .from("u.users")
                             .build();

        assertEquals("SELECT u.name, u.id FROM u.users", allUsers);
    }
}
