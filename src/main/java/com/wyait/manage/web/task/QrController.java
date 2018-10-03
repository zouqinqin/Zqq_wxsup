package com.wyait.manage.web.task;

import com.wyait.manage.entity.QrCodeSearchDTO;
import com.wyait.manage.entity.UserRoleDTO;
import com.wyait.manage.service.QrService;
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

import javax.servlet.http.HttpSession;

/**
 * @项目名称：wyait-manage
 * @包名：com.wyait.manage.web.task
 * @类描述：
 * @创建人：chenjf
 * @创建时间：2018/08/29 18:22
 * @version：V1.0
 */
@Controller
@RequestMapping("/task")
public class QrController {

    @Autowired
    private QrService qrService;

    private static final Logger logger = LoggerFactory
            .getLogger(UserController.class);

    @RequestMapping("/qrList")
    public String qrListList(HttpSession session) {
        //获取当前用户类型(缓存获取) 0:官方管理员 1：注册方用户 2：渠道方用户
        UserRoleDTO userRoleDTO = (UserRoleDTO) session.getAttribute("userInfo");
        if (userRoleDTO.getRoleId().equals("1")){
            //指向官方页面
            return "/task/qrCode";
        }else if (userRoleDTO.getRoleId().equals("2"))
        {
            //指向注册方页面
            return "/task/qrCodeForReg";
        }else if (userRoleDTO.getRoleId().equals("3"))
        {
            //指向渠道方页面
            return "/task/qrCodeForChan";
        }
        return "";
    }

    /**
     * 分页查询用户列表
     * @return ok/fail
     */
    @RequestMapping(value = "/getQrList", method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult getPayRecord(@RequestParam("page") Integer page,
                                       @RequestParam("limit") Integer limit, QrCodeSearchDTO qrCodeSearchDTO,HttpSession session) {

//		ErrorController
        PageDataResult pdr = new PageDataResult();
        try {
            if (null == page) {
                page = 1;
            }
            if (null == limit) {
                limit = 10;
            }

            //获取当前用户ID以及用户类型并赋值到查询条件类
            UserRoleDTO userRoleDTO = (UserRoleDTO) session.getAttribute("userInfo");
            qrCodeSearchDTO.setUserId(userRoleDTO.getId().toString());
            qrCodeSearchDTO.setUserType(userRoleDTO.getRoleId());

            // 获取二维码记录列表
            pdr = qrService.getQrCodeList(qrCodeSearchDTO, page, limit);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("二维码任务列表查询异常！", e);
        }
        return pdr;
    }
}
