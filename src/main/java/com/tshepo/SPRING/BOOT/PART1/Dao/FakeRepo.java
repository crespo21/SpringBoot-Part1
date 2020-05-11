package com.tshepo.SPRING.BOOT.PART1.Dao;
import com.tshepo.SPRING.BOOT.PART1.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public  class FakeRepo implements FakeRepoInterface{
   private static ArrayList<User> usr = new ArrayList<>();
   
    @Override
    public String insertUser(int userId, String userName, String userSurname) {
     User user = new User(userId,userName,userSurname);
     usr.add(user);
        return userName + " entered";
    }

    @Override
    public String findUserById(int userId) {
        for (User userArray: usr ) {
            if (userArray.getUserId() == userId){
                return userArray.getUserName() + "";
            }
        }
        return null;
    }

    @Override
    public String deleteUser(int userId) {
        for (User userArray : usr) {
            if (userArray.getUserId() == userId){
                usr.remove(userId);
                return userId + " removed";
            }
        }
        return null;
    }

    @Override
    public String User(int userId) {
        for (User userArray : usr) {
            if (userArray.getUserId() == userId){
                usr.remove(userId);
                return "Hello " + userId;
            }
        }
        return null;
    }
}
