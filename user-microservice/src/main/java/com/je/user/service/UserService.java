package com.je.user.service;

import com.je.user.entity.User;

public interface UserService {
    User saveUser(User user);

    User findByUserId(Long userId);
}
