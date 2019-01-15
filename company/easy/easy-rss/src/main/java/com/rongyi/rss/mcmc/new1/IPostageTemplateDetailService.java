package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.mcmc.PostageTemplateDetail;

import java.util.List;

public interface IPostageTemplateDetailService {
	public List<PostageTemplateDetail> getList(List<String> detailIds) throws Exception;

	public PostageTemplateDetail getById(String id) throws Exception;

	public String insert(PostageTemplateDetail obj) throws Exception;

	public boolean update(PostageTemplateDetail obj) throws Exception;
}
