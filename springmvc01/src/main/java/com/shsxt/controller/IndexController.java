package com.shsxt.controller;

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
@RequestMapping("test")
public class IndexController {

    /***
     * 浏览器输入 /hello 服务器响应hello.jsp页面
     * */
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("index")
    public String test(){
        return "index";
    }

    /***
     * 完整写法
     * ModelAndView
     * */
    @RequestMapping("test01")
    public ModelAndView test01(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");//视图名字
        mv.addObject("name", "shsxt");//添加数据
        return mv;
    }


    @RequestMapping("test02")
    public String test02(HttpServletRequest request){
        request.setAttribute("name", "shsxt2");
        return "hello";
    }

    @RequestMapping("test03")
    public String test03(HttpServletRequest request){
        request.getSession().setAttribute("name", "shsxt3");
        return "hello";
    }

    @RequestMapping("test04")
    public String test04(HttpSession session){
        session.setAttribute("name", "shsxt4");
        return "hello";
    }

    @RequestMapping("test05")
    public String test05(Model model){
        model.addAttribute("name", "shsxt5");
        return "hello";
    }

    @RequestMapping("test06")
    public String test06(Map map){
        map.put("name", "shsxt6");
        return "hello";
    }



}
