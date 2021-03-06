package cn.littleisle.singlelogin.orm.service.impl;

import cn.littleisle.singlelogin.orm.dao.UserMapper;
import cn.littleisle.singlelogin.orm.model.User;
import cn.littleisle.singlelogin.orm.service.UserService;
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
        //用户不存在
        if(user==null)
            return null;
        //密码错误
        if(!user.getPassword().equals(password))
            return null;
        return user;
    }
}
