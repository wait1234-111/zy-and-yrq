package com.zywl.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zywl.mapper.StudentMapper;
import com.zywl.pojo.*;
import com.zywl.service.StudentService;
import com.zywl.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    @Resource
    private  StudentMapper studentMapper;

    @Override
    public Student selByStudent(Student student) {
        StudentExample example = new StudentExample();
        example.createCriteria().andStunoEqualTo(student.getStuno()).andPwdEqualTo(student.getPwd());
        List<Student> list = studentMapper.selectByExample(example);
        if(list!=null&&list.size()>0)
            return list.get(0);
        return null;
    }

    @Override
    public GtPageResult selAll(int page, int limit) {
        GtPageResult res = new GtPageResult();
        PageHelper.startPage(page,limit);
        List<Student> list = studentMapper.selectByExample(new StudentExample());
        PageInfo<Student> info = new PageInfo<Student>(list);
        res.setData(info.getList());
        res.setMsg("查询全部成功");
        res.setCount((int) info.getTotal());
        res.setCode(0);
        return res;
    }

    @Override
    public int insert(Student student) {
        student.setId(IDUtils.genItemId());
        return studentMapper.insert(student);
    }

    @Override
    public int delete(String id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }


}
