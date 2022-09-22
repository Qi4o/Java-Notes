package mybatis.mapper;

import mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Qiao
 * @Create 2022/5/18 22:15
 */
public interface DeptMapper {

    //通过分步查询员工以及员工所对应的部门信息
    //  分步查询第二步，查询员工所对应的信息
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    //获取部门以及部门中所有的员工信息
    Dept getDeptAndEmp(@Param("did") Integer did);

    //通过分步查询查询部门以及部门中所有与阿公信息
    //  分步第一步：查询部门信息
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}
