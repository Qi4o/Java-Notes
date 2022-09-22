package three; /**
 * @Author Qiao
 * @Create 2022/3/31 19:36
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "All", value = "/All")
public class All extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class clazz = Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "qiao9999");

            String sql = "select username, `name`, address from user_table";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            String username;
            String name;
            String address;

            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();

            while (rs.next()) {
                username = rs.getString("username");
                name = rs.getString("name");
                address = rs.getString("address");

                out.print("用户名：");
                out.println(username);

                out.print("姓名：");
                out.println(name);

                out.print("住址：");
                out.println(address);

                out.print("<br>");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
