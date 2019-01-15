package com.rongyi.rss.smart;

import com.rongyi.easy.smart.dto.SmartCaseDTO;

public interface ISmartCaseService {
	
	/**
	 * 保存smart模板信息
	 * @param smartCaseDTO
	 * @return
	 */
	public Integer addSmartCase(SmartCaseDTO smartCaseDTO);
	/**
	 * 修改smart模板信息
	 * @param smartCaseDTO
	 * @return
	 */
	public Integer updateSmartCase(SmartCaseDTO smartCaseDTO);
}
