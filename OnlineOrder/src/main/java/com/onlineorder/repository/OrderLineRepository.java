package com.onlineorder.repository;

import com.onlineorder.entity.Orderline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<Orderline, Integer> {
}
