//package com.example.restservice.entity;
//
//import javax.persistence.*;
//
//
//@Table
//@Entity
//public class UserTable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Integer id;
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name ="USER_ID")
//    private Integer userId;
//    @Column(name = "USER_NAME")
//    private String userName;
//    @Column(name = "USER_SEX")
//    private String userSex;
//    @Column(name = "USER_AGE")
//    private Integer userAge;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserSex() {
//        return userSex;
//    }
//
//    public void setUserSex(String userSex) {
//        this.userSex = userSex;
//    }
//
//    public Integer getUserAge() {
//        return userAge;
//    }
//
//    public void setUserAge(Integer userAge) {
//        this.userAge = userAge;
//    }
//}
