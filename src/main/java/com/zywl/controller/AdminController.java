package com.zywl.controller;

import com.zywl.pojo.Admin;
import com.zywl.pojo.GtResult;
import com.zywl.pojo.Student;
import com.zywl.service.AdminService;
import com.zywl.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Author: Shenyz
 * Date: 2020/3/17 15:30
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/login")
    @ResponseBody
    public GtResult userLoginByUser(Admin admin, String vercode, HttpServletRequest req){
        HttpSession session = req.getSession();
        GtResult result = new GtResult();
        String loginCode = (String) session.getAttribute("loginCode");
        if (loginCode.equalsIgnoreCase(vercode)) {//判断验证码
            if(admin!=null){
                Admin loginUser = adminService.selByAdmin(admin);
                System.out.println(loginUser+"------");
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
    public int updateUser(Admin user,HttpServletRequest req){
        HttpSession session = req.getSession();
        Admin LoginUser = (Admin) session.getAttribute("user");

        user.setId(LoginUser.getId());

        LoginUser.setPwd(user.getPwd());
        session.setAttribute("user",LoginUser);

        return  adminService.update(user);
    }
}
