package connection;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author Qiao
 * @Create 2022/3/6 11:53
 */

public class ConnectionTest {
    //方式一：
    @Test
    public void testConnectionTest1() throws SQLException {

        Driver driver = new com.mysql.jdbc.Driver();    //获取Driver实现类对象
        String url = "jdbc:mysql://localhost:3306/test";
        Properties info = new Properties(); //将用户名和密码封装在Properties中
        info.setProperty("user", "root");
        info.setProperty("password", "qiao9999");
        Connection coon = driver.connect(url, info);
        System.out.println(coon);
    }

    //方式二：对方式一的迭代:在如下的程序中不出现第三方的API，使得程序具有更好的可移植性
    @Test
    public void testConnectionTest2() throws Exception {
        //1.获取Driver实现类的对象，使用反射
        Class<?> clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();

        //2.提供要连接的数据库
        String url = "jdbc:mysql://localhost:3306/test";

        //3.提供连接需要的用户名和密码
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "qiao9999");

        //4.获取链接
        Connection conn = driver.connect(url, info);
        System.out.println(conn);
    }

    //方式三：使用DriverManager替换Driver
    @Test
    public void testConnectionTest3() throws Exception{
        //1.获取Driver实现类的对象
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();

        //2.提供三个基本信息
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "qiao9999";

        //3.注册驱动
        DriverManager.registerDriver(driver);

        //4.获取连接
        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println(conn);
    }

    //方式四：方式三的优化
    @Test
    public void testConnectionTest4() throws Exception{
        //1.提供三个基本信息
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "qiao9999";

        //2.加载Driver
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        //相较于方式三，可以省略一下操作：
//        Driver driver = (Driver)clazz.newInstance();
//        //注册驱动
//        DriverManager.registerDriver(driver);

        //为什么可以省略以上步骤？
        //在mysql的Driver实现类中，声明了以下内容操作：
//        static {
//            try {
//                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            } catch (SQLException var1) {
//                throw new RuntimeException("Can't register driver!");
//            }
//        }

        //3.获取连接
        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println(conn);
    }

    //方式五(final版):将数据库连接需要的4个基本信息声明在配置文件中，通过读取配置文件的方式获取连接
    //此方案的好处：
    //1.实现了数据与代码的分离。实现了解耦
    //2.如果需要修改配置信息，可以避免重新打包
    @Test
    public void getConnection() throws Exception {
        //1.读取配置文件基本信息
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
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
        System.out.println(coon);

    }
}
