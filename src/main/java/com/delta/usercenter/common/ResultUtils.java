package com.delta.usercenter.common;

/**
 * 返回工具类
 *
 * @author delta
 */
public class ResultUtils {
    /**
     * 成功
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     * @param code
     * @param message
     * @param desciption
     * @return
     */
    public static BaseResponse error(int code, String message, String desciption) {
        return new BaseResponse<>(code, null, message, desciption);
    }

    /**
     * 失败
     * @param errorCode
     * @param message
     * @param desciption
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message, String desciption) {
        return new BaseResponse<>(errorCode.getCode(),null, message, desciption);
    }

    /**
     * 失败
     * @param errorCode
     * @param desciption
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String desciption) {
        return new BaseResponse<>(errorCode.getCode(),null, errorCode.getMessage(), desciption);
    }
}
