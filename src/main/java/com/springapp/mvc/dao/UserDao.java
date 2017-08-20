package com.springapp.mvc.dao;

import com.springapp.mvc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by vasilii on 013 13.08.17.
 */

//Repository is intended to have access to database itself,
// so you have to autowire sessionfactory in each dao class.
@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

//    You have to delete this block, because your actual datasource is database
//    private static ArrayList<User> users =new ArrayList<>();
//    static {
//        users.add(new User(0l,"Vasea","pass") );
//        users.add(new User(1l,"Vovic","pass"));
//        users.add(new User(2l, "Misha","pass"));
//    }
//    public UserDao() {
//          You don't need this constructor neither in Dao, nor in Service or Controller classes.
//    Default constructor is mandatory only in entity class
//    }

//    it is not a static methos for now.
    public void addUser(User user){
//        gets current opened session
        Session session = sessionFactory.getCurrentSession();
        session.persist(user); //save object to database
//        that's it. No more code is necessary here
    }

//    public static ArrayList<User> getUsers() {
//        return users;
//    }

//   You don't need this here
//    public String toString(){
//        StringBuilder allUsers = new StringBuilder();
//        for (User user : users) {
//            allUsers.append(user.getName());
//            allUsers.append(" ");
//        }
//        return  allUsers.toString();
//    }

//    public static void deleteUser(User user){
//        System.out.println("Users:"+user.getName()+" Deleted");
//        users.remove(user);
//
//    }
//
//    public static void deleteUserByName(String userName){
//        for (User user : users) {
//           if (user.getName().equals(userName)) {
//               System.out.println("Users:"+user.getName()+" Deleted");
//               users.remove(user);
//               break;
//           }
//        }
//    }
//
//    public static boolean isUser(User user){
//        return users.contains(user);
//    }

}
