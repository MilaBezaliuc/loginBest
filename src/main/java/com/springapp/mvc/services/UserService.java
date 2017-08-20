package com.springapp.mvc.services;

import com.springapp.mvc.dao.UserDao;
import com.springapp.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by vasilii on 014 14.08.17.
 */
@Service
@Transactional //this annotation says that all methods of this bean will open transactions in DB
public class UserService {
//    Pls do not forget to leave empty string here
    @Autowired
    private UserDao userDao;

//    public  boolean checkUser(User user) {
//        for (User checkUser : users.getUsers()) {
//            if (checkUser.getName().equals(user.getName())&&checkUser.getPassword().equals(user.getPassword()))
//                return true;
//        }
//        return false;
//    }

    public  void addUser(User user) {
        userDao.addUser(user);
    }

//    public List<User> getUsers(){
//        return users.getUsers();
//    }
//
//    public void deleteUser(User user){
//        users.deleteUser(user);
//        System.out.println("UserService: Deleted");
//    }
//
//    public void deleteUserByName(String userName){
//        users.deleteUserByName(userName);
//
//    }
//
//    public  boolean findUserByName(String userName) {
//
//        for (User findUser : users.getUsers()) {
//            if (findUser.getName().equals(userName))
//                return true;
//        }
//        return false;
//    }

//    This works for hibbernate without spring. When you use spring it makes all this monkey work instead of you. Enjoy the magic
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
