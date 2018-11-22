package com.xiaohe.fileDemo.app.file.response;


import com.xiaohe.fileDemo.framework.Response;

/**
 * 整合了买家和卖家的资料的响应
 */
public class PageResponse extends Response {

    private int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

