package com.tshepo.SPRING.BOOT.PART1;

import com.tshepo.SPRING.BOOT.PART1.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest(classes = Application.class)
class SpringBootPart1ApplicationTests {

	@Autowired
	UserService userService;
	@Test
	void contextLoads() throws NoSuchMethodException {
		Assert.isTrue(true, userService.addUser(1,"",""));
		Assert.isTrue(true, userService.removeUser(1));
		Assert.isTrue(true, userService.getUser(1));
	}

}
