package com.rongyi.easy.roa.param;

import com.rongyi.easy.base.param.BaseParam;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 登录
 *
 * @author lim
 */
public class MemberLoginParam extends BaseParam {

    private String ownerId;

    private String mobile;

    private String smsCode;

    private String invitationCode;//邀请码

    private String delayTime;//验证码时效,为空时30分钟

    private String equipmentId;//设备ID

    private String mallId;//商场ID

    /**
     * 用于：用户行为事件活动查询  {{{
     */
    private String channelId;
    private String eventType;
    private String buid;
    private String shopId;
    private String adId;//设备id
    private String adChannel;//合作方

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public String getAdChannel() {
        return adChannel;
    }

    public void setAdChannel(String adChannel) {
        this.adChannel = adChannel;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(String delayTime) {
        this.delayTime = delayTime;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getBuid() {
        return buid;
    }

    public void setBuid(String buid) {
        this.buid = buid;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
