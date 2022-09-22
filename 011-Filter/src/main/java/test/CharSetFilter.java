package test;

/**
 * @Author Qiao
 * @Create 2022/4/12 20:12
 */

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/CharSetFilter")
public class CharSetFilter  implements Filter {

    public CharSetFilter() {

    }
    public void destroy() {

    }
    public void doFilter(ServletRequest request,ServletResponse response,
                         FilterChain chain) throws IOException,ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        chain.doFilter(request,response);
    }
    public void init(FilterConfig fConfig) throws ServletException {

    }
}
