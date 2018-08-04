package com.pingsunyi.techblog.service;

import com.pingsunyi.techblog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
