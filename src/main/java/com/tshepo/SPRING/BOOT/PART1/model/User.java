package com.tshepo.SPRING.BOOT.PART1.model;
//Creating a table User with column rows
@Entity
public class User {
//    creating a primary on our User table
    @Id
    public int userId;
    public String userName;
    public String userSurname;

// Constructing class User
    public User(int userId, String userName, String userSurname) {
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public static String getUserName(String userName) { return userName; }
    public static String getUserSurname(String userSurname) {
        return userSurname;
    }

}
