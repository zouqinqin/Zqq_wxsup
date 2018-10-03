package com.wyait.manage.dao;


import com.wyait.manage.pojo.PutForward;

import java.util.List;

public interface PutForwardMapper {
    int deleteByPrimaryKey(String recordno);

    int insert(PutForward record);

    PutForward selectByPrimaryKey(String recordno);

    List<PutForward> selectAll();

    int updateByPrimaryKey(PutForward record);
}