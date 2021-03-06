package com.woyou.androidsample.bean;

import java.io.Serializable;

/**
 * Created by Xiho on 2016/3/14.
 */
public class FamousInfoReq implements Serializable{
    public String apiKey;
    public String keyword; //关键字
    public int page;  //请求页数，默认page=1
    public int rows;   //返回记录条数，默认rows=20,最大50

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
