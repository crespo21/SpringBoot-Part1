package com.tshepo.SPRING.BOOT.PART1.service;

public interface UserService {

    String insertUser(int userId, String userName, String userSurname) throws NoSuchMethodException;
    String findUserById(int userId);
    String deleteUser(int userId);
    String User(int userId);
}
