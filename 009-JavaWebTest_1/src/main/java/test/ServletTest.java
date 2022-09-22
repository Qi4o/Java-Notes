package test;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @Author Qiao
 * @Create 2022/3/10 13:21
 */

public class ServletTest extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("正在初始化");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("姓名：乔晨阳 学号：21204110");
    }

    @Override
    public void destroy() {
        System.out.println("正在销毁中");
    }
}
