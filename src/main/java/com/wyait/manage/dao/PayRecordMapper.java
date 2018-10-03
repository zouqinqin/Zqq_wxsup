package com.wyait.manage.dao;


import com.wyait.manage.entity.PayRecordDTO;
import com.wyait.manage.entity.PayRecordSearchDTO;
import com.wyait.manage.pojo.PayRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayRecordMapper {
    int deleteByPrimaryKey(String recordno);

    int insert(PayRecord record);

    PayRecord selectByPrimaryKey(String recordno);

    List<PayRecord> selectAll();

    int updateByPrimaryKey(PayRecord record);

    /**
     * 分页查询用户数据
     * @return
     */
    List<PayRecordDTO> getRecordList(@Param("payRecordSearch") PayRecordSearchDTO payRecordSearchDTO);
}