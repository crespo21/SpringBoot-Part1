package com.tshepo.SPRING.BOOT.PART1;
import com.tshepo.SPRING.BOOT.PART1.Dao.FakeRepository;
import com.tshepo.SPRING.BOOT.PART1.service.UserServiceImplementation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserServiceImplementationTest {

    @Test
    public void testInsertUser() {
        assertThat(Boolean.parseBoolean(
                new FakeRepository().insertUser(1,
                        "theo","park") + " is entered"));
    }

    @Test
    public void deleteUserTest(){
        assertThat(Boolean.parseBoolean(new FakeRepository().deleteUser(1)+" is removed"));
    }

    @Test
    public void UserTest(){
        assertThat(Boolean.parseBoolean(String.valueOf(new UserServiceImplementation().getUser(1))));
    }
}
