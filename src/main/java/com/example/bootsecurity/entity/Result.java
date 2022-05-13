package com.example.bootsecurity.entity;

/**
 * @ClassName: Result
 * @Description:
 * @date: 2022/5/10 20:18
 * @version: 1.0.0
 */
public class Result {

    private Integer code;
    private Object data;

    public Result() {
    }

    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", data=" + data +
                '}';
    }
}
