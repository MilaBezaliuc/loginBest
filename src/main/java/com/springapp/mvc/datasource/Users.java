package com.springapp.mvc.datasource;

import com.springapp.mvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by vasilii on 013 13.08.17.
 */
@Repository
public class Users {
    private static ArrayList<User> users =new ArrayList<>();
    static {
        users.add(new User(0l,"Vasea","pass") );
        users.add(new User(1l,"Vovic","pass"));
        users.add(new User(2l, "Misha","pass"));
    }
    public Users() {
    }

    public static void addUser(User user){
        users.add(user);
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public String toString(){
        StringBuilder allUsers = new StringBuilder();
        for (User user : users) {
            allUsers.append(user.getName());
            allUsers.append(" ");
        }
        return  allUsers.toString();
    }

    public static void deleteUser(User user){
        System.out.println("Users:"+user.getName()+" Deleted");
        users.remove(user);

    }

    public static void deleteUserByName(String userName){
        for (User user : users) {
           if (user.getName().equals(userName)) {
               System.out.println("Users:"+user.getName()+" Deleted");
               users.remove(user);
               break;
           }
        }
    }

    public static boolean isUser(User user){
        return users.contains(user);
    }

}
