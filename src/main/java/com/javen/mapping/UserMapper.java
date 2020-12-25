package com.javen.mapping;

import com.javen.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

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
    //@Update("update user set password=#{s} where phone=#{phone}")
    void changepassword(@Param("phone") int phone,@Param("password") String password);
}
