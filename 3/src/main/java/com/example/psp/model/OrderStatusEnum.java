package com.example.psp.model;

public enum OrderStatusEnum {

    NEW(0),

    ACCEPTED(1),

    IN_PROGRESS(2),

    AWAITING_SHIPMENT(3),

    SHIPPED(4),

    AWAITING_PICKUP(5),

    COMPLETED(6),

    REJECTED(7),

    CANCELED(8),

    REFUNDED(9);

    private final Integer value;

    OrderStatusEnum(Integer value) {
        this.value = value;
    }

    public static com.example.psp.dto.OrderStatusEnum fromValue(Integer value) {
        for (com.example.psp.dto.OrderStatusEnum b : com.example.psp.dto.OrderStatusEnum.values()) {
            if (b.getValue().equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

