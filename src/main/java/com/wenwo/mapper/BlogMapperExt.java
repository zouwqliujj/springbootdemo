package com.wenwo.mapper;

import com.wenwo.entity.Blog;

public interface BlogMapperExt extends BlogMapper {
    /**
     * 根据名称查询文章
     * @param name
     * @return
     */
    public Blog selectBlogByName(String name);
}
