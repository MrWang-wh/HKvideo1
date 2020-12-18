package com.javen.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javen.model.Comment;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CommentDao extends BaseMapper<Comment>{
}
