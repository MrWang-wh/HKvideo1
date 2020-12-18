package com.javen.service.impl;

import com.javen.model.History;
import com.javen.dao.HistoryDao;
import com.javen.mapping.HistoryMapper;
import com.javen.service.HistoryService;
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
@Service("historyService")
public class HistoryServiceImpl extends ServiceImpl<HistoryMapper, History> implements HistoryService {

}
