package com.i7.service.ServiceIml;

import com.i7.dao.UserDao;
import com.i7.entity.User;
import com.i7.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public int deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }
}
