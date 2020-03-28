package com.zywl.service;


import com.zywl.pojo.GtPageResult;
import com.zywl.pojo.StuEpidemic;

public interface StuEpidemicService {

    int insert(StuEpidemic stuEpidemic);

    int delete(Long id);

    GtPageResult selAll(StuEpidemic stuEpidemic,int page, int limit);

    StuEpidemic selByStuEpidemic(String stuno,String date);

    GtPageResult selAllByStudent(StuEpidemic stuEpidemic,String stuno,int page, int limit);
}
