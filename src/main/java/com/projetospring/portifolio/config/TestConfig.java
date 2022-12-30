package com.projetospring.portifolio.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetospring.portifolio.entities.User;
import com.projetospring.portifolio.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Eliciane Santos", "elicianers@gmail.com", "984390110", "123456");
		User u2 = new User(null, "Fernanda Ruskowisk", "fssruskoski@hotmail.com", "991174345", "123456"); 

		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
	
}



