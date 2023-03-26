package com.je.user.dao.impl;

import com.je.user.dao.UserDAO;
import com.je.user.entity.User;
import com.je.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO {

    @Autowired
    private UserRepository repo;
    @Override
    public User saveUser(User user) {
        return repo.save(user);
    }

    @Override
    public User findByUserId(Long userId) {
        return repo.findByUserId(userId);
    }
}
