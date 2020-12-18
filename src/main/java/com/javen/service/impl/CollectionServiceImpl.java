package com.javen.service.impl;

import com.javen.dao.CollectionDao;
import com.javen.model.Collection;
import com.javen.mapping.CollectionMapper;
import com.javen.service.CollectionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Wanghan
 * @since 2020-12-18
 */
@Service("collectionService")
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, Collection> implements CollectionService {
    @Resource
    private CollectionMapper collectionMapper;
}
