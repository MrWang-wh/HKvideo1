package com.javen.mapping;

import com.javen.model.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Wanghan
 * @since 2020-12-18
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}
