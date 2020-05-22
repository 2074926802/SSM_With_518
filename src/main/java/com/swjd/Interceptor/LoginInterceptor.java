package com.swjd.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//自定义拦截器
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //写放行的条件
        String uri=request.getRequestURI();//获取当前用户请求访问的地址
        //1.不需要登录之后访问
        if(uri.indexOf("login")>=0||uri.indexOf("Login")>=0){
            return true;//放行
        }
        if(uri.indexOf("ok")>=0||uri.indexOf("Login")>=0){
            return true;//放行
        }

        //2.需要登录之后访问的页面（已经登录过了）
        HttpSession session=request.getSession();
        if(session.getAttribute("activeName")!=null){
            return true;
        }

        //无条件到登录界面
        request.getRequestDispatcher("/toLogin").forward(request,response);
        return false;
    }
}
