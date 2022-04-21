package io.github.pigeonmuyz.loversdiary.diaryboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/get")
    public String testAddress(){
        System.out.println("Input Void");
        return "连接成功";
    }
}
