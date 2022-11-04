package com.example.demo.security.dao.impl;

import com.example.demo.security.dao.IUserDao;
import com.example.demo.security.model.ApplicationUser;
import com.example.demo.security.model.role.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryUserDao implements IUserDao {
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public InMemoryUserDao(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<ApplicationUser> selectUserByUsername(String username) {
        return getUsers().stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }

    private List<ApplicationUser> getUsers() {
        return new ArrayList<>() {{
            add(new ApplicationUser(
                    "someuser",
                    passwordEncoder.encode("password"),
                    UserRole.GUEST.getGrantedAuthorities(),
                    true,
                    true,
                    true,
                    true
            ));
            add(new ApplicationUser(
                    "admin",
                    passwordEncoder.encode("admin"),
                    UserRole.ADMIN.getGrantedAuthorities(),
                    true,
                    true,
                    true,
                    true
            ));
            add(new ApplicationUser(
                    "trainee",
                    passwordEncoder.encode("trainee"),
                    UserRole.TRAINEE.getGrantedAuthorities(),
                    true,
                    true,
                    true,
                    true
            ));
        }};
    }
}
