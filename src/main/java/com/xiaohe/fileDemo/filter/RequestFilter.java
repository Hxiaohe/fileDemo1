package com.xiaohe.fileDemo.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


/**
 * 使当前线程连接数据库，并且绑定发起请求的用户
 */
@Order(2)
@WebFilter(filterName="AuthorizationHeaderFilter",urlPatterns="/*")
public class RequestFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        RequestUserWrapper requestUserWrapper = new RequestUserWrapper(request);
        filterChain.doFilter(requestUserWrapper, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
