package com.robencosta.query.builder.constant;

public enum SpecialCharacters {

    SPACE(" "),

    COMMA(","),

    SEMICOLON(";"),

    ASTERISK("*"),

    WILDCARD("?"),

    EQUAL("="),

    EMPTY("");

    private String value;

    SpecialCharacters(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
