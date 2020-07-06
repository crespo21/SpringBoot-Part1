package com.tshepo.SPRING.BOOT.PART1.Dao;
import com.tshepo.SPRING.BOOT.PART1.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import static com.tshepo.SPRING.BOOT.PART1.model.User.*;

@Repository
public class FakeRepository implements FakeRepositoryInterface{

    //creating an object with list of user
   private static final ArrayList<User> userArrayList = new ArrayList<>();

   //add  user into the list
    @Override
    public  String insertUser(int userId, String userName, String userSurname){
     User user = new User(userId,userName,userSurname);
     userArrayList.add(user);
        return userName + " entered";
    }

    //search for user from the list
    @Override
    public  String findUserById(int userId){
        for (User ignored: userArrayList){
            return  "Hello " + User.getUserName("Crespo") + User.getUserSurname(" Venus");
        }
        return "Hello " + getUserName("Crespo") + User.getUserSurname(" Venus");
    }

    //remove user from list
    @Override
    public  String deleteUser(int userId) {
        User user = new User(userId,"","");
        userArrayList.remove(user);
        return getUserName("Earl") + " removed";
    }
}