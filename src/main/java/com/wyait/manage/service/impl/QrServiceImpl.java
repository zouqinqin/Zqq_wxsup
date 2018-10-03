package com.wyait.manage.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyait.manage.common.DateUtil;
import com.wyait.manage.dao.QrCodeMapper;
import com.wyait.manage.entity.QrCodeDTO;
import com.wyait.manage.entity.QrCodeSearchDTO;
import com.wyait.manage.service.QrService;
import com.wyait.manage.utils.PageDataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class QrServiceImpl implements QrService {

    @Autowired
    private QrCodeMapper qrCodeMapper;
    
    /** 
    * @Description: 二维码列表分页查询 
    * @Param: [qrCodeSearchDTO, page, limit] 
    * @return: com.wyait.manage.utils.PageDataResult 
    * @Author: Chenjf
    * @Date: 2018/8/29 
    */
    @Override
    public PageDataResult getQrCodeList(QrCodeSearchDTO qrCodeSearchDTO, Integer page, Integer limit){
        // 时间处理
        if (null != qrCodeSearchDTO) {
            if (StringUtils.isNotEmpty(qrCodeSearchDTO.getInsertTimeStart())
                    && StringUtils.isEmpty(qrCodeSearchDTO.getInsertTimeEnd())) {
                qrCodeSearchDTO.setInsertTimeEnd(DateUtil.format(new Date()));
            } else if (StringUtils.isEmpty(qrCodeSearchDTO.getInsertTimeStart())
                    && StringUtils.isNotEmpty(qrCodeSearchDTO.getInsertTimeEnd())) {
                qrCodeSearchDTO.setInsertTimeStart(DateUtil.format(new Date()));
            }
            if (StringUtils.isNotEmpty(qrCodeSearchDTO.getInsertTimeStart())
                    && StringUtils.isNotEmpty(qrCodeSearchDTO.getInsertTimeEnd())) {
                if (qrCodeSearchDTO.getInsertTimeEnd().compareTo(
                        qrCodeSearchDTO.getInsertTimeStart()) < 0) {
                    String temp = qrCodeSearchDTO.getInsertTimeStart();
                    qrCodeSearchDTO
                            .setInsertTimeStart(qrCodeSearchDTO.getInsertTimeEnd());
                    qrCodeSearchDTO.setInsertTimeEnd(temp);
                }
            }
        }

        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(page, limit);
        //根据用户角色调用不同sql
        List<QrCodeDTO> qrCodeList = new ArrayList<>();
        //若为官方用户
        if (qrCodeSearchDTO.getUserType().equals("1")){
            qrCodeList = qrCodeMapper.getQrCodeList(qrCodeSearchDTO);
        }else if (qrCodeSearchDTO.getUserType().equals("2")){
            qrCodeList = qrCodeMapper.getQrCodeListForReg(qrCodeSearchDTO);
        }else if (qrCodeSearchDTO.getUserType().equals("3")){
            qrCodeList = qrCodeMapper.getQrCodeListForChan(qrCodeSearchDTO);
        }

        // 获取分页查询后的数据
        PageInfo<QrCodeDTO> pageInfo = new PageInfo<>(qrCodeList);
        // 设置获取到的总记录数total：
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());

        //TODO 将用户ID转变为对应名称


        pdr.setList(qrCodeList);
        return pdr;
    }
}
