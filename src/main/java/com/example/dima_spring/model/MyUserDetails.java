package com.example.dima_spring.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String SecondNmae;
    private String userName;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondNmae() {
        return SecondNmae;
    }

    public void setSecondNmae(String secondNmae) {
        SecondNmae = secondNmae;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
