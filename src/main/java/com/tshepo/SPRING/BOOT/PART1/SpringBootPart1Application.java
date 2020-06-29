package com.tshepo.SPRING.BOOT.PART1;

import com.tshepo.SPRING.BOOT.PART1.Dao.FakeRepository;
import com.tshepo.SPRING.BOOT.PART1.service.UserServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;

@SpringBootApplication
class Application {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		application.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
		application.run(args);
		System.out.println("\n"+"***User contents From Fake Repository*****");
		FakeRepository fakeRepository = new FakeRepository();
			System.out.println(fakeRepository.insertUser(1, "Lesley","jones"));
		    System.out.println(fakeRepository.findUserById(1));
		    System.out.println(fakeRepository.deleteUser(1)+"\n");
			System.out.println("****User contents From User Service Implementation****");
		UserServiceImplementation userServiceImplementation = new  UserServiceImplementation(fakeRepository);
		    System.out.println(userServiceImplementation.addUser(1, "Lesley","jones"));
			System.out.println(userServiceImplementation.removeUser(1));
		    System.out.println(userServiceImplementation.getUser(1));
	}
}


