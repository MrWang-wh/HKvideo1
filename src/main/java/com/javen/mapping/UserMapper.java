package com.javen.mapping;

import com.javen.model.User;
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
public interface UserMapper extends BaseMapper<User> {

}
