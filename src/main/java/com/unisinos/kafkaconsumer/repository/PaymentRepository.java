package com.unisinos.kafkaconsumer.repository;

import com.unisinos.kafkaconsumer.model.OrderModel;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<OrderModel, Long> {
    OrderModel findOrderModelById(Long id);

}
