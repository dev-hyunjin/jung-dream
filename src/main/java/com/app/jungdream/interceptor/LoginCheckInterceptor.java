package com.app.jungdream.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        HttpSession session = request.getSession(false);
//
//        if(session == null || session.getAttribute("sessionNumber") == null) {
//
//            response.sendRedirect("/?interceptor=Y");
//            return false;
//        }
//
        return true;
    }
}
