package com.robencosta.query.builder.command;

import com.robencosta.query.builder.constant.SpecialCharacters;

public interface SqlCommand {

    String get();

    default String getSemicolon() {
        return get() + SpecialCharacters.SEMICOLON.toString();
    }
}
