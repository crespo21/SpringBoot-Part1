package com.tshepo.SPRING.BOOT.PART1.service;

import com.tshepo.SPRING.BOOT.PART1.Dao.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements FakeRepoInterface {


    @Autowired
    FakeRepoInterface fakeRepoInterface ;
    @Override
    public String insertUser(int userId, String userName, String userSurname) throws NoSuchMethodException {
        return fakeRepoInterface.insertUser(userId,userName,userSurname);
    }

    @Override
    public String findUserById(int userId) {
        return fakeRepoInterface.findUserById(userId);
    }

    @Override
    public String deleteUser(int userId) {
        return fakeRepoInterface.deleteUser(userId);
    }

    @Override
    public String User(int userId) {
        return fakeRepoInterface.User(userId);
    }
}
