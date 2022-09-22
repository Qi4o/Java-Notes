package task.task10;

import java.sql.*;

/**
 * @Author Qiao
 * @Create 2022/5/13 16:30
 */

public class JDBCTest {

    public static void main(String[] args) {
        String sql = "select * from tableA";
        execute(sql);
        System.out.println();
        String sqlUpdate = "insert into tableA values(?,?,?)";
        Update(sqlUpdate, new Object[]{4,4,4});

        execute(sql);

    }

    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;

    static String userName = "root";
    static String password = "qiao9999";
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/testa";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            conn = DriverManager.getConnection(url, userName, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public static void execute(String sql){
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                System.out.print(rsmd.getColumnName(i+1) + " ");
            }

            while(rs.next()){
                System.out.println();
                for(int i=0;i<rsmd.getColumnCount();i++){
                    System.out.print(rs.getObject(i+1) + " ");
                }
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void Update(String sql, Object[] para){
        try{
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            if (para != null) {
                for (int i = 0; i < para.length; i++) {
                    String className = para[i].getClass().getName();
                    if (className.contains("String")) {
                        pstmt.setString(i+1, para[i].toString());
                    }

                    if (className.contains("Integer")) {
                        pstmt.setInt(i+1, Integer.parseInt(para[i].toString()));
                    }
                }
            }

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
