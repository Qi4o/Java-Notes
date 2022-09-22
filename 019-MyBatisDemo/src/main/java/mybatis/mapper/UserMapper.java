package mybatis.mapper;

import mybatis.pojo.User;

import java.util.List;

/**
 * @Author Qiao
 * @Create 2022/5/17 17:39
 */

public interface UserMapper {

    //MyBatis面向接口编程的两个一致:
        //1.映射文件的namespace要和mapper接口的全类名保持一致
        //2.映射文件中的SQL语句的id要和mapper接口中的方法名一致

    //添加用户信息
    int insertUser();

    //修改用户信息
    void updateUser();

    //删除用户信息
    void deleteUser();

    //根据id查询用户信息
    User getUserById();

    //查询所有用户信息
    List<User> getAllUser();

}
