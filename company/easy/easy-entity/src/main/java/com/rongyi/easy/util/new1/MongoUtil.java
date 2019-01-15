package com.rongyi.easy.util.new1;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoukunkun on 2017/4/11.
 */
public class MongoUtil {
    /**
     * 判断mongoId是否合规
     * @author zhoukunkun
     * @param mongoId
     * @return
     */
    public static boolean isMongoId(String mongoId) {
        return StringUtils.isNotBlank(mongoId) && mongoId.matches("[\\da-zA-Z]{24}");
    }

    /**
     * 重置参数
     * @param ids
     * @return
     */
    public static List<ObjectId> rebuildIdList(List<String> ids) {
        List<ObjectId> objectIdList = new ArrayList<>();
        if (CollectionUtils.isEmpty(ids)) {
            return objectIdList;
        }
        for (String id : ids) {
            objectIdList.add(new ObjectId(id));
        }
        return objectIdList;
    }
}
