package com.rongyi.common.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @Author: 梁来宾
 * @Date: Created in 2018/3/1 17:09
 */
public class ApiResult<T> implements Serializable{
	private static final long serialVersionUID = 1L;
	//private static final ApiResult<Void> SUCCESS_API_RESULT = new ApiResult<>(ApiResultMetadataDTO.success());
	private ApiResultMetadataDTO meta;
	private ApiResultBodyDTO<T> result;

	public ApiResult(ApiResultMetadataDTO meta) {
		this.meta = meta;
	}

    public boolean isSuccess() {
        return this.meta.isSuccess();
    }
    
	/*public static ApiResult<Void> success() {
		return SUCCESS_API_RESULT;
	}*/

	public static <T> ApiResult<T> success() {
		return success((T) null);
	}

	/**
	 * 
	 * Description: 不分页
	 *
	 * @param data
	 * @return
	 * @author lianglaibin
	 * @date 2018年5月3日
	 */
	public static <T> ApiResult<T> success(T data) {
		ApiResult<T> apiResult = new ApiResult<T>(ApiResultMetadataDTO.success());
		apiResult.setResult(ApiResultBodyDTO.of(data));
		return apiResult;
	}

	public static <T> ApiResult<List<T>> success(ApiResultBodyDTO<List<T>> body) {
		ApiResult<List<T>> apiResult = new ApiResult<>(ApiResultMetadataDTO.success());
		apiResult.setResult(body);
		return apiResult;
	}

	/*public static ApiResult<Void> fail(String msg) {
		return new ApiResult<Void>(ApiResultMetadataDTO.fail(msg));
	}*/
	
	public static <T> ApiResult<T> fail(String msg) {
	    return new ApiResult<T>(ApiResultMetadataDTO.fail(msg));
	}

	public static ApiResult<Void> fail(int code, String msg) {
		return new ApiResult<Void>(ApiResultMetadataDTO.fail(code, msg));
	}

	public ApiResultMetadataDTO getMeta() {
		return meta;
	}

	public ApiResultBodyDTO<T> getResult() {
		return result;
	}

	public void setResult(ApiResultBodyDTO<T> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "ApiResult [meta=" + meta + ", result=" + result + "]";
	}
}
