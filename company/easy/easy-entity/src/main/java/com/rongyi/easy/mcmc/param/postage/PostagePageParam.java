package com.rongyi.easy.mcmc.param.postage;

import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PostagePageParam extends PageParam {

    private List<String> merchantIds; // 商户IDs，前端不须传

    public List<String> getMerchantIds() {
        return merchantIds;
    }

    public void setMerchantIds(List<String> merchantIds) {
        this.merchantIds = merchantIds;
    }

    @Override
    public String toString() {
        return "PostagePageParam{" +
                "merchantIds=" + merchantIds +
                "PostagePageParam{}:" + super.toString() +
                '}';
    }
}
