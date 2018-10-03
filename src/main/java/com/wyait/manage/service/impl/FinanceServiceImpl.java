package com.wyait.manage.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyait.manage.common.DateUtil;
import com.wyait.manage.dao.PayRecordMapper;
import com.wyait.manage.entity.PayRecordDTO;
import com.wyait.manage.entity.PayRecordSearchDTO;
import com.wyait.manage.entity.UserRoleDTO;
import com.wyait.manage.entity.UserSearchDTO;
import com.wyait.manage.service.FinanceService;
import com.wyait.manage.utils.PageDataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FinanceServiceImpl implements FinanceService {

    @Autowired
    private PayRecordMapper payRecordMapper;

    @Override
    public PageDataResult getRecordList(PayRecordSearchDTO payRecordSearchDTO, Integer page, Integer limit){
        // 时间处理
        if (null != payRecordSearchDTO) {
            if (StringUtils.isNotEmpty(payRecordSearchDTO.getInsertTimeStart())
                    && StringUtils.isEmpty(payRecordSearchDTO.getInsertTimeEnd())) {
                payRecordSearchDTO.setInsertTimeEnd(DateUtil.format(new Date()));
            } else if (StringUtils.isEmpty(payRecordSearchDTO.getInsertTimeStart())
                    && StringUtils.isNotEmpty(payRecordSearchDTO.getInsertTimeEnd())) {
                payRecordSearchDTO.setInsertTimeStart(DateUtil.format(new Date()));
            }
            if (StringUtils.isNotEmpty(payRecordSearchDTO.getInsertTimeStart())
                    && StringUtils.isNotEmpty(payRecordSearchDTO.getInsertTimeEnd())) {
                if (payRecordSearchDTO.getInsertTimeEnd().compareTo(
                        payRecordSearchDTO.getInsertTimeStart()) < 0) {
                    String temp = payRecordSearchDTO.getInsertTimeStart();
                    payRecordSearchDTO
                            .setInsertTimeStart(payRecordSearchDTO.getInsertTimeEnd());
                    payRecordSearchDTO.setInsertTimeEnd(temp);
                }
            }
        }

        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(page, limit);
        List<PayRecordDTO> urList = payRecordMapper.getRecordList(payRecordSearchDTO);
        // 获取分页查询后的数据
        PageInfo<PayRecordDTO> pageInfo = new PageInfo<>(urList);
        // 设置获取到的总记录数total：
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(urList);
        return pdr;
    }
}
