package com.wyait.manage.dao;


import com.wyait.manage.pojo.SupUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupUserMapper {
    int deleteByPrimaryKey(String supUserid);

    int insert(SupUser record);

    SupUser selectByPrimaryKey(String supUserid);

    List<SupUser> selectAll();

    int updateByPrimaryKey(SupUser record);
}