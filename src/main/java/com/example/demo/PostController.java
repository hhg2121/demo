package com.example.demo;

import com.sun.xml.internal.ws.client.sei.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by hhg on 2017-07-08.
 */
@Controller
public class PostController {
    @Autowired
    private PostRepository postRepository;
    @RequestMapping("/posts/add")
    @ResponseBody
    public Post post(String body, String title) {
        Post p = new Post();
        p.setBody(body);
        p.setTitle(title);
        p.setCreatedAt(new Date());

        postRepository.save(p);

        return p;

    }
}