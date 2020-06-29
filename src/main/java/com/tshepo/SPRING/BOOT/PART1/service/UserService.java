package com.tshepo.SPRING.BOOT.PART1.service;

public interface UserService {
    String addUser(int userId, String userName, String userSurname) throws NoSuchMethodException;
    String getUser(int userId);
    String removeUser(int userId);
}
