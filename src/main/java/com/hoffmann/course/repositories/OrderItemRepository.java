package com.hoffmann.course.repositories;

import com.hoffmann.course.entities.OrderItem;
import com.hoffmann.course.entities.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
}
