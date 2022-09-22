package mybatis.mapper;

import mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author Qiao
 * @Create 2022/5/18 16:47
 */

public interface SelectMapper {

    //根据id查询用户信息
    User getUserById(@Param("id") Integer id);

    //查询所有用户信息
    List<User> getAllUser();

    //查询用户信息总记录数据
    Integer getCount();

    //根据id查询用户信息为一个map集合
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    //查询所有用户信息为map集合
//    List<Map<String, Object>> getAllUserToMap();
    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}
