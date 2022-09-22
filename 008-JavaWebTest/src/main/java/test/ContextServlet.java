package test; /**
 * @Author Qiao
 * @Create 2022/3/1 17:16
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取web.xml中配置的上下文参数
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        System.out.println("Context.param参数username的值是：" + username);
        System.out.println("Context.param参数password的值是：" + context.getInitParameter("password"));

        //2.获取当前工程路径
        System.out.println("当前工程路径:" + context.getContextPath());

        //3.获取工程部署后在服务器硬盘上的绝对路径
        System.out.println("工程部署的路径是：" + context.getRealPath("/"));

        //4.像Map一样存储数据

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
