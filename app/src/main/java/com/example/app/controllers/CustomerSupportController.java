package com.example.app.controllers;

import com.example.app.dto.CreateRefundDto;
import com.example.app.dto.FeedbackDto;
import com.example.app.dto.MessageDto;
import com.example.app.dto.RefundDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "customer-support", produces = "application/json")
public class CustomerSupportController {

    @PostMapping("feedback")
    public ResponseEntity<?> provideFeedback(@RequestBody FeedbackDto feedbackDto) {
        return null;
    }
    @GetMapping("feedback/delivery")
    public ResponseEntity<?> getDeliveriesFeedbacks() { return null; }

    @GetMapping("feedback/products")
    public ResponseEntity<?> getProductsFeedbacks() { return null; }

    @PostMapping("refund")
    public ResponseEntity<?> createRefundRequest(@RequestBody CreateRefundDto refundDto) { return null; }

    @PutMapping("refund/{requestId}/edit")
    public ResponseEntity<?> updateRefundRequest(@RequestBody RefundDto refundDto) { return null; }

    @PutMapping("refund/{requestId}/finalize")
    public ResponseEntity<?> finalizeRefundRequest(@PathVariable String requestId) { return null; }

    @GetMapping("refund/{requestId}/downloadInvoice")
    public ResponseEntity<?> downloadRefundInvoice(@PathVariable String requestId) { return null; }

    @PostMapping("chat")
    public ResponseEntity<?> createChat(@RequestBody String userId) { return null; }

    @PostMapping("chat/{chatId}")
    public ResponseEntity<?> sendMessage(@RequestBody MessageDto messageDto) { return null; }

}
