package mybatis.mapper;

import mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Qiao
 * @Create 2022/5/19 13:24
 */
public interface DynamicSQLMapper {

    //多添件查询
    List<Emp> getEmpByCondition(Emp emp);

    //测试 choose when otherwise
    List<Emp> getEmpByChoose(Emp emp);

    //通过数组实现批量删除
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    //通过list集合实现批量增加
    int insertMoreList(@Param("emps") List<Emp> emps);
}
