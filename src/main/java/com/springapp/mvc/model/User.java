package com.springapp.mvc.model;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by User on 19.07.2017.
 */

@javax.persistence.Entity
@Table(appliesTo = "users")
public class User {
    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name ="password")
    private String password;

    public User() {
    }

    public User(Long id, String name, String password) {
        this.id=id;
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public boolean checkLogin(String login){
//        if (this.login.equals(login)) return true;
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!name.equals(user.name)) return false;
        return password.equals(user.password);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }

    public String toString(){
        return name;
    }


}
