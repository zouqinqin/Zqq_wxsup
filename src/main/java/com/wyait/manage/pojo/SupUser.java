package com.wyait.manage.pojo;

import java.util.Date;

public class SupUser {
    private String supUserid;

    private String supPhone;

    private String supSource;

    private String taskId;

    private String taskType;

    private String status;

    private String ip;

    private String createuser;

    private Date createtime;

    private String updateuser;

    private Date updatetime;

    public String getSupUserid() {
        return supUserid;
    }

    public void setSupUserid(String supUserid) {
        this.supUserid = supUserid == null ? null : supUserid.trim();
    }

    public String getSupPhone() {
        return supPhone;
    }

    public void setSupPhone(String supPhone) {
        this.supPhone = supPhone == null ? null : supPhone.trim();
    }

    public String getSupSource() {
        return supSource;
    }

    public void setSupSource(String supSource) {
        this.supSource = supSource == null ? null : supSource.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
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