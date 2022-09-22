package preparedstatement.crud;

import bean.Customer;
import org.junit.Test;
import util.JDBCUtils;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * @Author Qiao
 * @Create 2022/3/13 14:19
 */

//针对Customer表的查询操作
public class CustomerForQuery {

    @Test
    public void testQueryForCustomers() {
        String sql = "select id,name,birth,email from customers where id = ?";
        Customer customer = queryForCustomers(sql, 13);
        System.out.println(customer);
    }


    public Customer queryForCustomers(String sql, Object...args){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);

            for (int i = 0; i < args.length; i++){
                ps.setObject(i+1, args[i]);
            }

            rs = ps.executeQuery();

            //获取结果集的元数据
            ResultSetMetaData rsmd = rs.getMetaData();
            //通过元数据获取列数
            int columnCount = rsmd.getColumnCount();

            if(rs.next()){
                Customer cust = new Customer();
                //处理结果集一行数据中的每一列
                for (int i = 0; i < columnCount; i++) {
                    //获取列值
                    Object columnValue = rs.getObject(i + 1);

                    //要给cust对象某个属性赋值为value
                    //获取每个列的列名
                    String columnName = rsmd.getColumnName(i+1);

                    //给cust对象指定的columnName属性赋值为columnValue：通过反射
                    Field field = Customer.class.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(cust, columnValue);
                }
                return cust;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return null;
    }

    @Test
    public void testQuery1(){
        Connection coon = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            coon = JDBCUtils.getConnection();
            String sql = "insert into customers(`name`) values(?)";
            ps = coon.prepareStatement(sql);
            ps.setObject(1, "哈哈哈");

            //执行 返回结果集
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.closeResource(coon, ps, resultSet);
        }
    }
}
