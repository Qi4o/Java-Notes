package test; /**
 * @Author Qiao
 * @Create 2022/3/1 21:28
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        context.setAttribute("key1", "value1");
        System.out.println("context1中获取域数据key1的值是：" + context.getAttribute("key1"));
        System.out.println("context1中获取域数据key1的值是：" + context.getAttribute("key1"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
