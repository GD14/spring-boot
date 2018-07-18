package cn.littleisle.singlelogin.orm.service;


import cn.littleisle.singlelogin.orm.model.User;

public interface UserService {
    boolean signUp(String name, String password);
    User signIn(String name, String password);
}
