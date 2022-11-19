package com.example.app.controllers;

import com.example.app.dto.CreateRefundDto;
import com.example.app.dto.FeedbackDto;
import com.example.app.dto.MessageDto;
import com.example.app.dto.RefundDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.app.dto.PersonalInformation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Customer support")
@RestController
@RequestMapping(value = "customer-support", produces = "application/json")
public class CustomerSupportController {

    @PostMapping("feedback")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<String> provideFeedback(@RequestBody FeedbackDto feedbackDto) {
        return null;
    }
    @GetMapping("feedback/delivery")
    public ResponseEntity<List<FeedbackDto>> getDeliveriesFeedbacks() { return null; }

    @GetMapping("feedback/products")
    public ResponseEntity<List<FeedbackDto>> getProductsFeedbacks() { return null; }

    @PostMapping("refund")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<String> createRefundRequest(@RequestBody CreateRefundDto refundDto) { return null; }

    @PutMapping("refund/{requestId}/edit")
    public ResponseEntity<Void> updateRefundRequest(@PathVariable String requestId, @RequestBody RefundDto refundDto) { return null; }

    @PutMapping("refund/{requestId}/finalize")
    public ResponseEntity<Void> finalizeRefundRequest(@PathVariable String requestId) { return null; }

    @GetMapping("refund/{requestId}/downloadInvoice")
    public ResponseEntity<RefundDto> downloadRefundInvoice(@PathVariable String requestId) { return null; }

    @PostMapping("chat")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<String> createChat(@RequestBody String userId) { return null; }

    @PostMapping("chat/{chatId}")
    public ResponseEntity<Void> sendMessage(@PathVariable String chatId, @RequestBody MessageDto messageDto) { return null; }

}
