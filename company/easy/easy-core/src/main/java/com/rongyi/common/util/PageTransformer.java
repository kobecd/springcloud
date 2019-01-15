package com.rongyi.common.util;

import java.util.List;

import org.springframework.util.CollectionUtils;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.rongyi.common.dto.ApiResultBodyDTO;
import com.rongyi.common.dto.PageRequDTO;
import com.rongyi.common.dto.PageRespDTO;

/**
 * @Description: 分页转换工具类
 * @Author: 梁来宾
 * @Date: Created in 2018/3/2 15:02
 */
public class PageTransformer {
    private PageTransformer() {
    }


    /**
     * 由PageRequDTO数据类型，转换为Mybatis-Plus的Page类型
     *
     * @param apiRequPage
     * @param <T>
     * @return
     */
    public static <T> Page<T> transform(PageRequDTO apiRequPage) {
        if (apiRequPage == null) {
            return null;
        }

        Page<T> page = new Page<>();
        page.setCurrent(apiRequPage.getCurrentPage());
        page.setSize(apiRequPage.getPageSize());
        return page;
    }

    /**
     * 由Mybatis-Plus的Page类型的数据类型，转换为ApiResultBodyDTO类型 <br>
     * 用于List中的数据类型需要转换时
     * @param mpPage
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> ApiResultBodyDTO<List<R>> transform(Page<T> mpPage, Function<T, R> function) {
        if (mpPage == null) {
            return null;
        }
        PageRespDTO apiPage = newPageRespDTOWithoutDataFrom(mpPage);
        List<T> srcObjs = mpPage.getRecords();
        List<R> tgtObjs = null;
        if (!CollectionUtils.isEmpty(srcObjs)) {
            tgtObjs = Lists.newArrayListWithExpectedSize(srcObjs.size());
            /*for (T t : srcObjs) {
                tgtObjs.add(function.apply(t));
            }*/
            tgtObjs = Lists.transform(srcObjs, function);
        }
        return new ApiResultBodyDTO<List<R>>(tgtObjs, apiPage);
    }

    /**
     * 由Mybatis-Plus的Page类型的数据类型，转换为ApiResultBodyDTO类型 <br>
     * 用于List中的数据类型不需要转换时
     * @param mpPage
     * @param <T>
     * @return
     */
    public static <T> ApiResultBodyDTO<List<T>> transform(Page<T> mpPage) {
        if (mpPage == null) {
            return null;
        }
        PageRespDTO apiPage = newPageRespDTOWithoutDataFrom(mpPage);

        return new ApiResultBodyDTO<List<T>>(mpPage.getRecords(), apiPage);
    }

    /**
     * 从Page生成一个不包含数据的PageRespDTO
     * @param mpPage
     * @return
     */
    private static <T> PageRespDTO newPageRespDTOWithoutDataFrom(Pagination mpPage) {
        PageRespDTO apiPage = new PageRespDTO();
        apiPage.setCurrentPage(mpPage.getCurrent());
        apiPage.setPageSize(mpPage.getSize());
        apiPage.setTotalCount((int)mpPage.getTotal());
        return apiPage;
    }
}
