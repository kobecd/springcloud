package com.rongyi.hla.utils;


import com.rongyi.utils.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * 获取ops数据
 * 简单描述：
 */
@Slf4j
@Component
public class TerminalHttpUtil {

    private String authorization = null;

    @Value("${hla.ops.mallId}")
    private String mallId;


    @Value("${hla.ops.channel}")
    private String channel;

    @Value("${hla.ops.url.host}")
    private String opsHost;


    /**
     * 获取凭证
     *
     * @return
     */
    public String getAuthorization() {
        return MD5Utils.getMD5Code(mallId + channel + "custom3288HANLAN");
    }


    /**
     * 获取ops参数
     * headers 参数 key - value
     * Content-Type-application/json
     * <p>
     * authorization--加密参数（） Md5Util.GetMD5Code(mallId+channel+"custom3288HANLAN")
     *
     * @param paramStr 参数是json的字符串
     * @return
     */
    //多参数
    public  String post(String path, String paramStr) {

        InputStream in = null;
        OutputStream os = null;
        String result = "";
        StringBuffer stringBuffer = new StringBuffer();
        try {
            // 打开和URL之间的连接
            //测试
//            url = "http://localhost:8081/test";
            HttpURLConnection conn = (HttpURLConnection) new URL(opsHost+path).openConnection();
            // 设置通用的请求属性
//            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("authorization", getAuthorization());
            conn.setRequestProperty("channel", channel);
            conn.setConnectTimeout(10000);//10s超时
            conn.setRequestProperty("Charset", "utf-8");
            conn.setRequestMethod("POST");
            conn.setDoInput(true);//设置输出
            conn.setDoOutput(true);//设置输入
            conn.setUseCaches(false);//设置缓存

            os = conn.getOutputStream();
            // 注意编码格式，防止中文乱码
            if (StringUtils.hasText(paramStr)) {
                os.write(paramStr.getBytes("utf-8"));
                os.close();
            }
            //获得响应状态
            int resultCode = conn.getResponseCode();
            if (resultCode == 200) {
//                in = conn.getInputStream();
//                result = StreamUtils.copyToString(in, Charset.forName("utf-8"));
                StringBuffer sb = new StringBuffer();
                String readLine = new String();
                BufferedReader responseReader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                while ((readLine = responseReader.readLine()) != null) {
                    sb.append(readLine).append("\n");
                }
                result = sb.toString();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        log.debug(" {}", result);
//        return UnicodeUtil.ascii2native(result);
        return result;
    }


}