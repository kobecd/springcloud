package com.rongyi.rss.bdata.smart;

import java.util.List;

import com.rongyi.easy.bdata.entity.Area;
import com.rongyi.easy.bdata.entity.BdataFloor;
import com.rongyi.easy.bdata.entity.CustomCategory;
import com.rongyi.easy.bdata.entity.Mall;
import com.rongyi.easy.smart.vo.MallVO;
import com.rongyi.easy.smart.vo.ShopVO;
import com.rongyi.easy.smart.vo.smartAndroid.MallCategoryVO;
import com.rongyi.easy.smart.vo.FloorVO;
/**
 * 互动屏智能终端接口
 * @author user
 *
 */
public interface SmartMallService {
	/**
	 * 根据商场id获取店铺列表信息
	 * @param mallId
	 * @return
	 * @throws Exception
	 */
	public List<ShopVO> getMallShopList(String mallId) throws Exception;
	/**
	 * 根据商场id获取商场基础信息
	 * @param mallId
	 * @return
	 * @throws Exception
	 */
	public MallVO getMallVOByMallId(String mallId) throws Exception;
	/**
	 * 根据商场id查询商场楼层列表
	 * @param mallId
	 * @return
	 * @throws Exception
	 */
	public List<FloorVO> getFloorListByMallId(String mallId) throws Exception;
	/**
	 * 获取商场下的自定义分类
	 * @return
	 * @throws Exception
	 */
	public List<MallCategoryVO> getCustomCategoryList(String mallId) throws Exception;
	
	public Mall getMallInfoById(String mallId) throws Exception;
	//商场名精确匹配
	public Mall getMallInfoByMallName(String mallName) throws Exception;
	//商场名模糊查询
	public List<Mall> getMallListByName(String mallName) throws Exception;
	
	public CustomCategory getById(String id) throws Exception;
	/**
	 * 根据商场id查询所属店铺id集合
	 * @param mallId
	 * @return
	 * @throws Exception
	 */
	public List<String> getShopIdsByMallId(String mallId) throws Exception;
	/**
	 * 根据id获取楼层信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public BdataFloor getBdataFloorById(String id) throws Exception;
	/**
	 * 根据店铺id集合查询店铺数据
	 * @param shopIds
	 * @return
	 * @throws Exception
	 */
	public List<ShopVO> getShopListByIds(List<String> shopIds) throws Exception;
	/**
	 * 根据楼层id集合查询楼层信息
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	public List<FloorVO> getFloorListByIds(List<String> ids) throws Exception;
	
	public Area getAreaById(String id) throws Exception;
	
	public List<MallCategoryVO> getCategoryListByIds(List<String> ids) throws Exception;
	
	 /**
     * 根据商场名称模糊匹配查询商场
     * @param mallName
     * @return
     */
    public List<Mall> getMallListByNames(List<String> mallNames) throws Exception;
    
    public List<com.rongyi.easy.bdata.vo.MallVO> getMallsByIds(List<String> ids);
}
