package com.unisinos.kafkaconsumer.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unisinos.kafkaconsumer.model.PaymentModel;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Consumer {

    ObjectMapper objectMapper;
    OrderService orderService;

    @KafkaListener(topics = "pagamento", groupId = "group_id", containerFactory = "paymentKafkaListenerFactory")
    public void consume(String json) {
        try {
            var paymentModel = objectMapper.readValue(json, PaymentModel.class);

            var orderModel = orderService.findOrderModelById(paymentModel.getOrderId());
            orderModel.setStatus(paymentModel.getStatus());

            orderService.updateOrderModel(orderModel);
            System.out.println("Consumed user: " + json);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
