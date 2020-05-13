package com.tshepo.SPRING.BOOT.PART1;
import com.tshepo.SPRING.BOOT.PART1.Dao.FakeRepo;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserServiceImplTest {

    @Test
    public void testInsertUser() {
        assertThat(Boolean.parseBoolean(
                new FakeRepo().insertUser(1,
                        "theo","park") + " is entered"));
    }

    @Test
    public void testFindUserById(){
        assertThat(Boolean.parseBoolean(new FakeRepo().findUserById(1)));
    }

    @Test
    public void deleteUserTest(){
        assertThat(Boolean.parseBoolean(new FakeRepo().deleteUser(1)+" is removed"));
    }

    @Test
    public void UserTest(){
        assertThat(Boolean.parseBoolean("Hello " + new FakeRepo().User(1)));
    }
}
