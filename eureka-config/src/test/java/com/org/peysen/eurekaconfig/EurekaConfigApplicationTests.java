package com.org.peysen.eurekaconfig;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class EurekaConfigApplicationTests {

    @Autowired
    StringEncryptor encryptor;

    @Test
    public void getPass() {
        String password = encryptor.encrypt("Pmm1363039590!");
        System.out.println(password + "----------------");
        Assert.assertTrue(password.length() > 0);
    }

    @Test
    public void contextLoads() {
    }

}
