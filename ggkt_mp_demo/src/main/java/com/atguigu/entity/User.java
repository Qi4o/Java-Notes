package com.atguigu.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

/**
 * @Author Qiao
 * @Create 2022/9/19 22:15
 */

@Data
public class User {


    //@TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;

    //逻辑删除的标志
    @TableLogic
    private Integer deleted;
}
