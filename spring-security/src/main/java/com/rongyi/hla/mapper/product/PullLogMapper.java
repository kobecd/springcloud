package com.rongyi.hla.mapper.product;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rongyi.model.product.PullLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PullLogMapper extends BaseMapper<PullLog> {

    /**
     * 获取所有操作记录
     *
     * @return
     */
    List<PullLog> selectAll();

    int save(PullLog pullLog);

    PullLog getLatestRequest(@Param("name") String name);
}
