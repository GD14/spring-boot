package cn.littleisle.singlelogin.business.web;

import cn.littleisle.bean.Response;
import cn.littleisle.bean.ResponseUtil;
import cn.littleisle.bean.ResultEnum;
import cn.littleisle.singlelogin.business.vojo.UserVo;
import cn.littleisle.singlelogin.orm.model.User;
import cn.littleisle.singlelogin.orm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController()
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping("/signUp")
    public String signUp(@RequestParam String name, @RequestParam String password) {
        userService.signUp(name,password);
        return "ok";
    }
    @GetMapping("/login")
    public ModelAndView signIn(ModelAndView modelAndView){
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @PostMapping("/login")
    public Response signIn(HttpSession httpSession, @RequestBody @Valid UserVo userVo, BindingResult bindingResult) {
//        ModelAndView modelAndView=new ModelAndView();
//        if(bindingResult.hasErrors()){
//            modelAndView.addObject("error",bindingResult.getFieldError().getDefaultMessage());
//            modelAndView.setViewName("login");
//            return modelAndView;
//        }
//
//        String name = userVo.getUserName();
//        String password = userVo.getPassword();
//        User user = userService.signIn(name, password);
//        if (user == null){
//            modelAndView.addObject("error","无此用户！");
//            modelAndView.setViewName("login");
//            return modelAndView;
//        }
//        else {
//            httpSession.setAttribute("user",user);
//            modelAndView.addObject("userName",name);
//            modelAndView.setViewName("home");
//            return modelAndView;
//        }
        String name = userVo.getUserName();
        String password = userVo.getPassword();
        User user = userService.signIn(name, password);
        if(user==null)
            return ResponseUtil.error(ResultEnum.USER_NOT_EXIST_ERROR);
        else
            return ResponseUtil.success(user);
    }
}