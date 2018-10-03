package com.wyait.manage.web.finance;

import com.wyait.manage.entity.PayRecordSearchDTO;
import com.wyait.manage.service.FinanceService;
import com.wyait.manage.utils.PageDataResult;
import com.wyait.manage.web.user.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @项目名称：wyait-manage
 * @包名：com.wyait.manage.web.finance
 * @类描述：
 * @创建人：chenjf
 * @创建时间：2018/08/27 18:22
 * @version：V1.0
 */
@Controller
@RequestMapping("/finance")
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    private static final Logger logger = LoggerFactory
            .getLogger(UserController.class);


    @RequestMapping("/payRecord")
    public String payRecordList() {
        return "/finance/payRecord";
    }

    /**
     * 分页查询用户列表
     * @return ok/fail
     */
    @RequestMapping(value = "/getRecord", method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult getPayRecord(@RequestParam("page") Integer page,
                                   @RequestParam("limit") Integer limit, PayRecordSearchDTO payRecordSearchDTO) {

//		ErrorController
        PageDataResult pdr = new PageDataResult();
        try {
            if (null == page) {
                page = 1;
            }
            if (null == limit) {
                limit = 10;
            }

            // 获取充值记录列表
            pdr = financeService.getRecordList(payRecordSearchDTO, page, limit);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("用户列表查询异常！", e);
        }
        return pdr;
    }
}
