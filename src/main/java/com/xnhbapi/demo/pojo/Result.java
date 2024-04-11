package com.xnhbapi.demo.pojo;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result(){

    }
    public Result(int code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public static Result success(){
        return new Result(200, "操作成功", null);
    }
    public static <V> Result<V> success(V data){
        return new Result<>(200, "操作成功", data);
    }
    public static Result error(String message){
        return new Result( 1, message,null);
    }
}
