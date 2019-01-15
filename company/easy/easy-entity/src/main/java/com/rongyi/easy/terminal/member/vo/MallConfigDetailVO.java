package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

/**
 * 
 * @ClassName     MallConfigDetailVO.java 
 * @Description   TODO 商场配置详情VO
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月28日 下午1:46:36
 */
@SuppressWarnings("serial")
public class MallConfigDetailVO implements Serializable{
	
    private String mallId;
    private String moduleType;
    private LoginConfigVO loginConfig;
    private RegisterConfigVO registerConfig;
    private ExchangeConfigVO creditsConfig;
    private ExchangeConfigVO parkingConfig;
    
	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getModuleType() {
		return moduleType;
	}

	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	public LoginConfigVO getLoginConfig() {
		return loginConfig;
	}

	public void setLoginConfig(LoginConfigVO loginConfig) {
		this.loginConfig = loginConfig;
	}

	public RegisterConfigVO getRegisterConfig() {
		return registerConfig;
	}

	public void setRegisterConfig(RegisterConfigVO registerConfig) {
		this.registerConfig = registerConfig;
	}

	public ExchangeConfigVO getCreditsConfig() {
		return creditsConfig;
	}

	public void setCreditsConfig(ExchangeConfigVO creditsConfig) {
		this.creditsConfig = creditsConfig;
	}

	public ExchangeConfigVO getParkingConfig() {
		return parkingConfig;
	}

	public void setParkingConfig(ExchangeConfigVO parkingConfig) {
		this.parkingConfig = parkingConfig;
	}
	
	@Override
	public String toString() {
		return "MallConfigDetailVO [mallId=" + mallId + ", moduleType=" + moduleType + ", loginConfig="
				+ loginConfig + ", registerConfig=" + registerConfig + ", creditsConfig=" + creditsConfig
				+ ", parkingConfig=" + parkingConfig + "]";
	}

	public static class ExchangeConfigVO implements Serializable {
		
		private String type;
		private String exchange;
		private Boolean sms;
		private Boolean receipt;
		private Boolean wechat;
		
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getExchange() {
			return exchange;
		}
		public void setExchange(String exchange) {
			this.exchange = exchange;
		}
		public Boolean getSms() {
			return sms;
		}
		public void setSms(Boolean sms) {
			this.sms = sms;
		}
		public Boolean getReceipt() {
			return receipt;
		}
		public void setReceipt(Boolean receipt) {
			this.receipt = receipt;
		}
		public Boolean getWechat() {
			return wechat;
		}
		public void setWechat(Boolean wechat) {
			this.wechat = wechat;
		}
		@Override
		public String toString() {
			return "ExchangeConfigVO [type=" + type + ", exchange=" + exchange + ", sms=" + sms + ", receipt=" + receipt
					+ ", wechat=" + wechat + "]";
		}
		
	   
	}
	
	public static class RegisterConfigVO implements Serializable {
		
		private Integer channel;
		private String type;
		
		public Integer getChannel() {
			return channel;
		}
		public void setChannel(Integer channel) {
			this.channel = channel;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		@Override
		public String toString() {
			return "RegisterConfigVO [channel=" + channel + ", type=" + type + "]";
		}
	    
	}

	public static class LoginConfigVO implements Serializable {
		
	    private boolean phone; //是否支持手机登录
	    private boolean card; //手否支持会员卡刷卡登录
	    private boolean wechat; //是否支持微信扫码登录
	    
		public boolean isPhone() {
			return phone;
		}
		public void setPhone(boolean phone) {
			this.phone = phone;
		}
		public boolean isCard() {
			return card;
		}
		public void setCard(boolean card) {
			this.card = card;
		}
		public boolean isWechat() {
			return wechat;
		}
		public void setWechat(boolean wechat) {
			this.wechat = wechat;
		}
		@Override
		public String toString() {
			return "LoginConfigVO [phone=" + phone + ", card=" + card + ", wechat=" + wechat + "]";
		}
	    
	    
	}
    
}
