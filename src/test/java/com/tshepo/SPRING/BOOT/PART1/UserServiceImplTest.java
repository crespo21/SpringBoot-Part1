package com.tshepo.SPRING.BOOT.PART1;
import com.tshepo.SPRING.BOOT.PART1.model.User;
import org.junit.jupiter.api.Test;

public class UserServiceImplTest {

    @Test
    public void testInsertUser() {
        assertArrayEquals(new User(1,"tshepo","seleke"));

    }

    private void assertArrayEquals(User user) {
    }
}
