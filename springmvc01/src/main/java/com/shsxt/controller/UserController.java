package com.shsxt.controller;

import com.shsxt.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by xlf on 2019/4/13.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("login")
    @ResponseBody
    public String login(String name, String pwd, HttpSession session) {
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        session.setAttribute("user", user);// 保持登陆状态
        return "登陆成功";
    }

    @RequestMapping("queryUser")
    @ResponseBody
    public User queryUser(Integer id) {
        User user = new User();
        user.setName("xiannv");
        user.setPwd("888888");
        return user;
    }

}
