package com.onlineorder.service;

import com.onlineorder.entity.OrderManager;
import com.onlineorder.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public OrderManager createOrder(OrderManager orderManager) {
        return orderRepository.save(orderManager);
    }

    public Optional<OrderManager> getOrderById(int id) {
      return orderRepository.findById(id);
    }
}
