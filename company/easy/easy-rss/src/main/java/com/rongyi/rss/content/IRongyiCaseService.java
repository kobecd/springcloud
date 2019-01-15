package com.rongyi.rss.content;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.content_v2.param.RongyiCaseMoveParamDTO;
import com.rongyi.easy.content_v2.param.RongyiCaseQueryParamDTO;
import com.rongyi.easy.content_v2.vo.RongyiCaseVO;

import java.util.List;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/20 16:13
 * Package:com.rongyi.rss.content
 * Project:easy-common
 */
public interface IRongyiCaseService {

    /**
     * 更新/新建
     * 排序字段默认为当前id
     * @param rongyiCaseVO
     * @return
     */
    Boolean update(RongyiCaseVO rongyiCaseVO);


    /**
     * 统计
     * @param rongyiCaseQueryParamDTO
     * @return
     */
    int countByParam(RongyiCaseQueryParamDTO rongyiCaseQueryParamDTO);

    /**
     * 查找
     * @param rongyiCaseQueryParamDTO
     * @return
     */
    List<RongyiCaseVO> findByParam(RongyiCaseQueryParamDTO rongyiCaseQueryParamDTO);

    /**
     * 移动案例
     *
     * @param rongyiCaseMoveParamDTO type 0 上移 ；1：下移
     * @return
     */
    Boolean moveById(RongyiCaseMoveParamDTO rongyiCaseMoveParamDTO) throws RYServiceException;



    /**
     * 删除
     * @param rongyiCaseMoveParamDTO
     * @return
     */
    boolean delelte(RongyiCaseMoveParamDTO rongyiCaseMoveParamDTO);

}
