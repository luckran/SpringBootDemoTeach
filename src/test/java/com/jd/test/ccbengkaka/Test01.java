package com.jd.test.ccbengkaka;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test class
 *
 * @author rongran
 * @date 2021/7/13 18:53
 */
@SpringBootTest
class Test01 {

    @BeforeAll
    static void init(){
        System.out.println("init once");
    }


    @BeforeEach
    void each() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void eacha() {
        System.out.println("AfterEach");
    }

    @Test
    void t1() {
        int res = 1 + 1;
        Assertions.assertEquals(2, res);
//        Assertions.assertTrue(res == 2);
        System.out.println(123);
    }

    @Test
    void t2() {
        int res = 1 + 1;
        Assertions.assertEquals(2, res);
//        Assertions.assertTrue(res == 2);
        System.out.println(456);
    }

}
