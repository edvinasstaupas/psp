package com.example.app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FeedbackDto {
    private String orderId;
    private Integer rating;
    private String moreInfo;
    private FeedbackType feedbackType;
}
