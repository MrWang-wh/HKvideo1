package com.javen.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javen.common.utils.R;
import com.javen.model.Danmu;
import com.javen.model.User;
import com.javen.service.DanmuService;
import com.javen.service.impl.DanmuServiceImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Wanghan
 * @since 2020-12-18
 */
@Controller
@RequestMapping("/danmu")
public class DanmuController {
    @Resource
    private DanmuService danmuService;
    @RequestMapping(value = "/adddanmu",method = RequestMethod.POST)
    @ResponseBody
    public R add(@RequestBody Danmu danmu)
    {
        danmuService.save(danmu);
        return R.ok();
    }
    @RequestMapping(value = "/all",method = RequestMethod.POST)
    @ResponseBody
    public R get(@RequestParam("videoId") int videoId){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        list.addAll(danmuService.listMaps(new QueryWrapper<Danmu>().eq("video_id",videoId)));
        return R.ok().put("all",list);
    }
}

