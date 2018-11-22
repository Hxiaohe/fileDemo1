package com.xiaohe.fileDemo.app.file.response;


import com.xiaohe.fileDemo.framework.Response;

public class FileResponse extends Response {

    private String userAvatarUrl;

    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl;
    }
}
