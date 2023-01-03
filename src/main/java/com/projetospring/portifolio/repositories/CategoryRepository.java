package com.projetospring.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.portifolio.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
