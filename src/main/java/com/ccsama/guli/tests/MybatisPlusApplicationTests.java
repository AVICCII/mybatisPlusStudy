package com.ccsama.guli.tests;

import com.ccsama.guli.entity.User;
import com.ccsama.guli.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author aviccii 2021/1/29
 * @Discrimination
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        System.out.println("------ selectAll method test ------");
        //UserMapper 中的 selectList()方法的参数为 MP 内置的条件封装器 Wrapper
        //所以不填写就是无任何条件
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testUpdateById(){
        User user = new User();
        user.setId(1L);
        user.setAge(28);

        int result = userMapper.updateById(user);
        System.out.println(result);
    }
}
