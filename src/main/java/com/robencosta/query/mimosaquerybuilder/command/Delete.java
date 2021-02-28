package com.robencosta.query.mimosaquerybuilder.command;

import com.robencosta.query.mimosaquerybuilder.constant.SpecialCharacters;
import com.robencosta.query.mimosaquerybuilder.constant.SqlKeyWords;
import com.robencosta.query.mimosaquerybuilder.util.JoinStringColumns;

public class Delete implements SqlCommand {

    @Override
    public String get() {

        return (
            JoinStringColumns.joinAll(
                SqlKeyWords.DELETE.toString(),
                SpecialCharacters.SPACE.toString(),
                SqlKeyWords.FROM.toString(),
                SpecialCharacters.SPACE.toString()
            )
        );
    }

    public static SqlCommand newInstance() {
        return new Delete();
    }
}
