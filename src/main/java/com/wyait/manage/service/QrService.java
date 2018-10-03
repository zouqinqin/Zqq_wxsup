package com.wyait.manage.service;

import com.wyait.manage.entity.QrCodeSearchDTO;
import com.wyait.manage.utils.PageDataResult;

public interface QrService {


    PageDataResult getQrCodeList(QrCodeSearchDTO qrCodeSearchDTO, Integer page, Integer limit);
}
