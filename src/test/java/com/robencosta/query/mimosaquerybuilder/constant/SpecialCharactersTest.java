package com.robencosta.query.mimosaquerybuilder.constant;

import com.robencosta.query.mimosaquerybuilder.constant.SpecialCharacters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpecialCharactersTest {

    @Test
    void shouldReturnsTheValueOfASemicolonCharacter() {
        assertEquals(";", SpecialCharacters.SEMICOLON.toString());
    }

    @Test
    void shouldReturnsTheValueOfACommaCharacter() {
        assertEquals(",", SpecialCharacters.COMMA.toString());
    }

    @Test
    void shouldReturnsTheValueOfASpaceCharacter() {
        assertEquals(" ", SpecialCharacters.SPACE.toString());
    }

    @Test
    void shouldReturnsTheValueOfAAsteriskCharacter() {
        assertEquals("*", SpecialCharacters.ASTERISK.toString());
    }

    @Test
    void shouldReturnsTheValueOfAWildcardCharacter() {
        assertEquals("?", SpecialCharacters.WILDCARD.toString());
    }

    @Test
    void shouldReturnsTheValueOfAEqualCharacter() {
        assertEquals("=", SpecialCharacters.EQUAL.toString());
    }

    @Test
    void shouldReturnsTheValueOfAEmptyCharacter() {
        assertEquals("", SpecialCharacters.EMPTY.toString());
    }
}
