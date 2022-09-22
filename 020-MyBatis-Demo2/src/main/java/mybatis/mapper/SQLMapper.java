package mybatis.mapper;

import mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Qiao
 * @Create 2022/5/18 17:40
 */
public interface SQLMapper {

    //根据用户名模糊查询信息
    List<User> getUserByLike(@Param("username") String username);

    //批量删除
    int deleteMore(@Param("ids") String ids);

    //查询表中指定信息
    List<User> getUserByTableName(@Param("tableName") String tableName);

    //添加用户信息
    void insertUser(User user);
}
