package com.tshepo.SPRING.BOOT.PART1;

import com.tshepo.SPRING.BOOT.PART1.Dao.FakeRepository;
import com.tshepo.SPRING.BOOT.PART1.service.UserServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;

@SpringBootApplication
class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}


