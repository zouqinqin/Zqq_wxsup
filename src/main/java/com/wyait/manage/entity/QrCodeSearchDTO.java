package com.wyait.manage.entity;

public class QrCodeSearchDTO {

    private Integer page;

    private Integer limit;

    private String taskId;

    private String status;

    private String serverStatus;

    private String insertTimeStart;

    private String insertTimeEnd;

    private String userId;

    private String userType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(String serverStatus) {
        this.serverStatus = serverStatus;
    }

    public String getInsertTimeStart() {
        return insertTimeStart;
    }

    public void setInsertTimeStart(String insertTimeStart) {
        this.insertTimeStart = insertTimeStart;
    }

    public String getInsertTimeEnd() {
        return insertTimeEnd;
    }

    public void setInsertTimeEnd(String insertTimeEnd) {
        this.insertTimeEnd = insertTimeEnd;
    }

    @Override public String toString() {
        return "QrCodeSearchDTO{" + "page=" + page + ", limit=" + limit
                + ", taskId='" + taskId + '\'' + ", status='" + status + '\'' + ", serverStatus='" + serverStatus + '\''
                + ", insertTimeStart='" + insertTimeStart + '\''
                + ", insertTimeEnd='" + insertTimeEnd + '\''
                + ", userId='" + userId + '\''+ '}';
    }
}
