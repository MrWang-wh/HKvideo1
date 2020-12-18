package com.javen.service.impl;

import com.javen.dao.DanmuDao;
import com.javen.model.Danmu;
import com.javen.mapping.DanmuMapper;
import com.javen.service.DanmuService;
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
@Service("danmuService")
public class DanmuServiceImpl extends ServiceImpl<DanmuMapper, Danmu> implements DanmuService {

    @Override
    public boolean save(Danmu entity) {
        return false;
    }
}
