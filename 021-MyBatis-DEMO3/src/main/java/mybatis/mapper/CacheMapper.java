package mybatis.mapper;

import mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Qiao
 * @Create 2022/5/19 17:34
 */
public interface CacheMapper {

    Emp getEmpByEid(@Param("eid") Integer eid);
}
