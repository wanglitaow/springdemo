package com.wlt.mall.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {




    @RequestMapping(value = "/")
    private String sayHello() {
        return "hello  index"   ;
    }



}
