package com.example.app.dto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StoreDto {
    private String name;
    private String description;
    private String workHours;
    private String address;
    private String contactInfo;
}
