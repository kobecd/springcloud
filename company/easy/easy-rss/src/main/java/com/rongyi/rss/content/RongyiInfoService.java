package com.rongyi.rss.content;

import com.rongyi.easy.content_v2.entity.RongyiInfo;

import java.util.Date;
import java.util.List;

/**
 * Created by yangyang on 2016/11/10.
 */
public interface RongyiInfoService {

    boolean saveOrUpdateRongyiInfo(RongyiInfo rongyiInfo);

    RongyiInfo selectById(Integer id);

    boolean updateStatus(RongyiInfo rongyiInfo);

    List<RongyiInfo> getRongyiInfoByPage(RongyiInfo rongyiInfo);

    Integer countRongyiInfoList(RongyiInfo rongyiInfo);

    RongyiInfo getLastOrNextId(Integer id);

    /**
     *  置顶、取消置顶
     * @param id
     * @param stick 0 取消置顶 1置顶
     * @return
     * @throws Exception
     */
    boolean stick(Integer id,Integer stick) throws Exception;
}
