package com.robencosta.query.mimosaquerybuilder;

import com.robencosta.query.mimosaquerybuilder.command.Delete;
import com.robencosta.query.mimosaquerybuilder.command.From;
import com.robencosta.query.mimosaquerybuilder.command.Select;
import com.robencosta.query.mimosaquerybuilder.command.SqlCommand;

import java.util.ArrayList;
import java.util.List;

public final class SQL {

    private final List<SqlCommand> sqlCommand = new ArrayList<>();
    private final StringBuilder builder = new StringBuilder();

    private SQL() {}

    public SQL select(String... columns) {
        this.sqlCommand.add(Select.newInstance(columns));
        return this;
    }

    public SQL from(String... columns) {
        this.sqlCommand.add(From.newInstance(columns));
        return this;
    }

    public SQL delete() {
        this.sqlCommand.add(Delete.newInstance());
        return this;
    }

    public String get() {
        sqlCommand.forEach(command -> builder.append(command.get()));
        return builder.toString();
    }

    public static SQL newQuery() {
        return new SQL();
    }
}
