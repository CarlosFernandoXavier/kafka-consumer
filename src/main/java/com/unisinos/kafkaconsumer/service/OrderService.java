package com.unisinos.kafkaconsumer.service;

import com.unisinos.kafkaconsumer.model.OrderModel;
import com.unisinos.kafkaconsumer.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class OrderService {

    @Autowired
    PaymentRepository paymentRepository;

    OrderModel findOrderModelById(Long id) {
        try {
            return paymentRepository.findOrderModelById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    OrderModel updateOrderModel(OrderModel orderModel) {
        try {
            return paymentRepository.save(orderModel);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
