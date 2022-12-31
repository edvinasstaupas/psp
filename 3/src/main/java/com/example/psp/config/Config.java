package com.example.psp.config;

import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
        @Bean
        public JsonNullableModule jsonNullableModule() {
            return new JsonNullableModule();
        }
}
