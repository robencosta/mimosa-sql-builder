package com.robencosta.query.mimosaquerybuilder.util;

import com.robencosta.query.mimosaquerybuilder.constant.SpecialCharacters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ArgumentValidator {

    private ArgumentValidator() {}

    public static String getArgumentsFromTables(List<String> tables) {

        if (listIsNullOrListIsEmpty(tables)) {
            return SpecialCharacters.EMPTY.toString();
        }

        if (listHasOnlyOneItem(tables)) {
            return tables.get(0);
        }

        return SpecialCharacters.EMPTY.toString();
    }

    public static String getArgumentsFromColumns(List<String> columns) {

        if (listIsNullOrListIsEmpty(columns)) {
            return SpecialCharacters.ASTERISK.toString();
        }

        if (listHasOnlyOneItem(columns)) {
            return columns.get(0);
        }

        return SplitStringColumns.split(columns);
    }

    public static List<String> getListFromArray(String... args) {

        if (arrayIsNullOrArrayIsEmpty(args)) {
          return Collections.emptyList();
        }

        return Arrays.asList(args);
    }

    private static boolean listIsNullOrListIsEmpty(List<String> listOfValues) {
        return !Optional.ofNullable(listOfValues).isPresent() ||
                listOfValues.isEmpty();
    }

    private static boolean arrayIsNullOrArrayIsEmpty(String... listOfValues) {

        return !Optional.ofNullable(listOfValues).isPresent() ||
              listOfValues.length == 0;
    }

    private static boolean listHasOnlyOneItem(List<String> listOfValues) {
        return (listOfValues.size() == 1);
    }
}
