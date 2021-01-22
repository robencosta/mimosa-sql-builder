package com.robencosta.query.builder.command;

import com.robencosta.query.builder.constant.SpecialCharacters;
import com.robencosta.query.builder.constant.SqlKeyWords;
import com.robencosta.query.builder.helper.JoinStringColumns;
import com.robencosta.query.builder.parameter.ArgumentValidator;

import java.util.List;

public final class Select implements SqlCommand {

    private final List<String> columns;

    private Select(String... columns) {
        this.columns = ArgumentValidator.getListFromArray(columns);
    }

    @Override
    public String get() {

        return JoinStringColumns.joinAll(
            SqlKeyWords.SELECT.toString(),
            SpecialCharacters.SPACE.toString(),
            ArgumentValidator.getArgumentsFromColumns(columns)
        );
    }

    public static SqlCommand newInstance(String... columns) {
        return new Select(columns);
    }
}
