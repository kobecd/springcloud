/**
* @Title: CommodityUpdateOrDeleteParam.java
* @Package com.rongyi.easy.mcmc.param
* @Description: TODO(用一句话描述该文件做什么)
* @author wzh
* @date 2015年9月23日 下午5:43:56
* @version V1.0
*/
package com.rongyi.easy.mcmc.param.postage;

import java.util.List;

/**
 * @ClassName: PostageDeleteParam
 * @Description: 运费模版删除
 * @author zhoukunkun
 * @date 2017年6月19日
 *
 */
public class PostageDeleteParam {

	private String id;//运费模版id

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PostageDeleteParam{" +
				"id='" + id + '\'' +
				'}';
	}
}
