package com.shsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by xlf on 2019/4/13.
 */
@Controller
public class PageController {

    @RequestMapping("page01")
    public String page01(){
        return "redirect:v1.jsp?a=1&b=上海";
    }

    /**
     * 解决中文乱码问题
     * @param attr
     * @return
     */
    @RequestMapping("page02")
    public String page02(RedirectAttributes attr){
        attr.addAttribute("a", 1);
        attr.addAttribute("b", "上海");
        return "redirect:v1.jsp";
    }

    @RequestMapping("page03")
    public String page03(){
       System.out.println("page03...");
        return "redirect:page04";
    }

    @RequestMapping("page04")
    public String page04(){
       System.out.println("page04...");
        return "redirect:v1.jsp";
    }

    @RequestMapping("page05")
    public String page05(){
        return "index";
    }

    @RequestMapping("page06")
    public String page06(){
        System.out.println("page06");
        return "forward:page07";
    }

    @RequestMapping("page07")
    public String page07(){
        System.out.println("page07");
        return "index";
    }


}
