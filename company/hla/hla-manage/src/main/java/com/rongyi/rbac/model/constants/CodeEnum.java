package com.rongyi.rbac.model.constants;

/**
 * @Author: 柯军
 * @Description: 错误码常量
 * @datetime:2015年9月22日下午6:47:25
 **/
public enum CodeEnum {
	FIAL_USER_PARAMS_PAYMENT(1098401, "没有登录或登录信息错误"),//前台约定，没有登录统一后三位为401
	FIAL_NO_AUTHORITY_PAYMENT(1098403, "没有访问该资源的权限"),//前台约定，没有权限统一后三位为403

	ERROR_SYSTEM(1098001, "系统故障"),
	FIAL_PARAMS_ERROR(1098002, "参数传递错误"),
	// wangjh于2016-02-17 新增
	FIAL_OTHER_ERROR(1181010,"自定义错误"),
	FIAL_SAVE_CONFIG(1018004,"逻辑错误"),
	SUCCESS("0", "正常"),;

	private Object code;

	private Object value;

	private CodeEnum(Object code, Object value) {
		this.code = code;
		this.value = value;
	}

	/**
	 * @return
	 * @Description: 获取code byte类型值,请确保该值可转换为byte值，否则会类型转换异常
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:51:11
	 **/
	public Byte getCodeByte() {
		return Integer.valueOf(code.toString()).byteValue();
	}

	/**
	 * @return
	 * @Description: 获取code int类型值,请确保该值可转换为int值，否则会类型转换异常
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:51:11
	 **/
	public Integer getCodeInt() {
		return Integer.valueOf(code.toString());
	}

	/**
	 * @return
	 * @Description: 获取code String类型值
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:53:36
	 **/
	public String getCodeStr() {
		return code.toString();
	}

	/**
	 * @return
	 * @Description: 获取value byte类型值,请确保该值可转换为byte值，否则会类型转换异常
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:53:08
	 **/
	public Byte getValueByte() {
		return Integer.valueOf(value.toString()).byteValue();
	}

	/**
	 * @return
	 * @Description: 获取value int类型值,请确保该值可转换为int值，否则会类型转换异常
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:53:08
	 **/
	public Integer getValueInt() {
		return Integer.valueOf(value.toString());
	}

	/**
	 * @return
	 * @Description: 获取value String类型值
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:53:21
	 **/
	public String getValueStr() {
		return value.toString();
	}

	public Object getCode() {
		return code;
	}

	public Object getValue() {
		return value;
	}
}
