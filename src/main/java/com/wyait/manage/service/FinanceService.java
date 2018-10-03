package com.wyait.manage.service;

import com.wyait.manage.entity.PayRecordSearchDTO;
import com.wyait.manage.entity.UserSearchDTO;
import com.wyait.manage.utils.PageDataResult;

public interface FinanceService {

    PageDataResult getRecordList(PayRecordSearchDTO payRecordSearchDTO, Integer page, Integer limit);
}
