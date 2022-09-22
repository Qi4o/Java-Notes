package test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Qiao
 * @Create 2022/3/5 14:43
 */

public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此一游 Response1");
//        //设置响应状态码302 表示已搬迁
//        resp.setStatus(302);
//        //设置响应头，说明新的地址在哪里
//        resp.setHeader("Location", "http://localhost:8080/JavaWebTest_1_war_exploded/response2");

        //重定向第二种方法（推荐）
        resp.sendRedirect("http://localhost:8080/JavaWebTest_1_war_exploded/response2");
    }
}
