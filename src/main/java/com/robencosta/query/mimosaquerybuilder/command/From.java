package com.robencosta.query.builder.command;

import com.robencosta.query.builder.constant.SpecialCharacters;
import com.robencosta.query.builder.constant.SqlKeyWords;
import com.robencosta.query.builder.helper.JoinStringColumns;
import com.robencosta.query.builder.parameter.ArgumentValidator;

import java.util.Arrays;
import java.util.List;

public final class From implements SqlCommand {

    private final List<String> tables;

    private From(String... tables) {
        this.tables = Arrays.asList(tables);
    }

    @Override
    public String get() {

        return JoinStringColumns.joinAll(
             SpecialCharacters.SPACE.toString(),
             SqlKeyWords.FROM.toString(),
             SpecialCharacters.SPACE.toString(),
             ArgumentValidator.getArgumentsFromTables(tables)
        );
    }

    public static SqlCommand newInstance(String... args) {
        return new From(args);
    }
}
