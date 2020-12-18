package com.javen.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javen.model.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseMapper<User>{
}
