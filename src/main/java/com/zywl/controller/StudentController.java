package com.zywl.controller;

import com.zywl.pojo.GtPageResult;
import com.zywl.pojo.GtResult;
import com.zywl.pojo.Student;
import com.zywl.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Author: Shenyz
 * Date: 2020/3/17 15:31
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/login")
    @ResponseBody
    public GtResult userLoginByUser(Student user, String vercode, HttpServletRequest req){
        HttpSession session = req.getSession();
        GtResult result = new GtResult();
        String loginCode = (String) session.getAttribute("loginCode");
        if (loginCode.equalsIgnoreCase(vercode)) {//判断验证码
            if(user!=null){
                Student loginUser = studentService.selByStudent(user);
                if (loginUser!=null){
                    //把用户信息放入session中
                    session.setAttribute("user",loginUser);
                    result.setState(0);
                    result.setMessage("登入成功!");
                }else {
                    //用户名密码错误
                    result.setState(1);
                    result.setMessage("用户名或密码错误，请重新输入!");
                }
            }else {
                //用户名密码错误
                result.setState(1);
                result.setMessage("用户名或密码错误，请重新输入!");
            }
        }else {//验证码输入错误
            result.setState(1);
            result.setMessage("验证码输入错误，请重新输入!");
        }
        return result;
    }

    @RequestMapping("/update")
    @ResponseBody
    public int updateUser(Student user,HttpServletRequest req){
        HttpSession session = req.getSession();
        Student LoginUser = (Student) session.getAttribute("user");
        user.setStuno(LoginUser.getStuno());
        LoginUser.setPwd(user.getPwd());
        session.setAttribute("user",LoginUser);
        return  studentService.update(user);
    }

    @RequestMapping("/all")
    @ResponseBody
    public GtPageResult selAll(int page, int limit){
        return studentService.selAll(page, limit);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(Student student){
        return studentService.insert(student);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(String stuno){
        return studentService.delete(stuno);
    }
}
