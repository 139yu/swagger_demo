package com.xj.swagger.model.response;

import java.util.List;

public class QueryResult<T> {
    private List<T> data;

    public QueryResult() {
    }

    public QueryResult(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "QueryResult{" +
                "data=" + data +
                '}';
    }

    public List<T> getList() {
        return data;
    }

    public void setList(List<T> list) {
        this.data = list;
    }
}
