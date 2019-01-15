package com.rongyi.rss.mallshop.sms;

import com.rongyi.core.common.third.param.sms.SmsChannelDto;
import com.rongyi.core.common.third.param.sms.SmsCommonParam;
import com.rongyi.core.common.third.param.sms.SmsDto;

import java.util.List;

/**
 * Created by WUH on 2017/4/6.
 * 短信渠道接口
 */
public interface ISmsChannelKeyService {
    int addSmsChannel(SmsCommonParam param);

    int delSmsChannel(SmsCommonParam param);

    SmsChannelDto getSmsChannelById(int id);

    List<SmsChannelDto> smsChannelList(SmsCommonParam param);

    int getCount();

    int updateSmsChannel(SmsCommonParam param);

    SmsChannelDto getSmsChannelByChannel(String channel);

    SmsDto getSms(String channel);
}
