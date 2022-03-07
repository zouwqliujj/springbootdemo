package com.wenwo.controller;

import com.github.pagehelper.Page;
import com.wenwo.entity.Blog;
import com.wenwo.service.BlogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "springboot学习工程相关接口")
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

    @ApiOperation("根据id查询日志接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "日志id")
    })
    @GetMapping(value = "/blog/{id}")
    public Blog getBlogById(@PathVariable Integer id) {
        System.out.println("*****************"+id);
        Blog blog=blogService.getBlogById(id);
        return blog;
    }


}
