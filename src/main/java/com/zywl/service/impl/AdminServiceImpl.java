package com.zywl.service.impl;


import com.zywl.mapper.AdminMapper;
import com.zywl.pojo.Admin;
import com.zywl.pojo.AdminExample;
import com.zywl.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin selByAdmin(Admin admin) {
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(admin.getUsername()).andPwdEqualTo(admin.getPwd());
        List<Admin> admins = adminMapper.selectByExample(example);
        if(admins!=null&&admins.size()>0)
            return admins.get(0);
        return null;
    }

    @Override
    public int update(Admin admin) {
        return adminMapper.updateByPrimaryKeySelective(admin);
    }
}
