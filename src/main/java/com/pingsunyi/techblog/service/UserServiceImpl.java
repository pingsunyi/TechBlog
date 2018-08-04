package com.pingsunyi.techblog.service;

import com.pingsunyi.techblog.dao.UserRepository;
import com.pingsunyi.techblog.po.User;
import com.pingsunyi.techblog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
