package com.wyait.manage.dao;


import com.wyait.manage.pojo.Task;

import java.util.List;

public interface TaskMapper {
    int deleteByPrimaryKey(String taskId);

    int insert(Task record);

    Task selectByPrimaryKey(String taskId);

    List<Task> selectAll();

    int updateByPrimaryKey(Task record);
}