package com.tshepo.SPRING.BOOT.PART1.service;

import com.tshepo.SPRING.BOOT.PART1.Dao.FakeRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    FakeRepositoryInterface fakeRepository;

    // add user by calling insertUser from Fake Repository class
    @Override
    public String addUser(long userId, String userName, String userSurname) throws NoSuchMethodException {
        System.out.println(fakeRepository.insertUser(1,"Dazy","") + " added");
        return null;
    }

    // remove user by calling deleteUser from Fake Repository class
    @Override
    public String removeUser(long userId) {
        System.out.println(fakeRepository.deleteUser(1) + " removed");
        return null;
    }

    // find user by calling getUser from Fake Repository class
    @Override
    public String getUser(long userId) {
        System.out.println("Hello " + fakeRepository.findUserById(1));
        return null;
    }
}

