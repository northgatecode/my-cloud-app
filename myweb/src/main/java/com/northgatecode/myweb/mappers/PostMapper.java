package com.northgatecode.myweb.mappers;

import com.northgatecode.myweb.models.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostMapper {
    @Select("select id, content, signature, created from post where id = #{param1};")
    Post getPostById(int id);

    @Select("select id, content, signature, created from post order by created desc")
    List<Post> getPostAll();
}
