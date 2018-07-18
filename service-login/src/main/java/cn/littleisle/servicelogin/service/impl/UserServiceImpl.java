package cn.littleisle.servicelogin.service.impl;

import cn.littleisle.servicelogin.orm.dao.UserMapper;
import cn.littleisle.servicelogin.orm.model.User;
import cn.littleisle.servicelogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean signUp(String name, String password) {
        User user=new User();
        user.setUsername(name);
        user.setPassword(password);
        userMapper.insert(user);
        return false;
    }

    @Override
    public User signIn(String name, String password) {
        User user=userMapper.selectByUsername(name);
        return user;
    }
}
