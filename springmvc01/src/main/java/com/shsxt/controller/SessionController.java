package com.shsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xlf on 2019/4/13.
 */
@Controller
@SessionAttributes({"userName"})// userName 放入session
public class SessionController {

    @RequestMapping("queryUser")
    public ModelAndView queryUser(String userName) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("userName", userName);
        return mv;
    }
}
