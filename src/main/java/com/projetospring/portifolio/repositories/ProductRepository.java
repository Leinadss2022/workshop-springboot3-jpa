package com.projetospring.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.portifolio.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
