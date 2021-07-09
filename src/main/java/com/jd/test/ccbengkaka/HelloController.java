package com.jd.test.ccbengkaka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
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

    @Value("${name}")
    private String name;


    @Value("${person.name}")
    private String name2;

    @Value("${person.age}")
    private String age;

    @Value("${address[0]}")
    private String address1;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    @Autowired
    private Environment env;

    @Autowired
    private Person person;

    @RequestMapping("/hello2")
    public String hello2() {
        System.out.println(name);
        System.out.println(name2);
        System.out.println(age);
        System.out.println(address1);
        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println("-------------");
        System.out.println(env.getProperty("person.name"));
        System.out.println(env.getProperty("address[0]"));
        System.out.println(person.toString());
        System.out.println(person.getName());
        System.out.println(person.getAddress());

        return this.name;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
