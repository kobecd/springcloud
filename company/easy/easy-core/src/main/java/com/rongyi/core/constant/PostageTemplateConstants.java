package com.rongyi.core.constant;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.framework.spring.context.utils.SpringContextUtil;

public interface PostageTemplateConstants {

    /**
     * 状态：删除[0],正常[1]
     */
    interface Status {

        /**
         * 已删除
         */
        Integer DELETED = 0;

        /**
         * 正常
         */
        Integer NORMAL = 1;
    }

    /**
     * 是否包邮：是[0]，否[1]
     */
    interface IsExemption {

        /**
         * 包邮
         */
        Integer YES = 0;

        /**
         * 不包邮
         */
        Integer NO = 1;
    }

    /**
     * 计费方式：按重量[1]
     */
    interface ChargeType {

        /**
         * 按重量[1]
         */
        Integer WEIGHT = 1;

    }

    /**
     * 0物流方式：快递[1]
     */
    interface LogisticType {

        /**
         * 快递
         */
        Integer EXPRESS = 1;
    }

    /**
     * 是否是默认配置的数据：是[0]、否[1]
     */
    interface IsDefault {

        /**
         * 是默认配置
         */
        Integer YES = 0;

        /**
         * 不是默认配置
         */
        Integer NO = 1;
    }
}
