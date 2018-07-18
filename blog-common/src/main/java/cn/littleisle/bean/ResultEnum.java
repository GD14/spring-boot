package cn.littleisle.bean;

public enum ResultEnum {

    /**
     * 操作成功
     */
    SUCCESS                     (0,    "操作成功"),


    /**
     * 登录验证错误
     * 错误码:90XX
     */
    USER_NEED_LOGIN_ERROR       (9001, "未登录"),
    USER_REPEAT_REGISTER_ERROR  (9002, "该用户已注册"),
    USER_NOT_EXIST_ERROR        (9003,  "不存在该用户"),
    USER_PASSWORD_ERROR         (9004,  "密码错误"),
    USER_EMPTY_USERNAME_ERROR   (9005,  "用户名为空"),
    USER_EMPTY_PASSWORD_ERROR   (9006,  "密码为空"),

    /**
     * 系统错误
     * 错误码:80XX
     */
    SYSTEM_ERROR                (8001,"系统错误"),

    /**
     *未知错误
     * 错误码:40XX
     */
    UNKNOWN_ERROR               (4001, "未知错误");



    private Integer code;

    private String msg;

    private ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
