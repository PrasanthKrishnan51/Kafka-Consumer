package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentConsumer {

    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void processPayment(String orderMessage) {

        System.out.println("💰 Payment Service received order: " + orderMessage);
    }
}
