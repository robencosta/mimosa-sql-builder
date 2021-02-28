package com.robencosta.query.mimosaquerybuilder.util;

import java.util.Arrays;

public class JoinStringColumns {

    private JoinStringColumns() {}

    public static String joinAll(String... columns) {

        StringBuilder builder = new StringBuilder();

        Arrays.asList(columns).stream().forEach(builder::append);

        return builder.toString();
    }
}
