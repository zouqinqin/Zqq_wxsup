package com.wyait.manage.dao;


import com.wyait.manage.entity.QrCodeDTO;
import com.wyait.manage.entity.QrCodeSearchDTO;
import com.wyait.manage.pojo.QrCode;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QrCodeMapper {
    int deleteByPrimaryKey(String qrId);

    int insert(QrCode record);

    QrCode selectByPrimaryKey(String qrId);

    List<QrCode> selectAll();

    int updateByPrimaryKey(QrCode record);

    List<QrCodeDTO> getQrCodeList(@Param("qrCodeSearch") QrCodeSearchDTO qrCodeSearchDTO);

    List<QrCodeDTO> getQrCodeListForReg(@Param("qrCodeSearch") QrCodeSearchDTO qrCodeSearchDTO);

    List<QrCodeDTO> getQrCodeListForChan(@Param("qrCodeSearch") QrCodeSearchDTO qrCodeSearchDTO);
}