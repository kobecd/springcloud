package com.rongyi.core.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.rongyi.core.bean.ResponseVO.Meta;
import com.rongyi.core.bean.ResponseVO.Page;
import com.rongyi.core.bean.ResponseVO.Result;

/*
使用示例说明：
{
    "meta": {
        "msg": "success",                     //返回的是错误提示信息
        "errno": 0                            //0代表成功  1，代表失败
    },
    "result": {
        "data":{} or []                       //多行记录返回数组
        "page":{                              //page 是可选项，data为数组时才会有page，也可以无page信息（不分页）。
            "currentPage"":1 ,                //当前页,目前系统有从0或1开始。统一1开始
            "pageSize":10,                    //分页的数量
            "totalPage":1,                    //总页数
            "totalCount":10                   //总行数
        }
    }
}
*/

/**
 * 系统返回值对象
 *
 * @author Breggor
 */
public class ResponseTVO<T> implements java.io.Serializable {
    private static final long serialVersionUID = 4807318268209609704L;
    private final static int DEFAULT_SUCCESS_STATUS = 0;
    private final static int DEFAULT_FAIL_STATUS = 1;
    
    private final static int CALL_SERVER_FAIL_STATUS = 1503005;
    private final static int SERVER_REPONSE_FAIL_STATUS = 1503006;
    private final static int SYSTEM_EXCEPTOIN_FAIL_STATUS = 1500500;
    private final static int QRCODE_EXPIRE_FAIL_STATUS = 1534005;
    private final static int QRCODE_USED_FAIL_STATUS = 1534006;
    

    public static final Meta SUCCESS = new Meta(DEFAULT_SUCCESS_STATUS, "success"); //成功
    public static final Meta FAILURE = new Meta(DEFAULT_FAIL_STATUS, "failure"); //失败
    
    public static final Meta CALL_SERVER_FAILURE = new Meta(CALL_SERVER_FAIL_STATUS, "服务调用失败");
    public static final Meta SERVER_RESPONSE_FAILURE = new Meta(SERVER_REPONSE_FAIL_STATUS, "服务调用, 响应异常"); 
    public static final Meta QRCODE_EXPIRE_FAILURE = new Meta(QRCODE_EXPIRE_FAIL_STATUS, "二维码已过期"); 
    public static final Meta QRCODE_USED_FAILURE = new Meta(QRCODE_USED_FAIL_STATUS, "二维码被占用"); 
    public static final Meta SYSTEM_EXCEPTION_FAILURE = new Meta(SYSTEM_EXCEPTOIN_FAIL_STATUS, "系统错误");

    private Meta meta;        //errno=0：成功, errno=1：失败
    private T result;    //数据
    private Page page;
    
    public ResponseTVO() {

    }

    /**
     * 判断VO是否成功
     *
     * @return
     */
    public boolean isSuccess() {
        if (null != meta && DEFAULT_SUCCESS_STATUS == meta.getErrno()) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * 成功返回值对象
     *
     * @return ResponseData
     */
    public static <T> ResponseTVO<T> success() {
        return new ResponseTVO<>(ResponseTVO.SUCCESS, null);
    }

    /**
     * 成功返回值对象
     *
     * @param data 数据
     * @return ResponseData
     */
    public static <T> ResponseTVO<T> success(T data) {
        return new ResponseTVO<>(ResponseTVO.SUCCESS, data);
    }


    /**
     * 失败返回值对象
     *
     * @return ResponseData
     */
    public static <T> ResponseTVO<T> failure() {
        return new ResponseTVO<>(ResponseTVO.FAILURE, null);
    }


    /**
     * 失败码/失败信息回值对象
     *
     * @param errno
     * @param msg
     * @return ResponseData
     */
    public static <T>ResponseTVO<T> failure(int errno, String msg) {
        return new ResponseTVO<>(new Meta(errno, msg), null);
    }




    public static <T> ResponseTVO<T> redRebate(int errno, String msg,T data) {
        return new ResponseTVO<>(new Meta(errno, msg), data);
    }


    /**
     * 失败码/失败信息回值对象
     *
     * @param errno
     * @param msg
     * @return ResponseData
     */
    public static <T> ResponseTVO<T> failure(int errno, String msg, T data) {
        return new ResponseTVO<>(new Meta(errno, msg), data);
    }
    
    /**
     * 分页成功返回值对象
     *
     * @param data        数据
     * @param currentPage 当前页
     * @param pageSize    每页大小
     * @param totalCount  总行数
     * @return ResponseData
     */
    public static <T> ResponseTVO<T> success(T data, Integer currentPage, Integer pageSize, Integer totalCount) {
        return new ResponseTVO<>(ResponseTVO.SUCCESS, data, new Page(currentPage, pageSize, totalCount));
    }
    
    private ResponseTVO(Meta meta, T result) {
        this.meta = meta;
        this.result = result;
    }
    
    private ResponseTVO(Meta meta, T result, Page page) {
        this.meta = meta;
        this.result = result;
        this.page = page;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(int errno, String msg) {
        this.meta = new Meta(errno, msg);
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
	
	@SuppressWarnings("serial")
	public static class Meta implements Serializable {
        private int errno;      //错误码
        private String msg;     //提示信息

        private Meta() {
        }

        private Meta(int errno, String msg) {
            this.errno = errno;
            this.msg = msg;
        }

        public void setErrno(int errno) {
            this.errno = errno;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }


        public int getErrno() {
            return errno;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            Meta meta = (Meta) o;

            return new EqualsBuilder()
                    .append(errno, meta.errno)
                    .append(msg, meta.msg)
                    .isEquals();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder(17, 37)
                    .append(errno)
                    .append(msg)
                    .toHashCode();
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                    .append("errno", errno)
                    .append("msg", msg)
                    .toString();
        }
    }

    public static class Page implements Serializable {
        private static final long serialVersionUID = -9015310768471855060L;
        private Integer currentPage;    //当前页：统一从1开始
        private Integer pageSize = 10;    //每页行数
        private Integer totalCount;    //总行数
        private Integer totalPage = 0;    //总页数

        private Page() {
        }

        private Page(Integer currentPage, Integer pageSize, Integer totalCount) {
            this.currentPage = currentPage;
            this.pageSize = pageSize;
            this.totalCount = totalCount;
        }

        public void setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public void setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
        }

        public Integer getCurrentPage() {
            return currentPage;
        }


        public Integer getPageSize() {
            return pageSize;
        }


        public Integer getTotalCount() {
            return totalCount;
        }

        /**
         * 总页数
         *
         * @return
         */
        public Integer getTotalPage() {
            if (this.pageSize != null && this.pageSize > 0) {
                if (totalCount % pageSize == 0) {
                    totalPage = totalCount / pageSize;
                } else {
                    totalPage = totalCount / pageSize + 1;
                }
            }
            return totalPage;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                    .append("currentPage", currentPage)
                    .append("pageSize", pageSize)
                    .append("totalCount", totalCount)
                    .toString();
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("meta", meta)
                .append("result", result)
                .toString();
    }
    
    

    public static void main(String[] args) {


    	List<String> list = new ArrayList<String>();
    	list.add("1");
    	list.add("2");
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("progress", 12);
        System.out.println(JSONObject.fromObject(ResponseTVO.success(map)));
        System.out.println(JSONObject.fromObject(ResponseTVO.success("处理成功：返回单个对象")));
        System.out.println(JSONObject.fromObject(ResponseTVO.success("理成功：返回对象集合List<Object>", 1, 10, 200)));
       // System.out.println(JSONObject.fromObject(ResponseVO.failure()));
      //  System.out.println(JSONObject.fromObject(ResponseVO.failure(1020001, "业务出错")));



    }
}
