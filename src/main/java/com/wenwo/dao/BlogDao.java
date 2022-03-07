package com.wenwo.dao;

import com.github.pagehelper.Page;
import com.wenwo.entity.Blog;
import com.wenwo.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BlogDao {
    @Autowired
    private BlogMapper blogMapper;

    @Cacheable(value = "BlogMapper",key="'selectBlogById:'+#bid")
    public Blog selectBlogById(Integer bid) {
        System.out.println("========"+bid);
        return blogMapper.selectBlogById(bid);
    }



    public List<Blog> selectBlogList1(Map page) {
        return blogMapper.selectBlogList1(page);
    }


    public Page<Blog> selectBlogList2() {
        return blogMapper.selectBlogList2();
    }


    public int updateByPrimaryKey(Blog blog) {
        return blogMapper.updateByPrimaryKey(blog);
    }
}
