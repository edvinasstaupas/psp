package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets PaymentType
 */
public enum PaymentType {

    CARD(0),

    CASH(1),

    BANK_TRANSACTION(2),

    STORE_CREDIT(3),

    GIFT_CARD(4);

    private final Integer value;

    PaymentType(Integer value) {
        this.value = value;
    }

    @JsonCreator
    public static PaymentType fromValue(Integer value) {
        for (PaymentType b : PaymentType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @JsonValue
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

