package com.example.restservice.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    //根据ID查询
    @Query(value = "select * from USER_TABLE where USER_ID=:userId", nativeQuery = true)
    User findByUserId(Integer userId);
}
