package com.rongyi.rss.mcmc;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.CommodityTag;
import com.rongyi.easy.mcmc.param.CommodityTagParam;
import com.rongyi.easy.mcmc.vo.CommodityTagVO;

import java.util.List;
import java.util.Map;

/**
 * 商品标签对象的接口
 * @author zhengling
 * @date 2017/10/25
 */
public interface ICommodityTagService {

    /**
     * 新增商品标签
     * @param commodityTagParam 新增的标签信息
     * @param userId 操作人id
     * @return 返回封装后的对象
     */
    public ResponseVO saveCommodityTag(CommodityTagParam commodityTagParam, Integer userId);

    /**
     * 修改商品标签
     * @param commodityTagParam 修改的标签信息
     * @param userId 操作人id
     * @return 返回封装后的对象
     */
    public ResponseVO updateCommodityTag(CommodityTagParam commodityTagParam,Integer userId);

    /**
     * 根据id号获取标签对象
     * @param id id号
     * @return 返回标签对象
     */
    public CommodityTagVO getCommodityTagById(String id)throws Exception;

    /**
     * 获取父节点下的下一级商品标签列表
     * @param parentId  父标签id号
     * @return 返回标签集合
     */
    public List<CommodityTagVO> getCommodityTagByParentId(String parentId);

    /**
     * 获取总店配置的所有商品标签目录,以树的形式返回
     * @param shopMid   商场或店铺id
     * @return 返回标签集合
     */
    public List<CommodityTagVO> getCommodityTagListByShopMid(String shopMid);

    /**
     * 根据id删除标签
     * @param id id号
     * @param shopMid   商场或店铺id
     * @return 返回封装后的对象
     */
    public ResponseVO deleteCommodityTag(String id,String shopMid);

    /**
     * 修改标签的排序号,兄弟节点的排序号会自动修改
     * @param id id号
     * @param sort 排序号
     * @return 返回封装后的对象
     */
    public ResponseVO updateSort(String id,Integer sort);

    /**
     * 返回标签的所有上级标签id
     * @param tagIds 标签id集合
     * @param shopMid 店铺id
     * @return 返回当前标签id和所有上级标签id
     */
    public List<String> getTagFullIds(List<String> tagIds,String shopMid);

    /**
     * 返回标签的所有上级标签id
     * @param tagIds 标签id集合
     * @param allTagMap 所有标签集合
     * @return 返回当前标签id和所有上级标签id
     */
    public List<String> getTagFullIds(List<String> tagIds,Map<String, CommodityTag> allTagMap);

    /**
     * 获取总店配置的所有商品标签(原始数据)
     * @param shopMid   商场或店铺id
     * @return 返回标签集合
     */
    public Map<String, CommodityTag> getCommodityTagListByShopMidOriginal(String shopMid);
}
