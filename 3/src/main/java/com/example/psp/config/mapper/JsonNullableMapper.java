package com.example.psp.config.mapper;

import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.stereotype.Component;

@Component
public class JsonNullableMapper {

    public <T> JsonNullable<T> wrap(T source) {
        return JsonNullable.of(source);
    }

    public <T> T unwrap(JsonNullable<T> source) { //TODO: look for String map from Justas
        return source.orElse(null);
    }
}
