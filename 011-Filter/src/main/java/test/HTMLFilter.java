package test;

/**
 * @Author Qiao
 * @Create 2022/4/12 20:11
 */

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/htmlFilter")
public class HTMLFilter implements Filter{
    public HTMLFilter() {
    }
    public void destroy() {
    }
    public void doFilter(ServletRequest request,ServletResponse response,
                         FilterChain chain)
            throws IOException,ServletException {
        System.out.println("进入doFilter过滤器");
        chain.doFilter(request,response);
    }
    public void init(FilterConfig fConfig) throws ServletException {
    }
}

