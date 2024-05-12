package com.example.springmultipleprofiledemo;

import com.example.springmultipleprofiledemo.entity.User;
import com.example.springmultipleprofiledemo.repo.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMultipleprofileDemoApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringMultipleprofileDemoApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		User user = new User();

		user.setCity("Varanasi");
		user.setName("Nitin Jain");
		user.setStatus("I am DevOps Person");

		User user1 = userRepository.save(user);

		System.out.println(user1);


	}

}
