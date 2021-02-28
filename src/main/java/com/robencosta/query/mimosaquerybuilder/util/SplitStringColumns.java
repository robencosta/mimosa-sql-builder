package com.robencosta.query.mimosaquerybuilder.util;

import com.robencosta.query.mimosaquerybuilder.constant.SpecialCharacters;

import java.util.Arrays;
import java.util.List;

public final class SplitStringColumns {

    private SplitStringColumns() {}

    public static String split(List<String> args) {

        StringBuilder builder = new StringBuilder();

        if (args.size() > 1) {
            return getAnyColumns(builder, args);
        }

        Arrays.asList(args).stream().forEach(a -> {
            builder.append(a);
        });

        return builder.toString();
    }

    private static String getAnyColumns(StringBuilder builder, List<String> args) {

        args.stream().forEach(a -> {

            builder.append(a)
                   .append(SpecialCharacters.COMMA)
                   .append(SpecialCharacters.SPACE);
        });

        builder.deleteCharAt(builder.length() - 2);
        builder.deleteCharAt(builder.length() - 1);

        return builder.toString();
    }
}
