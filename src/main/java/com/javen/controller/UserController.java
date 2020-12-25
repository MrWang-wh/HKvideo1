package com.javen.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javen.mapping.UserMapper;
import com.javen.model.User;
import com.javen.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import com.javen.common.utils.R;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Wanghan
 * @since 2020-12-18
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public R register(@RequestBody User user)
    {
        String phone = user.getPhone();
        String name = user.getName();
        if(userService.getOne(new QueryWrapper<User>().eq("phone",phone))!=null) {
            return new R().error("该手机号已经注册");
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode(user.getPassword());
        user.setPassword(encode);
        userService.save(user);
        return new R().ok("注册成功");
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public R update(@RequestParam("phone") int phone,@RequestParam("newpassword") String newpassword,@RequestParam("oldpassword") String oldpassword)
    {
        User user=userService.getOne(new QueryWrapper<User>().eq("phone",phone));
        if(user == null){
            return R.error("修改密码失败");
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder.matches(oldpassword,user.getPassword()))
        {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encode = passwordEncoder.encode(newpassword);
            userMapper.changepassword(phone,encode);
            return new R().ok("密码修改成功");
        }
        else return R.error(401,"原密码错误");
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public R login(@RequestParam(value="phone") String phone,@RequestParam(value="password") String pwd)
    {

        User byId = userService.getOne(new QueryWrapper<User>().eq("phone", phone));
        if(byId ==null)
        {
            return new R().error("无此用户");
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder.matches(pwd,byId.getPassword()))
        {
            return new R().ok("登陆成功").put("user",byId);
        }
        else return R.error(401,"密码错误");
    }
}

