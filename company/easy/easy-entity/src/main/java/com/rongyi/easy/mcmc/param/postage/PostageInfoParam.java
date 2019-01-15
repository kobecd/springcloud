package com.rongyi.easy.mcmc.param.postage;



/**
 * 
* @ClassName: PostageInfoParam
* @Description: 获取运费模版详情参数
* @author zhoukunkun
* @date 2017年6月19日
*
 */
public class PostageInfoParam {
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PostageInfoParam{" +
				"id='" + id + '\'' +
				'}';
	}
}
