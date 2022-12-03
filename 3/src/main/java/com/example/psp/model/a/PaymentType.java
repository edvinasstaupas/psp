package com.example.psp.model.a;

public enum PaymentType {

    NUMBER_0(0),

    NUMBER_1(1),

    NUMBER_2(2),

    NUMBER_3(3),

    NUMBER_4(4);

    private final Integer value;

    PaymentType(Integer value) {
        this.value = value;
    }

    public static PaymentType fromValue(Integer value) {
        for (PaymentType b : PaymentType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

