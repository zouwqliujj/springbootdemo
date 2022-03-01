package com.wenwo.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wenwo.entity.Blog;
import com.wenwo.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    @Autowired
    private BlogMapper blogMapper;

    public Page<Blog> getBlogList() {
        PageHelper.startPage(0,3);
        Page<Blog> page =  blogMapper.selectBlogList2();
        return page;
    }

    public Blog getBlogById(Integer id) {
        return blogMapper.selectBlogById(id);
    }
}
