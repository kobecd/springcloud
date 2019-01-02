package com.rongyi.hla.agent;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.rongyi.dto.hudao.PageDTO;
import com.rongyi.dto.hudao.HuDaoProductGroupDTO;
import com.rongyi.dto.query.HuDaoGroupQueryDTO;
import com.rongyi.hla.service.product.GroupService;
import com.rongyi.hla.utils.HttpUtil;
import com.rongyi.hla.utils.StaticField;
import com.rongyi.hla.utils.TokenCacheUtil;
import com.rongyi.model.product.ProductGroup;
import com.rongyi.model.product.PullLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 执行远程调用客户接口，获取数据的服务
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Slf4j
@Component
public class GroupAgent {

    @Autowired
    private TokenCacheUtil tokenCacheUtil;

    @Autowired
    private GroupService groupService;


    private Integer counter = 0;//计数器


    //-----------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 保存group
     * <p>
     * 步骤：
     * 1、获取list<group>
     * 2、批量保存
     * 3、注意可能分页
     *
     * @return
     */
    public PullLog syncGroups() {
        long start = System.currentTimeMillis();
        int total = 0;
        int counts = 0;
        int mark = 0;
        String hostname = "";
        String jsonString = null;
        PullLog pullLog = new PullLog(new Date());


        //构造查询条件
        //-------------------------------------------------------------
        HuDaoGroupQueryDTO queryDTO = new HuDaoGroupQueryDTO();
        queryDTO.setParent_code(0);//第一级：0
        jsonString = JSON.toJSONString(queryDTO);
        //-------------------------------------------------------------

        //第一次掉对方接口获取数据
        PageDTO pageDTO = postForGroups(jsonString);
        total = pageDTO.getTotal();

        log.debug("对方传过来的数据 group total={}", total);
        mark = groupService.batchSave((List<ProductGroup>) pageDTO.getRows());

        try {
            hostname = InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        pullLog.setSuccessQuantity(total);
        pullLog.setInsertQuantity(mark);
        pullLog.setUpdateQuantity(total - mark);

        pullLog.setSuccess(true);

        pullLog.setSourceAddress(hostname);
        pullLog.setOperator(StaticField.OPERATOR);
        pullLog.setName(StaticField.OPERATE_NAME_FOR_GROUP);
        pullLog.setRemark("同步商品Groups");

        log.info("成功的结束定时同步skus，任务耗时 {} S,结果{}", (System.currentTimeMillis() - start) / 1000, pullLog.toString());
        return pullLog;
    }


    /**
     * 获取groups
     *
     * @return
     */
    public PageDTO postForGroups(String jsonString) {
        log.debug("批量查询参数 {}", jsonString);
        PageDTO pageDTO = new PageDTO();
        Integer total = 0;
        //@TODO 测试完成后请移除
        String accessToken = tokenCacheUtil.getAccessToken();
        String groupUrl = tokenCacheUtil.getGroupUrl();
        String appId = tokenCacheUtil.getAppId();
        log.debug("accessToken{},groupUrl{},appId{}",  accessToken ,groupUrl ,appId);
        String respose = HttpUtil.post(groupUrl, jsonString, appId, accessToken);
//        String respose = HttpUtil.post(tokenCacheUtil.getGroupUrl(), jsonString, tokenCacheUtil.getAppId(), tokenCacheUtil.getAccessToken());
        HashMap<String, String> map = JSON.parseObject(respose, new TypeReference<HashMap<String, String>>() {
        });

        //第1层
        String dataString = map.get("data");
        HashMap<String, String> dataMap = JSON.parseObject(dataString, new TypeReference<HashMap<String, String>>() {
        });

        //第2层
        try {
            total = Integer.valueOf(dataMap.get("total"));
        } catch (Exception e) {
            log.error("对方接口返回数据错误，无法获取total，信息{}", e.getMessage());
        }
        pageDTO.setTotal(total);

        String rowsString = dataMap.get("rows");//list的sting
        log.debug("############rows-spu################");
        log.debug("将要解析的数据{}", rowsString);
        log.debug("############rows-spu################");
        List<HuDaoProductGroupDTO> groupDTOS = JSONObject.parseArray(rowsString, HuDaoProductGroupDTO.class);
        ArrayList<ProductGroup> groups = new ArrayList<>(groupDTOS.size());

        for (HuDaoProductGroupDTO dto : groupDTOS) {
            ProductGroup group = new ProductGroup();

            group.setName(dto.getName());
            group.setCode(dto.getCode());
            group.setNotes(dto.getNotes());

            group.setParentCode(dto.getParent_code());
            group.setTypeZhName(dto.getType_zh_name());

            groups.add(group);
        }
        pageDTO.setRows(groups);
        return pageDTO;
    }

}

