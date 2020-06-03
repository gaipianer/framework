package org.gaipianer.framework.web.mvc;

/**
 * @author Coder
 * @date 2020/6/3.
 */
public class Result {

    public Result() {

    }

    public Result(Object data) {
        this.data = data;
        this.success = true;
    }

    public Result(String message) {
        this.message = message;
        this.success = false;
    }

    public static Result success(Object data) {
        return new Result(data);
    }

    public static Result success() {
        Result result = new Result();
        result.success = true;
        return result;
    }

    public static Result faild(String message) {
        return new Result(message);
    }

    public static Result faild() {
        Result result = new Result();
        result.success = false;
        return result;
    }


    /**
     * 返回数据
     * */
    protected Object data;

    /**
     * 请求是否成功
     * */
    protected boolean success;

    /**
     * 请求失败信息
     * */
    protected String message;


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
