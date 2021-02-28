package com.robencosta.query.mimosaquerybuilder.util;

import com.robencosta.query.mimosaquerybuilder.command.From;
import com.robencosta.query.mimosaquerybuilder.command.Select;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JoinStringsTest {

    @Test
    void shouldReturnsACompleteSelectCommandQueryWithAsterisk() {

        String fullResult = JoinStringColumns.joinAll(
            Select.newInstance().get(),
            From.newInstance().get()
        );

        assertEquals("SELECT * FROM ", fullResult);
    }

    @Test
    void shouldReturnsACompleteSelectCommandQueryUsingTablesAndColumns() {

        String fullResult = JoinStringColumns.joinAll(
            Select.newInstance("u.name, u.age").get(),
            From.newInstance("users u").get()
        );

        assertEquals("SELECT u.name, u.age FROM users u", fullResult);
    }

    @Test
    void shouldReturnsACompleteSelectCommandQueryUsingSemicolon() {

        String fullResult = JoinStringColumns.joinAll(
            Select.newInstance("u.id, u.created_at").get(),
            From.newInstance("users u").getSemicolon()
        );

        assertEquals("SELECT u.id, u.created_at FROM users u;", fullResult);
    }
}
