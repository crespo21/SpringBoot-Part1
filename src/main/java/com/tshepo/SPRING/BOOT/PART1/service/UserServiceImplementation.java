package com.tshepo.SPRING.BOOT.PART1.service;

import com.tshepo.SPRING.BOOT.PART1.Dao.FakeRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    final
    FakeRepository fakeRepository;
    public UserServiceImplementation(FakeRepository fakeRepository) {
        this.fakeRepository = fakeRepository;
    }

    // add user by calling insertUser from Fake Repository class
    @Override
    public  String addUser(int userId, String userName, String userSurname) {
        return  fakeRepository.insertUser(userId,userName,userSurname);
    }

    // find user by calling getUser from Fake Repository class
    @Override
    public  String getUser(int userId) {
        return fakeRepository.findUserById(userId);
    }

    // remove user by calling deleteUser from Fake Repository class
    @Override
    public String removeUser(int userId) {
        return  fakeRepository.deleteUser(userId);
    }
}

