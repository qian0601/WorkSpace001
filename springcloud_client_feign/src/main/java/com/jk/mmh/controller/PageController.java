package com.jk.mmh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    /**
     * 去往首页
     * @return
     */
    @RequestMapping("toIndex")
    public String toIndex(){

        return "mmh/index";
    }

    /**
     * 去往原创工具页面
     * @return
     */
    @RequestMapping("toWorks")
    public String toWorks(){

        return "mmh/works";
    }
}
