package util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @Author Qiao
 * @Create 2022/3/6 16:38
 */

//操作数据库的工具类
public class JDBCUtils {

    //获取数据库连接
    public static Connection getConnection() throws Exception{
        //1.读取配置文件基本信息
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros = new Properties();
        pros.load(is);
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");

        //2.加载驱动
        Class.forName(driverClass);

        //3.获取连接
        Connection coon = DriverManager.getConnection(url, user, password);

        return coon;
    }

    //关闭数据库连接
    public static void closeResource(Connection conn, Statement ps){
        //资源关闭
        try {
            if(ps != null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeResource(Connection conn, Statement ps, ResultSet rs) {
        //资源关闭
        try {
            if(ps != null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
