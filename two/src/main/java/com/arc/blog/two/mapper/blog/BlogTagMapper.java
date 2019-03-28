package com.arc.blog.two.mapper.blog;

import com.arc.blog.two.model.domain.blog.BlogTag;

import java.util.List;

/**
 * @author: 叶超
 * @since: 2019/1/30 15:05
 */
public interface BlogTagMapper {

    int save(BlogTag tag);

    int delete(Long id);

    int update(BlogTag tag);

    BlogTag get(Long id);

    List<BlogTag> list();

}
