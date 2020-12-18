package com.javen.service.impl;

import com.javen.dao.VideoDao;
import com.javen.model.Video;
import com.javen.mapping.VideoMapper;
import com.javen.service.VideoService;
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
@Service("videoService")
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

}
