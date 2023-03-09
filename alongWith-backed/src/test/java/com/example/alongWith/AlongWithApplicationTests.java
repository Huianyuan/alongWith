package com.example.alongWith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class AlongWithApplicationTests {

    @Test
    void contextLoads() {
    }

    //加密测试
    @Test
    void testDigest() {
        String newPassword = DigestUtils.md5DigestAsHex(("123456"+"mypassword").getBytes());
        System.out.println(newPassword);
    }

}
