package com.robencosta.query.mimosaquerybuilder.util;

import java.util.Arrays;

public final class JoinStringColumns {

    private JoinStringColumns() {}

    public static String joinAll(String... columnsOrOtherArgs) {

        StringBuilder stringBuilder = new StringBuilder();

        Arrays.asList(columnsOrOtherArgs)
              .forEach(stringBuilder::append);

        return stringBuilder.toString();
    }
}
