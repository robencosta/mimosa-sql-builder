package com.robencosta.query.mimosaquerybuilder.constant;

import com.robencosta.query.mimosaquerybuilder.constant.SqlKeyWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqlKeyWordsTest {

    @Test
    void shouldReturnsSelectKeywordDefaultValue() {
        assertEquals("SELECT", SqlKeyWords.SELECT.toString());
    }

    @Test
    void shouldReturnsUpdateKeywordDefaultValue() {
        assertEquals("UPDATE", SqlKeyWords.UPDATE.toString());
    }

    @Test
    void shouldReturnsInsertKeywordDefaultValue() {
        assertEquals("INSERT", SqlKeyWords.INSERT.toString());
    }

    @Test
    void shouldReturnsDeleteKeywordDefaultValue() {
        assertEquals("DELETE", SqlKeyWords.DELETE.toString());
    }

    @Test
    void shouldReturnsSelectKeywordCaptalizeValue() {
        assertEquals("Select", SqlKeyWords.SELECT.captalize());
    }
}
