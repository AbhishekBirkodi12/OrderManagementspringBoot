package com.onlineorder.controller;

import com.onlineorder.entity.OrderManager;
import com.onlineorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orderManager")
    public OrderManager createOrder(@RequestBody OrderManager orderManager) {
        return orderService.createOrder(orderManager);
    }

    @GetMapping("/orderManager/{id}")
    public Optional<OrderManager> getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }

}
