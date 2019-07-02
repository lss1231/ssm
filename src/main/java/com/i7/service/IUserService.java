package com.i7.service;

import com.i7.entity.User;

public interface IUserService {
    public int addUser(User user);
    public User getUserById(int id);
    public int deleteUserById(int id);
}
