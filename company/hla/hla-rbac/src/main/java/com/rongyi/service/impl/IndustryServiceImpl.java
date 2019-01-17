/*
package com.rongyi.service.impl;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.utils.BeanToMapUtil;
import com.rongyi.easy.bsoms.entity.BIndustry;
import com.rongyi.easy.bsoms.vo.AccountSearchVO;
import com.rongyi.easy.bsoms.vo.BusinessAccountVO;
import com.rongyi.easy.rmmm.entity.UserAccountEntity;
import com.rongyi.easy.ryoms.entity.RyUserInfo;
import com.rongyi.easy.ryoms.merchant.param.AccountSearchParam;
import com.rongyi.easy.ryoms.merchant.param.IndustrySearchParam;
import com.rongyi.easy.ryoms.merchant.vo.IndustryInfoVO;
import com.rongyi.easy.ryoms.merchant.vo.IndustrySearchVO;
import com.rongyi.easy.ryoms.merchant.vo.IndustryVersionVO;
import com.rongyi.easy.va.vo.VirtualAccountVO;
import com.rongyi.rss.bsoms.IIndustryService;
import com.rongyi.rss.bsoms.IUserInfoService;
import com.rongyi.rss.merchant.IMerchantAccountService;
import com.rongyi.ryoms.constants.Constant;
import com.rongyi.ryoms.dao.UserDao;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.utils.ArrayList;
import java.utils.List;
import java.utils.Map;

@Service
public class IndustryServiceImpl {

	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private IIndustryService iIndustryService;
	@Autowired
	private UserDao usersDao;
	@Autowired
	private IUserInfoService iUserInfoService;
	@Autowired
	private UserService userService;
	@Autowired
	private IMerchantAccountService merchantAccountService;

	*/
/**
	 * 查询商家账号
	 *
	 * @param searchParam
	 * @param optId
	 * @return
	 * @throws Exception
	 *//*

	public PagingVO<AccountSearchVO> searchAccountPagingList(
			AccountSearchParam searchParam, Integer optId) throws Exception {
		Map paramMap = BeanToMapUtil.beanToMap(searchParam);
		if (searchParam.getIdentity() != null) {
			if (searchParam.getIdentity().equals(Constant.IDENTITY.ownerAdmin)) {
				paramMap.put("groupId", searchParam.getRelId());
			} else if (searchParam.getIdentity().equals(
					Constant.IDENTITY.mallAdmin)) {
				paramMap.put("mallId", searchParam.getRelId());
			} else if (searchParam.getIdentity().equals(Constant.IDENTITY.shoppingGuide)
					|| searchParam.getIdentity().equals(Constant.IDENTITY.storeManager)
					|| searchParam.getIdentity().equals(Constant.IDENTITY.CHAIN_HQ)) {
				paramMap.put("shopId", searchParam.getRelId());
			}
		}

		Integer searchStatus = searchParam.getSearchStatus();
		if (searchStatus != null) {
			if (searchStatus == 0) {// 0待审核 1启用 2停用 3未通过
				paramMap.put("userStatus", 2);// 0未提交审核 2审核中 1审核通过 4审核不通过
				paramMap.put("isDisabled", 0);
			} else if (searchStatus == 1) {
				paramMap.put("isDisabled", 0);
			} else if (searchStatus == 2) {
				paramMap.put("isDisabled", 1);
			} else if (searchStatus == 3) {
				paramMap.put("userStatus", 4);
				paramMap.put("isDisabled", 0);
			}
		}

		paramMap.put("orderBy", "update_at");
		paramMap.put("orderVa", "desc");

		PagingVO<BusinessAccountVO> accountPagingVO = iUserInfoService
				.searchAccountListByMap(paramMap, searchParam.getCurrentPage(),
						searchParam.getPageSize());
		PagingVO<AccountSearchVO> page = new PagingVO<AccountSearchVO>(
				searchParam.getPageSize(), searchParam.getCurrentPage(),
				accountPagingVO.getTotalSize());
		List<BusinessAccountVO> dataList = accountPagingVO.getDataList();
		if (dataList == null || dataList.size() == 0) {
			return page;
		}
		List<AccountSearchVO> resultAccounts = new ArrayList<AccountSearchVO>();
		List<String> optAuths = userService.getAuthsValueByUserId(optId);
		for (BusinessAccountVO accountVO : dataList) {
			AccountSearchVO searchVO = new AccountSearchVO();
			_packageSearchVO(searchVO, accountVO, optAuths);
			resultAccounts.add(searchVO);
		}
		page.setDataList(resultAccounts);
		return page;
	}

	private void _packageSearchVO(AccountSearchVO searchVO,
			BusinessAccountVO accountVO, List<String> optAuths) {
		searchVO.setId(accountVO.getId());
		searchVO.setStopAt(accountVO.getStopAt());
		searchVO.setStopReason(accountVO.getStopReason());
		searchVO.setIdentity(accountVO.getIdentity());
		searchVO.setIndustryId(accountVO.getIndustryId());
		searchVO.setIndustryName(accountVO.getIndustryName());
		searchVO.setIndustryVersionId(accountVO.getIndustryVersionId());
		searchVO.setIndustryVersionName(accountVO.getIndustryVersionName());
		searchVO.setIsChief(accountVO.getIsChief());
		searchVO.setIsDisabled(accountVO.getAccountStatus());
		if (accountVO.getIdentity().equals(Constant.IDENTITY.ownerAdmin)) {
			searchVO.setMarchantName(accountVO.getGroupName());
		} else if (accountVO.getIdentity().equals(Constant.IDENTITY.mallAdmin)) {
			searchVO.setMarchantName(accountVO.getMallName());
		} else if (accountVO.getIdentity().equals(
				Constant.IDENTITY.shoppingGuide)
				|| accountVO.getIdentity().equals(
						Constant.IDENTITY.storeManager)
				|| accountVO.getIdentity().equals(Constant.IDENTITY.CHAIN_HQ)) {
			searchVO.setMarchantName(accountVO.getShopName());
		}
		if (optAuths.contains(Constant.Authorities.ACT_MT_EDIT)) {
			if (accountVO.getCreateSource() != null
					&& accountVO.getCreateSource() == 3
					&& accountVO.getUserStatus() != null
					&& accountVO.getUserStatus().equals(1)) {
				searchVO.setOptEdit(1);
			} else if (accountVO.getIsChief() != null
					&& accountVO.getIsChief() == 1
					&& accountVO.getUserStatus() != null
					&& accountVO.getUserStatus().equals(1)) {
				searchVO.setOptEdit(1);
			} else {
				searchVO.setOptEdit(0);
			}
		} else {
			searchVO.setOptEdit(0);
		}
		if (optAuths.contains(Constant.Authorities.ACT_MT_AUDITING)
				&& accountVO.getUserStatus() != null
				&& accountVO.getUserStatus().equals(2)) {
			searchVO.setOptVerify(1);
		} else {
			searchVO.setOptVerify(0);
		}
		if (optAuths.contains(Constant.Authorities.ACT_MT_FREEZE)) {
			searchVO.setOptSuspended(1);
		} else {
			searchVO.setOptSuspended(0);
		}
		if (optAuths.contains(Constant.Authorities.ACT_MT_OPT)
				&& accountVO.getUserStatus() != null
				&& accountVO.getUserStatus() != 0) {
			searchVO.setOptStatus(1);// 1显示停用或启用
		} else {
			searchVO.setOptStatus(0);
		}
		// 0待审核 1启用 2停用 3未通过
		if (accountVO.getUserStatus() != null
				&& accountVO.getAccountStatus() == 0
				&& accountVO.getUserStatus() == 2) {
			searchVO.setSearchStatus(0);
			searchVO.setSearchStatusName("启用、待审核");
		} else if (accountVO.getAccountStatus() == 0) {
			searchVO.setSearchStatus(1);
			// 0未提交审核 2审核中 1审核通过 4审核不通过
			if (accountVO.getUserStatus() != null) {
				if (accountVO.getUserStatus() == 0) {
					searchVO.setSearchStatusName("启用、未提交审核");
				} else if (accountVO.getUserStatus() == 1) {
					searchVO.setSearchStatusName("启用、审核通过");
				} else if (accountVO.getUserStatus() == 4) {
					searchVO.setSearchStatusName("启用、审核不通过");
				} else if (accountVO.getUserStatus() == 2) {
					searchVO.setSearchStatusName("启用、待审核");
				}
			}
		} else if (accountVO.getAccountStatus() == 1) {
			searchVO.setSearchStatus(2);
			searchVO.setSearchStatusName("停用");
		} else if (accountVO.getAccountStatus() == 0
				&& accountVO.getUserStatus() == 4) {
			searchVO.setSearchStatus(3);
			searchVO.setSearchStatusName("启用、未通过");
		}
		if (accountVO.getUserStatus() != null && accountVO.getUserStatus() == 1
				&& optAuths.contains(Constant.Authorities.ACT_MT_VIEW)
				&& optAuths.contains(Constant.Authorities.ACT_MT_AUTH)) {
			searchVO.setOptAuth(1);
		} else {
			searchVO.setOptAuth(0);
		}
		searchVO.setUserAccount(accountVO.getUserAccount());
		searchVO.setUserName(accountVO.getUserName());
		searchVO.setUserStatus(accountVO.getUserStatus());

		searchVO.setUserPhone(accountVO.getAccount());
		if (accountVO.getUserStatus() != null && accountVO.getUserStatus() == 1) {
			searchVO.setShowAuthDetail(1);
		} else {
			searchVO.setShowAuthDetail(0);
		}

		// 查询资金账户状态时 先查询用户是否有银行卡或支付宝信息
		try {
			List<UserAccountEntity> userAccountList = merchantAccountService
					.getUserAccountListInfo(accountVO.getId());
			if (CollectionUtils.isNotEmpty(userAccountList)
					&& !userAccountList.isEmpty()) {
				for (UserAccountEntity userAccountEntity : userAccountList) {
					if (StringUtils.isNotEmpty(userAccountEntity
							.getAccountCode())) {
						VirtualAccountVO virtualAccount = iUserInfoService
								.queryVirtualAccount(accountVO.getId()
										.toString());
						if (virtualAccount != null) {
							searchVO.setVirtualAccountStopAt(virtualAccount
									.getStopAt());
							searchVO.setVirtualAccountStopReason(virtualAccount
									.getStopReason());
							if (virtualAccount.getIsSuspended()) {
								searchVO.setCashStatus(1);// 冻结
							} else {
								searchVO.setCashStatus(0);
							}
						}
						break;
					}
				}
			} else {
				searchVO.setCashStatus(null);
			}
		} catch (Exception e) {

		}
	}

	public PagingVO<IndustrySearchVO> searchPagingList(
			IndustrySearchParam industrySearchParam) throws Exception {

		PagingVO searchPagingList = iIndustryService
				.searchPagingList(industrySearchParam);
		if (searchPagingList == null || searchPagingList.getDataList() == null
				|| searchPagingList.getDataList().isEmpty()) {
			return new PagingVO();
		}
		List<BIndustry> industryList = searchPagingList.getDataList();
		List<IndustrySearchVO> industrySearchVOs = new ArrayList<IndustrySearchVO>();
		for (BIndustry bIndustry : industryList) {
			IndustrySearchVO vo = new IndustrySearchVO();
			vo.setId(bIndustry.getId());
			vo.setName(bIndustry.getName());
			vo.setCreateAt(bIndustry.getCreateAt());
			if (bIndustry.getCreateBy() != null) {
				RyUserInfo ryUser = usersDao.getUserById(bIndustry
						.getCreateBy());
				if (ryUser != null) {
					vo.setCreateBy(ryUser.getName());
				}
			}
			industrySearchVOs.add(vo);
		}
		searchPagingList.setDataList(industrySearchVOs);
		return searchPagingList;
	}

	public IndustryInfoVO getFullIndustryInfo(Integer industryId, String type)
			throws Exception {
		IndustryInfoVO fullIndustryInfo = iIndustryService.getFullIndustryInfo(
				industryId, type);
		if (fullIndustryInfo == null) {
			return fullIndustryInfo;
		}
		// 组装创建人
		Integer updateBy = fullIndustryInfo.getUpdateBy();
		Integer createBy = fullIndustryInfo.getCreateBy();
		RyUserInfo updator = usersDao.getUserById(updateBy);
		fullIndustryInfo.setUpdatorName(updator == null ? null : updator
				.getName());
		RyUserInfo creator = usersDao.getUserById(createBy);
		fullIndustryInfo.setCreatorName(creator == null ? null : creator
				.getName());
		return fullIndustryInfo;
	}

	*/
/**
	 * 返回行业版本的权限
	 *
	 * @param industryId
	 * @param industryVersionId
	 * @return
	 * @throws Exception
	 *//*

	public IndustryVersionVO getIndustryVersionInfo(Integer industryId,
			int industryVersionId) throws Exception {
		logger.info(" 返回指定行业版本的权限getIndustryVersionInfo,industryId:"
				+ industryId + ",industryVersionId:" + industryVersionId);
		IndustryInfoVO fullIndustryInfo = iIndustryService.getFullIndustryInfo(
				industryId, "");
		if (fullIndustryInfo == null) {
			return null;
		}
		List<IndustryVersionVO> IndustryVersionVOs = fullIndustryInfo
				.getIndustryVersionVOs();
		if (CollectionUtils.isEmpty(IndustryVersionVOs)) {
			return null;
		}
		for (IndustryVersionVO industryVersionVO : IndustryVersionVOs) {
			if (industryVersionVO.getId() != null
					&& industryVersionVO.getId().intValue() == industryVersionId) {
				return industryVersionVO;
			}
		}
		return null;
	}
}
*/
