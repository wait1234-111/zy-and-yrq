package com.zywl.controller;

import com.zywl.pojo.GtPageResult;
import com.zywl.pojo.GtResult;
import com.zywl.pojo.StuEpidemic;
import com.zywl.pojo.Student;
import com.zywl.service.StuEpidemicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Shenyz
 * Date: 2020/3/17 15:31
 */
@Controller
@RequestMapping("/epidemic")
public class StuEpidemicController {

    @Autowired
    private StuEpidemicService stuEpidemicService;


    @RequestMapping("/insert")
    @ResponseBody
    public int insertStuEpidemicByStudent(StuEpidemic stuEpidemic, HttpServletRequest request){
        HttpSession session = request.getSession();
        Student user = (Student) session.getAttribute("user");

        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        StuEpidemic epidemic = stuEpidemicService.selByStuEpidemic(user.getStuno(), date);

        if(epidemic==null){
            stuEpidemic.setStuno(user.getStuno());
            stuEpidemic.setStuname(user.getStuname());
            stuEpidemic.setPhone(user.getPhone());
            stuEpidemic.setClassname(user.getClassname());
            stuEpidemic.setColleage(user.getColleage());
            return stuEpidemicService.insert(stuEpidemic);
        }
        return -1;
    }
    @RequestMapping("/all")
    @ResponseBody
    public GtPageResult selAll(StuEpidemic stuEpidemic,int page, int limit){
        return stuEpidemicService.selAll(stuEpidemic,page, limit);
    }

    @RequestMapping("/student/all")
    @ResponseBody
    public GtPageResult selAllByStudent(StuEpidemic stuEpidemic,int page, int limit, HttpServletRequest request){
        HttpSession session = request.getSession();
        Student user = (Student) session.getAttribute("user");
        return stuEpidemicService.selAllByStudent(stuEpidemic,user.getStuno(),page, limit);
    }
}
