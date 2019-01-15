package com.rongyi.common.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/6/21
 */
public class LogReportInfo implements Serializable {

    private Long timestamp;

    private String id;

    private String message_name;

    private List<MessageData> message_data;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage_name() {
        return message_name;
    }

    public void setMessage_name(String message_name) {
        this.message_name = message_name;
    }

    public List<MessageData> getMessage_data() {
        return message_data;
    }

    public void setMessage_data(List<MessageData> message_data) {
        this.message_data = message_data;
    }

    public static class MessageData{
        private String id;

        private Long timestamp; //当前时间戳(精确到毫秒)

        private String session_id; //session

        private Integer app_name;  //应用名称

        private String app_version; //应用版本号

        private String os_version; //操作系统版本

        private String device_type; //设备类型，具体到机型

        private String client_ip; //客户端IP

        private Float lat; //纬度

        private Float lng; //经度

        private Integer network; //网络类型

        private Integer terminal_type;   //android、ios、h5、web

        private String channel;  //渠道

        private String rpg;  //对应上级页面(referrerPage)

        private String refurl;  //refer url

        private String cpage; //currentpage(当前页面)

        private String url; //当前请求URL

        private String element; //当前点击元素的名称

        private String element_url;//当前点击元素的url属性

        private Integer action_type;//事件类型

        private String activity_id;//活动ID

        private String city_id;//用户所在城市ID

        private String user_id;//用户ID

        private String spec_id;//商品/礼品类目

        private String mall_id;//商品/礼品所在商场

        private String shop_id;//商品/礼品所在店铺

        private String brand_id;//商品/礼品品牌

        private String commodity_id;//商品/礼品ID

        private String sku_id;//商品skuid

        private String article_id;//文章ID

        private String coupon_id;//代金券ID

        private String order_no;//订单号

        private Integer sku_num;//商品/礼品SKU数量

        private String spc_param;//商品/礼品规格参数

        private String openid;//第三方ID如微信、微博uid

        private Integer third_app_name;//第三方应用名称

        private String third_app_id;//第三方应用ID

        private Integer payment_type;//支付方式

        private String search_key;//搜索关键词语

        private Integer search_type;//搜索类型

        private Integer h5source;//用于记录H5来源

        private List<Map<String, Object>> object_ids;//其它信息[key:value]

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
        }

        public String getSession_id() {
            return session_id;
        }

        public void setSession_id(String session_id) {
            this.session_id = session_id;
        }

        public Integer getApp_name() {
            return app_name;
        }

        public void setApp_name(Integer app_name) {
            this.app_name = app_name;
        }

        public String getApp_version() {
            return app_version;
        }

        public void setApp_version(String app_version) {
            this.app_version = app_version;
        }

        public String getOs_version() {
            return os_version;
        }

        public void setOs_version(String os_version) {
            this.os_version = os_version;
        }

        public String getDevice_type() {
            return device_type;
        }

        public void setDevice_type(String device_type) {
            this.device_type = device_type;
        }

        public String getClient_ip() {
            return client_ip;
        }

        public void setClient_ip(String client_ip) {
            this.client_ip = client_ip;
        }

        public Float getLat() {
            return lat;
        }

        public void setLat(Float lat) {
            this.lat = lat;
        }

        public Float getLng() {
            return lng;
        }

        public void setLng(Float lng) {
            this.lng = lng;
        }

        public Integer getNetwork() {
            return network;
        }

        public void setNetwork(Integer network) {
            this.network = network;
        }

        public Integer getTerminal_type() {
            return terminal_type;
        }

        public void setTerminal_type(Integer terminal_type) {
            this.terminal_type = terminal_type;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getRpg() {
            return rpg;
        }

        public void setRpg(String rpg) {
            this.rpg = rpg;
        }

        public String getRefurl() {
            return refurl;
        }

        public void setRefurl(String refurl) {
            this.refurl = refurl;
        }

        public String getCpage() {
            return cpage;
        }

        public void setCpage(String cpage) {
            this.cpage = cpage;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getElement() {
            return element;
        }

        public void setElement(String element) {
            this.element = element;
        }

        public String getElement_url() {
            return element_url;
        }

        public void setElement_url(String element_url) {
            this.element_url = element_url;
        }

        public Integer getAction_type() {
            return action_type;
        }

        public void setAction_type(Integer action_type) {
            this.action_type = action_type;
        }

        public String getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(String activity_id) {
            this.activity_id = activity_id;
        }

        public String getCity_id() {
            return city_id;
        }

        public void setCity_id(String city_id) {
            this.city_id = city_id;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getSpec_id() {
            return spec_id;
        }

        public void setSpec_id(String spec_id) {
            this.spec_id = spec_id;
        }

        public String getMall_id() {
            return mall_id;
        }

        public void setMall_id(String mall_id) {
            this.mall_id = mall_id;
        }

        public String getShop_id() {
            return shop_id;
        }

        public void setShop_id(String shop_id) {
            this.shop_id = shop_id;
        }

        public String getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(String brand_id) {
            this.brand_id = brand_id;
        }

        public String getCommodity_id() {
            return commodity_id;
        }

        public void setCommodity_id(String commodity_id) {
            this.commodity_id = commodity_id;
        }

        public String getSku_id() {
            return sku_id;
        }

        public void setSku_id(String sku_id) {
            this.sku_id = sku_id;
        }

        public String getArticle_id() {
            return article_id;
        }

        public void setArticle_id(String article_id) {
            this.article_id = article_id;
        }

        public String getCoupon_id() {
            return coupon_id;
        }

        public void setCoupon_id(String coupon_id) {
            this.coupon_id = coupon_id;
        }

        public String getOrder_no() {
            return order_no;
        }

        public void setOrder_no(String order_no) {
            this.order_no = order_no;
        }

        public Integer getSku_num() {
            return sku_num;
        }

        public void setSku_num(Integer sku_num) {
            this.sku_num = sku_num;
        }

        public String getSpc_param() {
            return spc_param;
        }

        public void setSpc_param(String spc_param) {
            this.spc_param = spc_param;
        }

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }

        public Integer getThird_app_name() {
            return third_app_name;
        }

        public void setThird_app_name(Integer third_app_name) {
            this.third_app_name = third_app_name;
        }

        public String getThird_app_id() {
            return third_app_id;
        }

        public void setThird_app_id(String third_app_id) {
            this.third_app_id = third_app_id;
        }

        public Integer getPayment_type() {
            return payment_type;
        }

        public void setPayment_type(Integer payment_type) {
            this.payment_type = payment_type;
        }

        public String getSearch_key() {
            return search_key;
        }

        public void setSearch_key(String search_key) {
            this.search_key = search_key;
        }

        public Integer getSearch_type() {
            return search_type;
        }

        public void setSearch_type(Integer search_type) {
            this.search_type = search_type;
        }

        public Integer getH5source() {
            return h5source;
        }

        public void setH5source(Integer h5source) {
            this.h5source = h5source;
        }

        public List<Map<String, Object>> getObject_ids() {
            return object_ids;
        }

        public void setObject_ids(List<Map<String, Object>> object_ids) {
            this.object_ids = object_ids;
        }
    }
}
