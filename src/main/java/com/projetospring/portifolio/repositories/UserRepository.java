package com.projetospring.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.portifolio.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
