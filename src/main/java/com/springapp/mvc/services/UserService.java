package com.springapp.mvc.services;

import com.springapp.mvc.datasource.Users;
import com.springapp.mvc.model.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vasilii on 014 14.08.17.
 */
@Service
public class UserService {
    @Autowired
    private Users users;

    public  boolean checkUser(User user) {
        for (User checkUser : users.getUsers()) {
            if (checkUser.getName().equals(user.getName())&&checkUser.getPassword().equals(user.getPassword()))
                return true;
        }
        return false;
    }

    public  void addUser(User user) {
        users.addUser(user);
    }

    public List<User> getUsers(){
        return users.getUsers();
    }

    public void deleteUser(User user){
        users.deleteUser(user);
        System.out.println("UserService: Deleted");
    }

    public void deleteUserByName(String userName){
        users.deleteUserByName(userName);

    }

    public  boolean findUserByName(String userName) {

        for (User findUser : users.getUsers()) {
            if (findUser.getName().equals(userName))
                return true;
        }
        return false;
    }
    /*
    public void addUserData(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        User contactEntity = new User();

        //contactEntity.setName(new java.util.Date());
        contactEntity.setId(5L);
        contactEntity.setName("Nick");
        contactEntity.setPassword("987");

        session.save(contactEntity);
        session.getTransaction().commit();

        session.close();
    }
    */
}
