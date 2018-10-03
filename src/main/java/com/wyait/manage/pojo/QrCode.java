package com.wyait.manage.pojo;

import java.util.Date;

public class QrCode {
    private String qrId;

    private String taskId;

    private String initiator;

    private String qrPhone;

    private String qrUrl;

    private String qrName;

    private String qrStatus;

    private String completer;

    private String completeUrl;

    private String remark;

    private Date lockTime;

    private Date completeTime;

    private String serverStatus;

    private String createuser;

    private Date createtime;

    private String updateuser;

    private Date updatetime;

    public String getQrId() {
        return qrId;
    }

    public void setQrId(String qrId) {
        this.qrId = qrId == null ? null : qrId.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator == null ? null : initiator.trim();
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
        this.qrUrl = qrUrl == null ? null : qrUrl.trim();
    }

    public String getQrName() {
        return qrName;
    }

    public void setQrName(String qrName) {
        this.qrName = qrName == null ? null : qrName.trim();
    }

    public String getQrStatus() {
        return qrStatus;
    }

    public void setQrStatus(String qrStatus) {
        this.qrStatus = qrStatus == null ? null : qrStatus.trim();
    }

    public String getCompleter() {
        return completer;
    }

    public void setCompleter(String completer) {
        this.completer = completer == null ? null : completer.trim();
    }

    public String getCompleteUrl() {
        return completeUrl;
    }

    public void setCompleteUrl(String completeUrl) {
        this.completeUrl = completeUrl == null ? null : completeUrl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(String serverStatus) {
        this.serverStatus = serverStatus == null ? null : serverStatus.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}