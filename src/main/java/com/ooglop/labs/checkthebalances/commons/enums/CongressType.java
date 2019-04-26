package com.ooglop.labs.checkthebalances.commons.enums;

import lombok.Getter;

@Getter
public enum CongressType {
    HOUSE ("house"),
    SENATE ("senate");

    private String congressTypeString;

    CongressType(String congressTypeString) {
        this.congressTypeString = congressTypeString;
    }
}
