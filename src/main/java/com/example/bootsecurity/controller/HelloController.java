package com.example.bootsecurity.controller;

import com.example.bootsecurity.entity.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description:
 * @date: 2022/5/10 13:19
 * @version: 1.0.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Result hello() {
//        return new Result();
        return new Result(200, "Hello");
    }
}
