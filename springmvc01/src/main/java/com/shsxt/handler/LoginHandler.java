package com.shsxt.handler;

import com.shsxt.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xlf on 2019/4/13.
 */
public class LoginHandler implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("target method before...");
        /***
         * 登陆拦截
         * */
        User user = (User) httpServletRequest.getSession().getAttribute("user");
        if (null == user) {
            System.err.println("用户未登录");
            return false;
        } else {
            return true;// 如果返回false代表请求被拦截, 否则继续执行true
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("target method after, view before...");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("view after...");
    }
}
