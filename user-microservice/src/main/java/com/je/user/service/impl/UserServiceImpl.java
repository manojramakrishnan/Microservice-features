package com.je.user.service.impl;

import com.je.user.dao.UserDAO;
import com.je.user.entity.User;
import com.je.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO dao;
    @Override
    public User saveUser(User user) {
        return dao.saveUser(user);
    }

    @Override
    public User findByUserId(Long userId) {
        return dao.findByUserId(userId);
    }
}
