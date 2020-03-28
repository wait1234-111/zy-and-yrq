package com.zywl.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zywl.mapper.StuEpidemicMapper;
import com.zywl.pojo.GtPageResult;
import com.zywl.pojo.StuEpidemic;
import com.zywl.pojo.StuEpidemicExample;
import com.zywl.service.StuEpidemicService;
import com.zywl.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class StuEpidemicServiceImpl implements StuEpidemicService {

    @Resource
    private StuEpidemicMapper stuEpidemicMapper;

    @Override
    public int insert(StuEpidemic stuEpidemic) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        stuEpidemic.setFillintdate(date);
        stuEpidemic.setId(IDUtils.genItemId());
        return stuEpidemicMapper.insertSelective(stuEpidemic);
    }

    @Override
    public int delete(Long id) {
     return stuEpidemicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public GtPageResult selAll(StuEpidemic stuEpidemic,int page, int limit) {
        GtPageResult res = new GtPageResult();
        PageHelper.startPage(page,limit);
        StuEpidemicExample example = new StuEpidemicExample();
        StuEpidemicExample.Criteria criteria = example.createCriteria();
        if(stuEpidemic!=null){
            System.out.println("+========================");
            if(stuEpidemic.getClassname()!=null&&!"".equals(stuEpidemic.getClassname())){
                System.out.println("+===============1=========");
                criteria.andClassnameEqualTo(stuEpidemic.getClassname());
            }
            if(stuEpidemic.getColleage()!=null&&!"".equals(stuEpidemic.getColleage())){
                System.out.println("+======================2==");
                criteria.andColleageEqualTo(stuEpidemic.getColleage());
            }
            if(stuEpidemic.getInhubei()!=null&&!"".equals(stuEpidemic.getInhubei())){
                System.out.println("+=======================3=");
                criteria.andInhubeiEqualTo(stuEpidemic.getInhubei());
            }
            if(stuEpidemic.getInwuhan()!=null&&!"".equals(stuEpidemic.getInwuhan())){
                System.out.println("+======================4==");
                criteria.andInwuhanEqualTo(stuEpidemic.getInwuhan());
            }
            if(stuEpidemic.getIsabroad()!=null&&!"".equals(stuEpidemic.getIsabroad())){
                System.out.println("+=======================5=");
                criteria.andIsabroadEqualTo(stuEpidemic.getIsabroad());
            }
            if(stuEpidemic.getIsdiagnose()!=null&&!"".equals(stuEpidemic.getIsdiagnose())){
                System.out.println("+=======================6=");
                criteria.andIsdiagnoseEqualTo(stuEpidemic.getIsdiagnose());
            }
            if(stuEpidemic.getIsdistrust()!=null&&!"".equals(stuEpidemic.getIsdistrust())){
                System.out.println("+=======================7=");
                criteria.andIsdistrustEqualTo(stuEpidemic.getIsdistrust());
            }
            if(stuEpidemic.getIsgotoschool()!=null&&!"".equals(stuEpidemic.getIsgotoschool())){
                System.out.println("+========================8");
                criteria.andIsgotoschoolEqualTo(stuEpidemic.getIsgotoschool());
            }
            if(stuEpidemic.getIshubei()!=null&&!"".equals(stuEpidemic.getIshubei())){
                System.out.println("+========================9");
                criteria.andIshubeiEqualTo(stuEpidemic.getIshubei());
            }
            if(stuEpidemic.getIshubeicontact()!=null&&!"".equals(stuEpidemic.getIshubeicontact())){
                System.out.println("+========================10");
                criteria.andIshubeicontactEqualTo(stuEpidemic.getIshubeicontact());
            }
            if(stuEpidemic.getIswuhancontact()!=null&&!"".equals(stuEpidemic.getIswuhancontact())){
                System.out.println("+========================11");
                criteria.andIswuhancontactEqualTo(stuEpidemic.getIswuhancontact());
            }
            if(stuEpidemic.getIwuhan()!=null&&!"".equals(stuEpidemic.getIwuhan())){
                System.out.println("+========================12");
                criteria.andIwuhanEqualTo(stuEpidemic.getIwuhan());
            }
            if(stuEpidemic.getStuname()!=null&&!"".equals(stuEpidemic.getStuname())){
                System.out.println("+========================13");
                criteria.andStunameEqualTo(stuEpidemic.getStuname());
            }
        }
        List<StuEpidemic> list = stuEpidemicMapper.selectByExample(example);
        PageInfo<StuEpidemic> info = new PageInfo<StuEpidemic>(list);
        res.setData(info.getList());
        res.setMsg("查询全部成功");
        res.setCount((int) info.getTotal());
        res.setCode(0);
        return res;
    }
    @Override
    public GtPageResult selAllByStudent(StuEpidemic stuEpidemic,String stuno,int page, int limit) {
        GtPageResult res = new GtPageResult();
        PageHelper.startPage(page,limit);
        StuEpidemicExample example = new StuEpidemicExample();
        StuEpidemicExample.Criteria criteria = example.createCriteria();
        criteria.andStunoEqualTo(stuno);
        if(stuEpidemic!=null){
            System.out.println("+========================");
            if(stuEpidemic.getClassname()!=null&&!"".equals(stuEpidemic.getClassname())){
                System.out.println("+===============1=========");
                criteria.andClassnameEqualTo(stuEpidemic.getClassname());
            }
              if(stuEpidemic.getColleage()!=null&&!"".equals(stuEpidemic.getColleage())){
                  System.out.println("+======================2==");
                criteria.andColleageEqualTo(stuEpidemic.getColleage());
            }
              if(stuEpidemic.getInhubei()!=null&&!"".equals(stuEpidemic.getInhubei())){
                  System.out.println("+=======================3=");
                criteria.andInhubeiEqualTo(stuEpidemic.getInhubei());
            }
              if(stuEpidemic.getInwuhan()!=null&&!"".equals(stuEpidemic.getInwuhan())){
                  System.out.println("+======================4==");
                criteria.andInwuhanEqualTo(stuEpidemic.getInwuhan());
            }
              if(stuEpidemic.getIsabroad()!=null&&!"".equals(stuEpidemic.getIsabroad())){
                  System.out.println("+=======================5=");
                criteria.andIsabroadEqualTo(stuEpidemic.getIsabroad());
            }
              if(stuEpidemic.getIsdiagnose()!=null&&!"".equals(stuEpidemic.getIsdiagnose())){
                  System.out.println("+=======================6=");
                criteria.andIsdiagnoseEqualTo(stuEpidemic.getIsdiagnose());
            }
              if(stuEpidemic.getIsdistrust()!=null&&!"".equals(stuEpidemic.getIsdistrust())){
                  System.out.println("+=======================7=");
                criteria.andIsdistrustEqualTo(stuEpidemic.getIsdistrust());
            }
              if(stuEpidemic.getIsgotoschool()!=null&&!"".equals(stuEpidemic.getIsgotoschool())){
                  System.out.println("+========================8");
                criteria.andIsgotoschoolEqualTo(stuEpidemic.getIsgotoschool());
            }
              if(stuEpidemic.getIshubei()!=null&&!"".equals(stuEpidemic.getIshubei())){
                  System.out.println("+========================9");
                criteria.andIshubeiEqualTo(stuEpidemic.getIshubei());
            }
              if(stuEpidemic.getIshubeicontact()!=null&&!"".equals(stuEpidemic.getIshubeicontact())){
                  System.out.println("+========================10");
                criteria.andIshubeicontactEqualTo(stuEpidemic.getIshubeicontact());
            }
              if(stuEpidemic.getIswuhancontact()!=null&&!"".equals(stuEpidemic.getIswuhancontact())){
                  System.out.println("+========================11");
                criteria.andIswuhancontactEqualTo(stuEpidemic.getIswuhancontact());
            }
              if(stuEpidemic.getIwuhan()!=null&&!"".equals(stuEpidemic.getIwuhan())){
                  System.out.println("+========================12");
                criteria.andIwuhanEqualTo(stuEpidemic.getIwuhan());
            }
              if(stuEpidemic.getStuname()!=null&&!"".equals(stuEpidemic.getStuname())){
                  System.out.println("+========================13");
                criteria.andStunameEqualTo(stuEpidemic.getStuname());
            }
        }

        List<StuEpidemic> list = stuEpidemicMapper.selectByExample(example);

        PageInfo<StuEpidemic> info = new PageInfo<StuEpidemic>(list);
        res.setData(info.getList());
        res.setMsg("查询全部成功");
        res.setCount((int) info.getTotal());
        res.setCode(0);
        return res;
    }

    @Override
    public StuEpidemic selByStuEpidemic(String stuno, String date) {
        StuEpidemicExample example = new StuEpidemicExample();
        example.createCriteria().andStunoEqualTo(stuno).andFillintdateEqualTo(date);
        List<StuEpidemic> lists = stuEpidemicMapper.selectByExample(example);
        if(lists!=null&&lists.size()>0)
            return lists.get(0);
        return null;
    }
}
