package com.jd.test.ccbengkaka;

import org.springframework.stereotype.Service;

/**
 * Svc1 class
 *
 * @author rongran
 * @date 2021/7/13 19:04
 */
@Service
public class Svc1 {

    public int add(int a, int b) {
        return a + b;
    }

    public int jian(int a, int b) {
        return a - b;
    }

}
