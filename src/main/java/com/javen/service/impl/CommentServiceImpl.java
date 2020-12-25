package com.javen.service.impl;

import com.javen.model.Comment;
import com.javen.mapping.CommentMapper;
import com.javen.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Wanghan
 * @since 2020-12-18
 */
@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
