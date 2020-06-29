package com.tshepo.SPRING.BOOT.PART1.Dao;

public interface FakeRepositoryInterface {
    String insertUser(int userId, String userName, String userSurname) throws NoSuchMethodException;
    String findUserById(int userId);
    String deleteUser(int userId);
}
