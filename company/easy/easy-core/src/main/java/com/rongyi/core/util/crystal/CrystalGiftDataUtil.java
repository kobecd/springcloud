package com.rongyi.core.util.crystal;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.message.MessageElement;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * 晶品的礼品数据同步,通过webservice获取
 */
public class CrystalGiftDataUtil {

    private static Logger logger = Logger.getLogger(CrystalGiftDataUtil.class);

    /**
     * 调用晶品的webservice服务
     * @param url 服务器地址
     * @param method 调用的接口名称
     * @param paramValues 参数值数组
     * @param oper 参数描述对象
     * @return
     * @throws Exception
     */
    public static JSONArray callService(String url,String method,Object[] paramValues,OperationDesc oper)throws Exception{
        long beginTime = System.currentTimeMillis();
        String targetNamespace = "http://tempuri.org/";
        JSONArray dataArray=new JSONArray();
        Service service = new Service();
        oper.setName(method);
        oper.setReturnType(new javax.xml.namespace.QName(targetNamespace, method));
        oper.setReturnClass(CrystalGiftResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName(targetNamespace, method));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);

        Call call = (Call) service.createCall();// 通过service创建call对象
        // 设置service所在URL
        call.setOperation(oper);
        call.setTargetEndpointAddress(new java.net.URL(url));
        call.setUseSOAPAction(true);
        call.setSOAPActionURI(targetNamespace+method);
        call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        call.setOperationName(new javax.xml.namespace.QName(targetNamespace, method));
        //设置方法中参数的值
        // 给方法传递参数，并且调用方法
        CrystalGiftResponse result =(CrystalGiftResponse) call.invoke(paramValues);
        MessageElement messages=result.get_any()[0];
        List<MessageElement> rowList=messages.getChildren();
        if(rowList==null){
            logger.info("晶品礼品数据调用webservice返回数据为空!!");
            return dataArray;
        }
        for(MessageElement row:rowList){
            List<MessageElement> colList=row.getChildren();
            if(colList==null||colList.size()<1){
                continue;
            }
            JSONObject rowJson =new JSONObject();
            for(MessageElement element:colList){
                rowJson.put(element.getName(),element.getValue());
            }
            dataArray.put(rowJson);
        }
        long endTime = System.currentTimeMillis();
        logger.info("晶品礼品数据调用webservice返回成功,length:" + dataArray.length() + ",耗时:" + (endTime - beginTime) / 1000 + "s");
        return dataArray;
    }


    /**
     * 获取第三方有效的礼品列表
     * @param url   第三方服务器地址
     * @param userCode 访问webservice的账号
     * @param password 访问webservice的密码
     * @param mallId    第三方的商场编码
     * @return
     * @throws Exception
     */
    public static JSONArray GetMemberGiftList(String url, String userCode, String password, String mallId) throws Exception {

        Object[] paramValues = new Object[]{userCode, password, mallId,"N"};
        String targetNamespace = "http://tempuri.org/";
        OperationDesc oper = new OperationDesc();
        oper.addParameter(new ParameterDesc(new javax.xml.namespace.QName(targetNamespace, "strCallUserCode"), ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false));
        oper.addParameter(new ParameterDesc(new javax.xml.namespace.QName(targetNamespace, "strCallPassword"), ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false));
        oper.addParameter(new ParameterDesc(new javax.xml.namespace.QName(targetNamespace, "strMallId"), ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false));
        oper.addParameter(new ParameterDesc(new javax.xml.namespace.QName(targetNamespace, "strIsHaveQoh"), ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false));
        JSONArray jsonArray=callService(url,"GetMemberGiftList",paramValues,oper);
        return jsonArray;
    }
}
