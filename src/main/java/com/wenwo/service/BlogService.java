package com.wenwo.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wenwo.dao.BlogDao;
import com.wenwo.entity.Blog;
import com.wenwo.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    @Autowired
    private BlogDao blogDao;

    public Page<Blog> getBlogList() {
        PageHelper.startPage(0,3);
        Page<Blog> page =  blogDao.selectBlogList2();
        return page;
    }

    public Blog getBlogById(Integer id) {
        return blogDao.selectBlogById(id);
    }
}
