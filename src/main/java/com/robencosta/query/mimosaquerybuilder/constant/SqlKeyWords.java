package com.robencosta.query.builder.constant;

public enum SqlKeyWords {

    SELECT("Select"),

    DELETE("Delete"),

    FROM("From"),

    UPDATE("Update"),

    INSERT("Insert"),

    WHERE("Where"),

    IN("In"),

    JOIN("Join"),

    INNER("Inner"),

    OUT("Out"),

    LEFT("Left");

    private final String capitalize;

    SqlKeyWords(String capitalize) {
        this.capitalize = capitalize;
    }

    public String captalize() {
        return capitalize;
    }

    public String lower() {
        return this.toString()
                   .toLowerCase();
    }
}
