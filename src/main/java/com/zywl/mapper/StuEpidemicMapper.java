package com.zywl.mapper;

import com.zywl.pojo.StuEpidemic;
import com.zywl.pojo.StuEpidemicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuEpidemicMapper {
    int countByExample(StuEpidemicExample example);

    int deleteByExample(StuEpidemicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StuEpidemic record);

    int insertSelective(StuEpidemic record);

    List<StuEpidemic> selectByExample(StuEpidemicExample example);

    StuEpidemic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StuEpidemic record, @Param("example") StuEpidemicExample example);

    int updateByExample(@Param("record") StuEpidemic record, @Param("example") StuEpidemicExample example);

    int updateByPrimaryKeySelective(StuEpidemic record);

    int updateByPrimaryKey(StuEpidemic record);
}