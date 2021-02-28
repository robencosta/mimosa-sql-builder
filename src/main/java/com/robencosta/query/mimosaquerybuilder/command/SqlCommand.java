package com.robencosta.query.mimosaquerybuilder.command;

import com.robencosta.query.mimosaquerybuilder.constant.SpecialCharacters;

public interface SqlCommand {

    String get();

    default String getSemicolon() {
        return get() + SpecialCharacters.SEMICOLON.toString();
    }
}
