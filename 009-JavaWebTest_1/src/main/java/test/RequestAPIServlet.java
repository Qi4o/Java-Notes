package test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Qiao
 * @Create 2022/3/2 15:38
 */

public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求的资源路径
        System.out.println("URI:" + req.getRequestURI());
        //2.获取请求的统一资源定位符
        System.out.println("URL:" + req.getRequestURL());
        //3.获取客户端的ip地址
        System.out.println("IP:" + req.getRemoteHost());
        //4.获取请求头
        System.out.println("User-Agent:" + req.getHeader("User-Agent"));
        //5.获取请求的方式(GET/POST)
        System.out.println("Method:" + req.getMethod());
    }
}
