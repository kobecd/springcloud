package com.rongyi.easy.malllife.common.util;

import com.rongyi.easy.malllife.entity.UpAuthorization;
import com.rongyi.easy.malllife.param.UpParam;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by yandong on 2017/12/6.
 * 又拍云， 前端form表单上传数据， 生成需要的 Authorization ， Policy
 */
public class UpAuthUtil extends UpPicToYun {


    private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
    private static final String ENCODING = "UTF-8";

    private static String UPLOAD_URL;

    static{
        UPLOAD_URL = "http://v0.api.upyun.com" + "/" + UpPicToYun.BUCKET_NAME;
    }

    private static Logger logger = Logger.getLogger(UpAuthUtil.class);

    public static UpAuthorization auth(UpParam param) {
        try{

            String password =  UpYun.md5(UpAuthUtil.YUN_PASSWORD);

            StringBuilder tempPolicy = new StringBuilder();
            tempPolicy.append("{");
            tempPolicy.append("\"bucket\":\""+ UpAuthUtil.BUCKET_NAME +"\",");
            tempPolicy.append("\"save-key\":\""+ param.getSaveKey() +"\",");
            tempPolicy.append("\"expiration\":\""+ param.getExpiration() +"\"");
            tempPolicy.append(",\"date\":\""+ param.getDate() +"\"");
            if(param.getContentMd5() != null){

                tempPolicy.append(",\"content-md5\":\""+ param.getContentMd5() +"\"");
            }
            if(param.getContentLength() != null){

                tempPolicy.append(",\"content-length\":"+ param.getContentLength());
            }
            tempPolicy.append("}");
            System.out.println(tempPolicy);
            String policy  = Base64Coder.encodeString(tempPolicy.toString());

            String tempSign =  param.getMethod() + "&/" + UpAuthUtil.BUCKET_NAME + "&" + param.getDate() + "&" + policy ;
            //String tempSign =  param.getMethod() + "&/" + UpAuthUtil.BUCKET_NAME + "&" + policy ;

            if(param.getContentMd5() != null){
                tempSign = tempSign + "&" + param.getContentMd5();
            }

            byte[] signArr = calculateRFC2104HMACRaw(password, tempSign);

            String sign ="UPYUN " + UpAuthUtil.YUN_USERNAME + ":" + Base64Coder.encodeLines(signArr);
            UpAuthorization result = new UpAuthorization();
            result.setAuthorization(sign.trim());
            result.setPolicy(policy.trim());
            result.setUrl(UPLOAD_URL);
            logger.info(result);
            return result;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public static byte[] calculateRFC2104HMACRaw(String key, String data)
            throws Exception {
        byte[] keyBytes = key.getBytes();
        SecretKeySpec signingKey = new SecretKeySpec(keyBytes, HMAC_SHA1_ALGORITHM);

        // Get an hmac_sha1 Mac instance and initialize with the signing key
        Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
        mac.init(signingKey);
        // Compute the hmac on input data bytes
        return mac.doFinal(data.getBytes());
    }

    public static String bytesToHexString(byte[] src){
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

}
