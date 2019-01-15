package com.rongyi.rss.lightning;


import com.rongyi.easy.roa.vo.RyMchAppVo;

/**
 * 容易网开放平台商户及APP查询接口
 * conan
 * 2017/2/20 14:01
 **/
public interface RyMchAppService {

    /**
     * 根据容易商户号和容易appId查询开放入住商户信息
     * @param ryMchId 容易商户号
     * @param ryAppId 容易商户应用号
     * @return RyMchAppVo
     */
    RyMchAppVo getByMchIdAndAppId(String ryMchId, String ryAppId);

    /**
     * 根据商户id和商户类型查询开放入住商户信息
     * @param bizId 商户id
     * @param bizType 商户类型
     * @return RyMchAppVo
     */
    RyMchAppVo getByBizIdAndBizType(String bizId, Integer bizType);

    /**
     * 更新ryMchAppVo
     * @param ryMchAppVo
     * @return
     */
    Integer  updateRyMchAppInfo(RyMchAppVo ryMchAppVo);

    /**
     * 查询签约pos数量
     * @param posId
     * @return
     */
    Integer getShopPosCount(String posId);


}
