package com.rongyi.easy.bdata.enums;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/3
 */
public enum MerchantTypeEnum implements Serializable {

    STANDALONE_SHOP(10, "单店铺") {
        @Override
        public boolean isRootMerchant() {
            return true;
        }
    },
    CHAIN_ROOT(11, "连锁总部") {
        @Override
        public boolean isRootMerchant() {
            return true;
        }
    },
    MALL(12, "商场") {
        @Override
        public boolean isRootMerchant() {
            return true;
        }
    },
    CHAIN_SHOP(21, "连锁店铺") {
        @Override
        public boolean isRootMerchant() {
            return false;
        }
    },
    MALL_SHOP(22, "商场店铺") {
        @Override
        public boolean isRootMerchant() {
            return false;
        }
    };

    MerchantTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private Integer code;

    private String desc;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public abstract boolean isRootMerchant() ;

}
