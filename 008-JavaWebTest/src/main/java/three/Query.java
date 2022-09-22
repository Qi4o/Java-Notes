package three; /**
 * @Author Qiao
 * @Create 2022/3/31 19:13
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "Query", value = "/Query")
public class Query extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class clazz = Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "qiao9999");

            String sql = "select username,`name`, address from user_table where username = ?";
            ps = conn.prepareStatement(sql);
            ps.setObject(1, username);
            rs = ps.executeQuery();

            rs.next();
            String usernameRs = rs.getString("username");
            String name = rs.getString("name");
            String address = rs.getString("address");

            System.out.println(usernameRs);
            System.out.println(name);

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            out.print("用户名：");
            out.println(usernameRs);

            out.print("姓名：");
            out.println(name);

            out.print("住址：");
            out.println(address);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
