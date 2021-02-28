package com.robencosta.query.mimosaquerybuilder.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteTest {

    @Test
    void shouldReturnsDeleteSqlCommand() {
        assertEquals("DELETE FROM ", Delete.newInstance().get());
    }
}
