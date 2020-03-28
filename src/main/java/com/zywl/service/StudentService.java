package com.zywl.service;


import com.zywl.pojo.GtPageResult;
import com.zywl.pojo.StuEpidemic;
import com.zywl.pojo.Student;

public interface StudentService {

    Student selByStudent(Student student);

    GtPageResult selAll(int page, int limit);

    int insert(Student student);

    int delete(String id);

    int update(Student student);

}
