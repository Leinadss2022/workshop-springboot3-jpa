package com.projetospring.portifolio.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetospring.portifolio.entities.Category;
import com.projetospring.portifolio.entities.Order;
import com.projetospring.portifolio.entities.User;
import com.projetospring.portifolio.entities.enums.OrderStatus;
import com.projetospring.portifolio.repositories.CategoryRepository;
import com.projetospring.portifolio.repositories.OrderRepository;
import com.projetospring.portifolio.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private OrderRepository oderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers"); 
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		
		User u1 = new User(null, "Eliciane Santos", "elicianers@gmail.com", "984390110", "123456");
		User u2 = new User(null, "Fernanda Ruskowisk", "fssruskoski@hotmail.com", "991174345", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMANT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u2);

		userRepository.saveAll(Arrays.asList(u1,u2));
		oderRepository.saveAll(Arrays.asList(o1, o2,o3));
	}
	
	
	
}



