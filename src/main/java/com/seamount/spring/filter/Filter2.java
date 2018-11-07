package com.seamount.spring.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 因为在web.xml中配置 urlParam / 所以不会匹配过来
 * 同理 使用注解 /*
 *
 * 使用注释的过滤器 执行顺序的控制 只能通过类名的 字母顺序 （优先执行xml中配置的过滤器）
 */
@WebFilter(urlPatterns = "/*")
public class Filter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter2  start #############");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("Filter2  start #############");
    }
}
