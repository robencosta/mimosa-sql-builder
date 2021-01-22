package com.robencosta.query.builder.helper;

import java.util.Arrays;

public class JoinStringColumns {

    private JoinStringColumns() {}

    public static String joinAll(String... columns) {

        StringBuilder builder = new StringBuilder();

        Arrays.asList(columns).stream().forEach(builder::append);

        return builder.toString();
    }
}
