package test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Qiao
 * @Create 2022/3/3 21:05
 */

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查看
        String username = req.getParameter("username");
        System.out.println("在Servlet1中查看" + username);

        //盖章
        req.setAttribute("key1", "柜台1的章");

        //问路
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");

        //走向
        requestDispatcher.forward(req,resp);
    }
}
