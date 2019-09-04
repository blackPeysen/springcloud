package com.org.peysen.eurekacommon;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaCommonApplicationTests {

    @Autowired
    StringEncryptor encryptor;

    @Test
    public void getPass() {
        String password = encryptor.encrypt("Peysen123456");
        System.out.println(password + "----------------");
        Assert.assertTrue(password.length() > 0);
    }

    @Test
    public void contextLoads() {
    }

}
