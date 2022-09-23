package com.example.restservice.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<UserTable, Integer> {
    //根据ID查询
//    @Query(value = "select User from User u where u.userId=:userId", nativeQuery = true)
    UserTable findByUserId(Integer userId);
}
