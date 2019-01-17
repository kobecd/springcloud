package com.arc.securityinmemory.model.vo;

import com.arc.securityinmemory.model.enums.ErrorCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 向前段统一返回数据，该类对结果做了统一封装
 *
 * @param <T>
 */
@Getter
@Setter
@ToString
public class ResponseVo<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    //状态信息
    private int code;
    private String msg;
    private Boolean success;

    //有效数据
    private T data;

    //构造器
    public ResponseVo() {
    }

    public ResponseVo(T data) {
        this.data = data;
    }

    public ResponseVo(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
        this.data = null;
    }

    public ResponseVo(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseVo(int code, String msg, Boolean success, T data) {
        this.code = code;
        this.msg = msg;
        this.success = success;
        this.data = data;
    }


    //success方法
    public static <T> ResponseVo<T> success(   ) {
        return new ResponseVo<T>(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getMsg(), Boolean.TRUE, null);
    }
    public static <T> ResponseVo<T> success(T data) {
        return new ResponseVo<T>(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getMsg(), Boolean.TRUE, data);
    }

    public static <T> ResponseVo<T> success(ErrorCode enumCode) {
        return new ResponseVo<T>(enumCode.getCode(), enumCode.getMsg(), Boolean.TRUE, null);
    }

    public static <T> ResponseVo<T> success(ErrorCode enumCode, T data) {
        return new ResponseVo<T>(enumCode.getCode(), enumCode.getMsg(), Boolean.TRUE, data);
    }

    //失败
    public static <T> ResponseVo<T> failure(ErrorCode enumCode) {
        return new ResponseVo<T>(enumCode.getCode(), enumCode.getMsg(), Boolean.FALSE, null);
    }

    public static <T> ResponseVo<T> failure(T data) {
        return new ResponseVo<T>(ErrorCode.FAILURE.getCode(), ErrorCode.FAILURE.getMsg(), Boolean.FALSE, data);
    }

    public static <T> ResponseVo<T> failure(ErrorCode enumCode, T data) {
        return new ResponseVo<T>(enumCode.getCode(), enumCode.getMsg(), Boolean.FALSE, data);
    }

    public static ResponseVo failure() {
        return new ResponseVo(ErrorCode.FAILURE);
    }

//
//    /**
//     * 处理微服务的返回结果
//     *
//     * @param response
//     * @param <T>
//     * @return
//     */
//    public static <T> ResponseVo<T> buildResponse(MicroServiceResponse<T> response) {
//        if (response == null) {
//            throw new BusinessRuntimeException(ErrorCode.NULL_RESPONSE);
//        }
//        return StringUtils.equals(response.getCode(), ErrorCode.SUCCESS.getCode()) ? ResponseVo.success(response.getData()) : ResponseVo.failure(ErrorCode.buildFailure(response.getCode(), response.getMsg()));
//    }
//
//    /**
//     * 处理微服务的返回结果（类型转换）
//     *
//     * @param response
//     * @param <T>
//     * @return
//     */
//    public static <T> ResponseVo<T> convertResponse(MicroServiceResponse<?> response, Class<T> target) {
//        if (response == null || target == null) {
//            throw new BusinessRuntimeException(ErrorCode.NULL_RESPONSE);
//        }
//        T instance = BeanCopierUtil.copyBean(response.getData(), target);
//        return StringUtils.equals(response.getCode(), ErrorCode.SUCCESS.getCode()) ? ResponseVo.success(instance) : ResponseVo.failure(ErrorCode.buildFailure(response.getCode(), response.getMsg()));
//    }
//
//    /**
//     * 处理微服务的返回结果（分页类型转换）
//     *
//     * @param response
//     * @param <T>
//     * @return
//     */
//    public static <T> ResponseVo<PageResponse<T>> convertPageResponse(MicroServiceResponse<? extends PageResponse> response, Class<T> target) {
//        if (response == null || target == null) {
//            throw new BusinessRuntimeException(ErrorCode.NULL_RESPONSE);
//        }
//        if (response.getData() == null) {
//            throw new BusinessRuntimeException(ErrorCode.PAGE_NULL_RESPONSE);
//        }
//        List<T> list = BeanCopierUtil.copyList(response.getData().getData(), target);
//        PageResponse<T> instance = new PageResponse<>();
//        instance.setData(list);
//        instance.setTotalPages(response.getData().getTotalPages());
//        instance.setTotalElements(response.getData().getTotalElements());
//        return StringUtils.equals(response.getCode(), ErrorCode.SUCCESS.getCode()) ? ResponseVo.success(instance) : ResponseVo.failure(ErrorCode.buildFailure(response.getCode(), response.getMsg()));
//    }
//
//    /**
//     * 处理微服务的返回结果（列表类型转换）
//     *
//     * @param response
//     * @param <T>
//     * @return
//     */
//    public static <T> ResponseVo<List<T>> convertListResponse(MicroServiceResponse<? extends List> response, Class<T> target) {
//        if (response == null || target == null) {
//            throw new BusinessRuntimeException(ErrorCode.NULL_RESPONSE);
//        }
//        List<T> instance = BeanCopierUtil.copyList(response.getData(), target);
//        return StringUtils.equals(response.getCode(), ErrorCode.SUCCESS.getCode()) ? ResponseVo.success(instance) : ResponseVo.failure(ErrorCode.buildFailure(response.getCode(), response.getMsg()));
//    }
//
//    /**
//     * 处理微服务的返回结果（含参数名映射列表类型转换）
//     *
//     * @param response
//     * @param <T>
//     * @return
//     */
//    public static <T> ResponseVo<List<T>> convertListResponse(MicroServiceResponse<? extends List> response, Class<T> target, Map<String, String> relation) {
//        if (response == null || target == null) {
//            throw new BusinessRuntimeException(ErrorCode.NULL_RESPONSE);
//        }
//        List<T> instance = BeanCopierUtil.copyList(response.getData(), target, relation);
//        return StringUtils.equals(response.getCode(), ErrorCode.SUCCESS.getCode()) ? ResponseVo.success(instance) : ResponseVo.failure(ErrorCode.buildFailure(response.getCode(), response.getMsg()));
//    }

}
