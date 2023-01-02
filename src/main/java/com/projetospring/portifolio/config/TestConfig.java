package com.projetospring.portifolio.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetospring.portifolio.entities.Order;
import com.projetospring.portifolio.entities.User;
import com.projetospring.portifolio.repositories.OrderRepository;
import com.projetospring.portifolio.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private OrderRepository oderRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Eliciane Santos", "elicianers@gmail.com", "984390110", "123456");
		User u2 = new User(null, "Fernanda Ruskowisk", "fssruskoski@hotmail.com", "991174345", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

		userRepository.saveAll(Arrays.asList(u1,u2));
		oderRepository.saveAll(Arrays.asList(o1, o2,o3));
	}
	
	
	
}



