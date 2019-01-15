package com.rongyi.common.dto;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 梁来宾
 * @Date: Created in 2018/3/1 17:28
 */
public class ApiResultMetadataDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
    private static final int SUCCESS_CODE = 0;
    private static final String SUCCESS_MSG = "操作成功";
    private static final int COMMON_ERR_CODE = 1;
    private static final String COMMON_ERR_MSG = "操作失败";
    private static final ApiResultMetadataDTO SUCCESS_METADATA = new ApiResultMetadataDTO(SUCCESS_CODE, SUCCESS_MSG);
    private static final ApiResultMetadataDTO COMMON_ERR_METADATA = new ApiResultMetadataDTO(COMMON_ERR_CODE, COMMON_ERR_MSG);
    private int errno;      //错误码
    private String msg;     //提示信息
    
    public boolean isSuccess() {
        return this.errno == SUCCESS_CODE;
    }
    private ApiResultMetadataDTO(int errno, String msg) {
        this.errno = errno;
        this.msg = msg;
    }

    public static ApiResultMetadataDTO success() {
        return SUCCESS_METADATA;
    }

    public static ApiResultMetadataDTO fail() {
        return COMMON_ERR_METADATA;
    }

    public static ApiResultMetadataDTO fail(int code) {
        return new ApiResultMetadataDTO(code, COMMON_ERR_MSG);
    }
    public static ApiResultMetadataDTO fail(String msg) {
        return new ApiResultMetadataDTO(COMMON_ERR_CODE, msg);
    }

    public static ApiResultMetadataDTO fail(int coce, String msg) {
        return new ApiResultMetadataDTO(coce, msg);
    }

    public int getErrno() {
        return errno;
    }

    public String getMsg() {
        return msg;
    }
}
