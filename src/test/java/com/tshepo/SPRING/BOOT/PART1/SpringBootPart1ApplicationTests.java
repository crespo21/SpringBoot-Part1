package com.tshepo.SPRING.BOOT.PART1;

import com.tshepo.SPRING.BOOT.PART1.Dao.FakeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootConfiguration
class SpringBootPart1ApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void testInsertUser() {
		assertThat(Boolean.parseBoolean(new FakeRepository()
				.insertUser(1,
						"theo","park") + " is entered"));
	}
	@Test
	public void deleteUserTest(){
		assertThat(Boolean.parseBoolean(new FakeRepository()
				.deleteUser(1)+" is removed"));
	}
	@Test
	public void UserTest(){
		assertThat(Boolean.parseBoolean(String.valueOf(new FakeRepository()
				.findUserById(1))));
	}
}
