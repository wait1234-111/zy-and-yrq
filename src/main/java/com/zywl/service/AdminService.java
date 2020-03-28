package com.zywl.service;


import com.zywl.pojo.Admin;

public interface AdminService {

    Admin selByAdmin(Admin admin);

    int update(Admin admin);
}
