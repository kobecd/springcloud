package com.rongyi.easy.coupon.vo.szc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Description:砂之船项目对接，webService 接口header .
 * Author: yb
 * DATE: 2017/7/20 17:17
 * Package:com.rongyi.easy.coupon.vo
 * Project:easy-market
 */


/**
 * 请求  示例
 * <?xml version="1.0" encoding="utf-8"?>
 <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
 <soap:Header>
 <CrmSoapHeader xmlns="http://tempuri.org/">
 <UserId>string</UserId>
 <Password>string</Password>
 <MissionId>string</MissionId>
 <Ts>string</Ts>
 <Sign>string</Sign>
 </CrmSoapHeader>
 </soap:Header>
 <soap:Body>
 <GetCouponPromItem xmlns="http://tempuri.org/">
 <storeCode>string</storeCode>
 <ShopName>string</ShopName>
 <ShopContract>string</ShopContract>
 <ShopPhone>string</ShopPhone>
 </GetCouponPromItem>
 </soap:Body>
 </soap:Envelope>
 */
public class SzcSoapHeaderVO implements Serializable {
    private static final long serialVersionUID = -1599156235278885278L;
    //参数命名规则按照对方header 中的参数定义
    private String UserId;
    private String Password;
    private String MissionId;
    private String Ts;
    private String Sign;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getMissionId() {
        return MissionId;
    }

    public void setMissionId(String missionId) {
        MissionId = missionId;
    }

    public String getTs() {
        return Ts;
    }

    public void setTs(String ts) {
        Ts = ts;
    }

    public String getSign() {
        return Sign;
    }

    public void setSign(String sign) {
        Sign = sign;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    public String toXmlElements() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<UserId>").append(UserId).append("</UserId>")
            .append("<Password>").append(Password).append("</Password>")
            .append("<MissionId>").append(MissionId).append("</MissionId>")
            .append("<Ts>").append(Ts).append("</Ts>")
            .append("<Sign>").append(Sign).append("</Sign>");
        return stringBuilder.toString();
    }
}
