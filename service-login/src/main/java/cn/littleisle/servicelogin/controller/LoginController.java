package cn.littleisle.servicelogin.controller;

import cn.littleisle.servicelogin.orm.model.User;
import cn.littleisle.servicelogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cn.littleisle.bean.Response;
@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping("/signUp")
    public String signUp(@RequestParam String name,@RequestParam String password) {
        userService.signUp(name,password);
        return "ok";
    }
    @RequestMapping("/signIn")
    public Response signIn(@RequestParam String name,@RequestParam String password) {
        User user=userService.signIn(name,password);

        if(user==null||!user.getPassword().equals(password))
            return new Response().unauthorized();
        else
            return new Response().ok(user);
    }
}
