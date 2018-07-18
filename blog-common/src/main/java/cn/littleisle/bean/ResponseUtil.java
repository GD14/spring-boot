package cn.littleisle.bean;

public class ResponseUtil {
    public static Response success(Object object) {
        Response responseMessage = new Response();
        responseMessage.setCode(ResultEnum.SUCCESS.getCode());
        responseMessage.setMsg(ResultEnum.SUCCESS.getMsg());
        responseMessage.setData(object);
        return responseMessage;
    }

    /**
     * 操作成功不返回消息
     * @return
     */
    public static Response success() {
        return success(null);
    }

    /**
     * 操作失败返回的消息
     * @param code
     * @param msg
     * @return
     */
    public static Response error(int code,String msg) {
        Response responseMessage = new Response();
        responseMessage.setCode(code);
        responseMessage.setMsg(msg);
        return responseMessage;
    }

    /**
     * 操作失败返回消息，对error的重载
     * @param resultEnum
     * @return
     */
    public static Response error(ResultEnum resultEnum){
        Response responseMessage = new Response();
        responseMessage.setCode(resultEnum.getCode());
        responseMessage.setMsg(resultEnum.getMsg());
        return responseMessage;
    }
}
