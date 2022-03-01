package com.wenwo.controller;

import com.github.pagehelper.Page;
import com.wenwo.entity.Blog;
import com.wenwo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;



    @GetMapping(value = "/blogList")
    public Page<Blog> getBlogList(Blog blog) {
        Page<Blog> blogList=blogService.getBlogList();
        return blogList;
        //return null;
    }

    @GetMapping(value = "/blog/{id}")
    public Blog getBlogById(@PathVariable Integer id) {
        System.out.println("*****************"+id);
        Blog blog=blogService.getBlogById(id);
        return blog;
    }


}
