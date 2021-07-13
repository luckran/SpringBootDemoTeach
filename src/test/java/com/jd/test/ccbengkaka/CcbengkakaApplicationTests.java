package com.jd.test.ccbengkaka;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class CcbengkakaApplicationTests {

    //    @Autowired
//    private HelloController helloController;
    private HelloController helloController;

    public void setUp() {
        helloController = new HelloController();
    }


    @Test
    void contextLoads() {
        String hello = helloController.hello();
        assertEquals("Hello", hello);

        System.out.println("sout ---- " + hello);
    }
}
