package com.rongyi.common.dto;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 梁来宾
 * @Date: Created in 2018/3/1 17:55
 */
public class ApiResultBodyDTO<T> implements Serializable{
	private static final long serialVersionUID = 1L;
    private T data;
    private PageRespDTO page;

    public T getData() {
        return data;
    }

    public PageRespDTO getPage() {
        return page;
    }

    public ApiResultBodyDTO(T data, PageRespDTO page) {
        this.data = data;
        this.page = page;
    }

    public static <T> ApiResultBodyDTO<T> of(T data){
        return new ApiResultBodyDTO<T>(data, (PageRespDTO)null);
    }


    public static <T> ApiResultBodyDTO<T> noDataWithPage(){
        return new ApiResultBodyDTO<T>((T)null, new PageRespDTO());
    }
}
