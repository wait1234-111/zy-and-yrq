package com.zywl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: Shenyz
 * Date: 2020/1/10 16:48
 */
@Controller
public class PageController {

    /**
     * 默认进入登陆页面
     * @return
     */
    @RequestMapping("/")
    public String DefaultLoginPage(){
        return "/login";
    }


    @RequestMapping("/adminLogin")
    public String adminLoginPage(){
        return "/adminLogin";
    }

    /**
     * 主页面
     * @return
     */
    @RequestMapping("/page/index")
    public String indexPage(){

        return "/index";
    }
    @RequestMapping("/page/AdminIndex")
    public String adminIndexPage(){
        return "/AdminIndex";
    }
    /**
     * 默认主页
     * @return
     */
    @RequestMapping("/page/homepage")
    public String homepage(){
        return "/homepage";
    }


    @RequestMapping("/page/adminhomepage")
    public String studenthomepage(){
        return "/adminhomepage";
    }

    /**
     * 分类管理页面
     * @return
     */
    @RequestMapping("/page/addStudent")
    public String classifyPage(){
        return "/addStudent";
    }

    @RequestMapping("/page/epidemic/student/all")
    public String selAllByStudent(){
        return "/studentRecord";
    }

    @RequestMapping("/page/AllRecord")
    public String selAll(){
        return "/AllRecord";
    }

    /**
     * 音频文字管理页面
     * @return
     */
    @RequestMapping("/page/adminpassword")
    public String audioPage(){
        return "/adminpassword";
    }

    @RequestMapping("/page/password")
    public String passwordPage(){
        return "/password";
    }


}
