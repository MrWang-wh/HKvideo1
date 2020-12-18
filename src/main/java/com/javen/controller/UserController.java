package com.javen.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javen.model.User;
import com.javen.service.UserService;
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
    UserService userService;
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public R register(@RequestBody User user)
    {
        String phone = user.getPhone();
        String name = user.getName();
        if(userService.getOne(new QueryWrapper<User>().eq("phone",phone))!=null) {
            return new R().error("该手机号已经注册");
        }
        String password = user.getPassword();
        user.setPhone(phone);
        user.setPassword(password);
        user.setName(name);
        userService.save(user);
        return new R().ok("注册成功");
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public R update(@RequestBody User user)
    {



        return R.ok("修改成功");
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
        else if(byId.getPassword().equals(pwd))
        {
            return new R().ok("登陆成功").put("user",byId);
        }
        else return R.error(401,"密码错误");
    }
}

