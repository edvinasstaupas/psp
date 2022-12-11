package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets OrderStatusTypes
 */
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

    @JsonCreator
    public static OrderStatusEnum fromValue(Integer value) {
        for (OrderStatusEnum b : OrderStatusEnum.values()) {
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

