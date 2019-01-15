package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.mcmc.PostageTemplate;
import com.rongyi.easy.mcmc.param.postage.PostagePageParam;
import com.rongyi.easy.mcmc.vo.commodity.new1.postage.PostageTemplateVO;

import java.util.List;

public interface IPostageTemplateService {
	public List<PostageTemplate> getList(PostagePageParam param) throws Exception;

	public Integer getListCount(PostagePageParam param) throws Exception;

	public PostageTemplate getById(String id) throws Exception;

	public Integer getRepeatCountByNameAndId(String name, String id, List<String> merchantIds) throws Exception;

	public String insert(PostageTemplate obj);

	public boolean update(PostageTemplate obj);

	public Integer getUsedCountById(String id) throws Exception;

	public boolean delete(String id, Integer userId);

	public PostageTemplateVO getPostageTemplateVO(PostageTemplate postageTemplate) throws Exception;
}
