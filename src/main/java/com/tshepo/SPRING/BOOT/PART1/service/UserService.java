package com.tshepo.SPRING.BOOT.PART1.service;

public interface UserService {
    String addUser(long userId, String userName, String userSurname) throws NoSuchMethodException;
    String getUser(long userId);
    String removeUser(long userId);
}
