package com.xj.swagger.model.response;

import java.util.List;

public class QueryResponseResult<T> extends ResponseResult {
    private List<T> data;
    public QueryResponseResult(ResultCode resultCode,List<T> data) {
        super(resultCode);
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
