package com.example.demo;

import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hhg on 2017-07-08.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String hhg(){
        return "HI!";

    }

    @RequestMapping("/comment")
        @ResponseBody
        public Comment comment(String body , String name){
            Comment c = new Comment();
            c.setBody(body);
            c.setName(name);
            return c;
    }





}
