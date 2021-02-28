package com.robencosta.query.mimosaquerybuilder;

import com.robencosta.query.mimosaquerybuilder.command.Delete;
import com.robencosta.query.mimosaquerybuilder.command.From;
import com.robencosta.query.mimosaquerybuilder.command.Select;
import com.robencosta.query.mimosaquerybuilder.command.SqlCommand;

import java.util.ArrayList;
import java.util.List;

public final class SQL {

    private final List<SqlCommand> sqlCommand;
    private final StringBuilder stringBuilder;

    private SQL(List<SqlCommand> sqlCommand, StringBuilder stringBuilder) {
        this.sqlCommand = sqlCommand;
        this.stringBuilder = stringBuilder;
    }

    public SQL select(String... columnsOrOtherArgs) {
        this.sqlCommand.add(Select.newInstance(columnsOrOtherArgs));
        return this;
    }

    public SQL from(String... tablesOrOtherArgs) {
        this.sqlCommand.add(From.newInstance(tablesOrOtherArgs));
        return this;
    }

    public SQL delete() {
        this.sqlCommand.add(Delete.newInstance());
        return this;
    }

    public String build() {
        sqlCommand.forEach(command -> stringBuilder.append(command.get()));
        return stringBuilder.toString();
    }

    public static SQL builder() {
        return new SQL(new ArrayList<>(), new StringBuilder());
    }
}
