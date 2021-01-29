package com.ccsama.guli.tests;

import com.ccsama.guli.entity.User;
import com.ccsama.guli.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author aviccii 2021/1/29
 * @Discrimination
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CRUDTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert(){

        User user = new User();
        user.setName("helen");
        user.setAge(18);
        user.setEmail("55317332@qq.com");

        int result = userMapper.insert(user);

        System.out.println(result);//影响的行数
        System.out.println(user);//id自动回填

    }

}
