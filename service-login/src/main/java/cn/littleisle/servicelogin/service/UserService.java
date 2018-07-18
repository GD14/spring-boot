package cn.littleisle.servicelogin.service;

import cn.littleisle.servicelogin.orm.model.User;

public interface UserService {
    boolean signUp(String name,String password);
    User signIn(String name, String password);
}
