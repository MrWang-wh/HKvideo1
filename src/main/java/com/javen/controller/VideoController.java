package com.javen.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javen.common.utils.R;
import com.javen.mapping.VideoMapper;
import com.javen.model.Video;
import com.javen.service.VideoService;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
@RequestMapping("/video")
public class VideoController {
    @Resource
    private VideoService videoService;
    @Resource
    private VideoMapper videoMapper;
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public R addvideo(@RequestBody Video video){
        LocalDate uploadTime=LocalDate.now();
        video.setUploadTime(uploadTime);
        //System.out.println(video);
        videoService.save(video);
        return R.ok();
    }
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ResponseBody
    public R deletevideo(@RequestParam("videoId") Integer videoId){
        videoMapper.deleteById(videoId);
        return R.ok();
    }
    @RequestMapping(value = "getmyvideo",method = RequestMethod.POST)
    @ResponseBody
    public R getvideo(@RequestParam("userId") Integer userId){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        list.addAll(videoService.listMaps(new QueryWrapper<Video>().eq("user_id",userId)));
        return R.ok().put("video",list);
    }
    @RequestMapping(value = "searchbyname",method = RequestMethod.POST)
    @ResponseBody
    public R searchByname(@RequestParam("name") String name){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        list.addAll(videoService.listMaps(new QueryWrapper<Video>().like("name",name).eq("status",1)));
        return R.ok().put("video",list);
    }
    @RequestMapping(value = "searchbytype",method = RequestMethod.POST)
    @ResponseBody
    public R searchBytype(@RequestParam("type") String type){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        list.addAll(videoService.listMaps(new QueryWrapper<Video>().like("type",type).eq("status",1)));
        return R.ok().put("video",list);
    }
    @RequestMapping(value = "list",method = RequestMethod.POST)
    @ResponseBody
    public R showvideo(){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        list.addAll(videoService.listMaps(new QueryWrapper<Video>().eq("status",1)));
        return R.ok().put("video",list);
    }
    @RequestMapping(value = "star",method = RequestMethod.POST)
    @ResponseBody
    public R addstar(@RequestParam("vedioId") Integer videoId){
        videoMapper.givestar(videoId);
        return R.ok();
    }
}

