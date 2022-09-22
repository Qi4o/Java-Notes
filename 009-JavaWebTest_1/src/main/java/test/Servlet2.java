package test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Qiao
 * @Create 2022/3/3 21:05
 */

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查看
        String username = req.getParameter("username");
        System.out.println("在Servlet2中查看：" + username);

        //查看印章
        Object key1 = req.getAttribute("key1");
        System.out.println("Servlet1是否有章:" + key1);

        //处理自己的业务
        System.out.println("Servlet处理自己的业务");

    }
}
