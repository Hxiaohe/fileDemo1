package com.xiaohe.fileDemo.filter;

import org.springframework.core.annotation.Order;
import org.springframework.web.filter.HttpPutFormContentFilter;

import javax.servlet.annotation.WebFilter;

@Order(1)
@WebFilter(filterName="PutFormFilter",urlPatterns="/*")
public class PUTFormFilter extends HttpPutFormContentFilter {
}
