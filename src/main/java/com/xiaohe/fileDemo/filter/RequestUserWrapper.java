package com.xiaohe.fileDemo.filter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * com.hw.myp2c.filter.filter
 * Administrator
 * 2017/10/18
 **/
public class RequestUserWrapper extends HttpServletRequestWrapper {


    public RequestUserWrapper(HttpServletRequest request) {
        super(request);
    }
}