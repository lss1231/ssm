package com.i7.dao;

import com.i7.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public int addUser(User user);
    public User getUserById(int id);
    public int deleteUserById(int id);
}
