package com.shsxt.controller;

import com.shsxt.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by xlf on 2019/4/13.
 */
@Controller
@RequestMapping("param")
public class ParamController {

    /***
     * 接收前台数据
     * */

    @RequestMapping("test01")
    public String test01(HttpServletRequest request) {
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        System.out.println(a + " " + b);
        request.setAttribute("a", a);
        request.setAttribute("b", b);
        return "index";
    }

    @RequestMapping("test02")
    public String test02(String a, String b) {
        System.out.println(a + " " + b);
        return "index";
    }

    @RequestMapping("test03")
    public String test03(String[] ids) {
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }
        return "index";
    }


    @RequestMapping("test04")
    public String test04(HttpServletRequest request) {
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        System.out.println(user);
        return "index";
    }

    @RequestMapping("test05")
    public String test05(User user) {
        System.out.println(user);
        return "index";
    }


}
