package three; /**
 * @Author Qiao
 * @Create 2022/3/31 16:36
 */

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet(name = "Add", value = "/Add")
public class Add extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String tel = request.getParameter("tel");
        String zipCode = request.getParameter("zipCode");

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class clazz = Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "qiao9999");
            String sql = "insert into user_table values(?, ?, ?, ?, ?, ?);";
            ps = conn.prepareStatement(sql);
            ps.setObject(1, username);
            ps.setObject(2, password);
            ps.setObject(3, name);
            ps.setObject(4, address);
            ps.setObject(5, tel);
            ps.setObject(6, zipCode);
            ps.execute();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        System.out.println("信息保存成功，请点击链接查看用户或查看所有用户");
        out.println("<HTML>");
        out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<p>信息保存成功，请点击查看<a href=\"query.html\">用户</a>或查看<a href=\"/JavaWebTest_war_exploded/all\">所有用户</a><p>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
}
