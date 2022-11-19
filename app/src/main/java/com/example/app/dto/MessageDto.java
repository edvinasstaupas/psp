package com.example.app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MessageDto {
    private String userId;
    private String customerSupportId;
    private String content;
}
