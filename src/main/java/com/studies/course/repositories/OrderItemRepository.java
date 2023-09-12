package com.studies.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studies.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
