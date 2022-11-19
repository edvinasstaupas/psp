package com.example.app.controllers;

import com.example.app.dto.CreateRefundDto;
import com.example.app.dto.FeedbackDto;
import com.example.app.dto.MessageDto;
import com.example.app.dto.RefundDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "customer-support", produces = "application/json")
public class CustomerSupportController {

    @PostMapping("feedback")
    public ResponseEntity<String> provideFeedback(@RequestBody FeedbackDto feedbackDto) {
        return null;
    }
    @GetMapping("feedback/delivery")
    public ResponseEntity<List<FeedbackDto>> getDeliveriesFeedbacks() { return null; }

    @GetMapping("feedback/products")
    public ResponseEntity<List<FeedbackDto>> getProductsFeedbacks() { return null; }

    @PostMapping("refund")
    public ResponseEntity<String> createRefundRequest(@RequestBody CreateRefundDto refundDto) { return null; }

    @PutMapping("refund/{requestId}/edit")
    public ResponseEntity<Void> updateRefundRequest(@PathVariable String requestId, @RequestBody RefundDto refundDto) { return null; }

    @PutMapping("refund/{requestId}/finalize")
    public ResponseEntity<Void> finalizeRefundRequest(@PathVariable String requestId) { return null; }

    @GetMapping("refund/{requestId}/downloadInvoice")
    public ResponseEntity<RefundDto> downloadRefundInvoice(@PathVariable String requestId) { return null; }

    @PostMapping("chat")
    public ResponseEntity<String> createChat(@RequestBody String userId) { return null; }

    @PostMapping("chat/{chatId}")
    public ResponseEntity<Void> sendMessage(@PathVariable String chatId, @RequestBody MessageDto messageDto) { return null; }

}
