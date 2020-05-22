package com.swjd.controller;

import com.swjd.bean.User;
import com.swjd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(User user,Model model){
        User u=userService.findUser(user);
        if (u!=null){
            if (u.getFlag()==1){
                return "ok";
            }else {
                model.addAttribute("error","账号被冻结！");
                model.addAttribute("user",user);
                return "login";
            }
        }else {
            model.addAttribute("error","账号或密码错误！");
            model.addAttribute("user",user);
            return "login";
        }
    }

    //主界面跳转
    @RequestMapping("/toMain")
    public String toMain(Model model, HttpSession session){
        String loginState="";
        if(session.getAttribute("activeName")!=null){
            loginState= (String) session.getAttribute("activeName");
            System.out.println(loginState);
        }else{
            loginState="亲，请登录";
        }
        model.addAttribute("loginState",loginState);
        return "ok";
    }

    //提供一个方法，能访问我的淘宝
    @RequestMapping("/toMy")
    public  String toMy(){
        return "myTaoBao";
    }

    //提供一个方法，能访问购物车
    @RequestMapping("/toCar")
    public  String toCar(){
        return "shoppingCar";
    }
}
