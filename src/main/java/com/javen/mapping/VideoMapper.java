package com.javen.mapping;

import com.javen.model.Video;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Wanghan
 * @since 2020-12-18
 */
@Mapper
public interface VideoMapper extends BaseMapper<Video> {
    void givestar(@Param("videoId") int videoId);
}
