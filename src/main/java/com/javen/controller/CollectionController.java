package com.javen.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Wanghan
 * @since 2020-12-18
 */
@Controller
public class CollectionController {
    @RequestMapping(value="/user",method = RequestMethod.GET)
    public String hello(@RequestParam("from") String from) {
        //String from=request.getParameter("from");
        System.out.println("hello"+from+"from server");
        return "index";
    }
}

