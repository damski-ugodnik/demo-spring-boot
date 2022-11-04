package com.example.demo.security.dao;

import com.example.demo.security.model.ApplicationUser;

import java.util.Optional;

public interface IUserDao {
    Optional<ApplicationUser> selectUserByUsername(String username);
}
