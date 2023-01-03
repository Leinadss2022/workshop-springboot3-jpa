package com.projetospring.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.portifolio.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
