package com.jd.test.ccbengkaka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController class
 *
 * @author rongran
 * @date 2021/7/9 15:58
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public  String hello(){
        return "Hello";
    }

}
