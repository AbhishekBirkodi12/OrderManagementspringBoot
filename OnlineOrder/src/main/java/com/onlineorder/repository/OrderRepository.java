package com.onlineorder.repository;

import com.onlineorder.entity.OrderManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderManager,Integer> {

}
