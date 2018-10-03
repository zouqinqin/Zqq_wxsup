package com.wyait.manage.entity;

import java.util.Date;

/**
 * @program: wyait-manage
 * @description: 二维码列表返回类
 * @author: Chenjf
 * @create: 2018-08-29 16:22
 **/
public class QrCodeDTO {

    private String taskId;

    private String qrId;

    private String initiator;

    private String qrPhone;

    private String qrUrl;

    private String qrName;

    private String qrStatus;

    private String completer;

    private String completeUrl;

    private String remark;

    private String lockTime;

    private String completeTime;

    private String serverStatus;

    private String createuser;

    private String createtime;

    private String updateuser;

    private String updatetime;

    private String supPhone;

    public String getSupPhone() {
        return supPhone;
    }

    public void setSupPhone(String supPhone) {
        this.supPhone = supPhone;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getQrId() {
        return qrId;
    }

    public void setQrId(String qrId) {
        this.qrId = qrId;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getQrPhone() {
        return qrPhone;
    }

    public void setQrPhone(String qrPhone) {
        this.qrPhone = qrPhone;
    }

    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public String getQrName() {
        return qrName;
    }

    public void setQrName(String qrName) {
        this.qrName = qrName;
    }

    public String getQrStatus() {
        return qrStatus;
    }

    public void setQrStatus(String qrStatus) {
        this.qrStatus = qrStatus;
    }

    public String getCompleter() {
        return completer;
    }

    public void setCompleter(String completer) {
        this.completer = completer;
    }

    public String getCompleteUrl() {
        return completeUrl;
    }

    public void setCompleteUrl(String completeUrl) {
        this.completeUrl = completeUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(String serverStatus) {
        this.serverStatus = serverStatus;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "QrCode [taskId=" + taskId + ", qrId=" + qrId + ", initiator=" + initiator
                + ", qrPhone=" + qrPhone + ", qrUrl=" + qrUrl + ", qrStatus=" + qrStatus
                + ", completer=" + completer + ", remark=" + remark + ", supPhone=" + supPhone
                + ", lockTime=" + lockTime + ", complete_time=" + completeTime
                + ", lockTime=" + lockTime + ", complete_time=" + completeTime
                + ", serverStatus=" + serverStatus + ", createuser=" + createuser
                + ", createtime=" + createtime + ", updateuser=" + updateuser
                + ", updatetime=" + updatetime +  "]";
    }
}
