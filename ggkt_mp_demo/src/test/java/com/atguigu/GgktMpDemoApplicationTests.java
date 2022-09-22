package com.atguigu;

import com.atguigu.entity.User;
import com.atguigu.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GgktMpDemoApplicationTests {

    //注入mapper
    @Autowired
    private UserMapper userMapper;


    //1.查询所有数据
    @Test
    public void findAll(){
        List<User> userList = userMapper.selectList(null);

        for(User user : userList){
            System.out.println(user);
        }
    }

    //2.添加操作
    @Test
    public void addUser(){
        User user = new User();
        user.setName("尚硅谷upup");
        user.setAge(10);
        user.setEmail("atguigu.com");
        int rows = userMapper.insert(user); //返回受影响的行数
        System.out.println("rows:" + rows);

        System.out.println(user);
    }

    //3.修改操作
    @Test
    public void updateUser(){
        //根据id查询出数据
        User user = userMapper.selectById(1);

        //设置修改值
        user.setName("尚硅谷上海");

        //调用方法实现修改
        int rows = userMapper.updateById(user);

        System.out.println(rows);
    }

    //4.分页查询
    @Test
    public void findPage(){
        //创建Page对象，传递两个参数，当前页和每页显示参数
        Page<User> page = new Page<>(1,3);

        //调用mp方法实现分页
        //IPage<User> pageModel = userMapper.selectPage(page, null);
        userMapper.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());

        page.getRecords().forEach(System.out::println);
    }

    @Test
    public void delete(){
        userMapper.deleteById(5);
    }

}
