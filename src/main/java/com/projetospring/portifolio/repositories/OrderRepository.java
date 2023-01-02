package com.projetospring.portifolio.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.portifolio.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {


		
	}


