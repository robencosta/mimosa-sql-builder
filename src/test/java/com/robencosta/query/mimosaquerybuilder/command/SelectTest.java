package com.robencosta.query.builder.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectTest {

    private static final String COLUMNS_MOCK = "name, age";

    @Test
    void shouldReturnsTheSelectCommandValueWithAsteriskCharacter() {
        assertEquals("SELECT *", Select.newInstance().get());
    }

    @Test
    void shouldReturnsTheSelectCommandValueWithAnyArgs() {
        assertEquals("SELECT name, age",
            Select.newInstance(COLUMNS_MOCK).get()
        );
    }

    @Test
    void shouldReturnsTheSelectCommandValueWithSomeArgs() {
        assertEquals("SELECT name, age",
            Select.newInstance(COLUMNS_MOCK).get()
        );
    }

    @Test
    void shouldReturnsTheSelectCommandValueWithAsteriskCharacterWhereArgumentIsNull() {
        assertEquals("SELECT *",
            Select.newInstance(null).get());
    }
}
