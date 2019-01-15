package com.rongyi.constants;



public interface Constant {

	String USER_SESSIONKEY = "SESSION_USER";
	Integer SESSION_TIMEOUT = 60 * 60 * 2;



	/*
     * 共同类型
     */
    interface Common {

        int    YES                  = 1;
        int    NO                   = 0;
        // 图片目录
        String IMAGE_ROOT_DIR       = "upload.dir";
        // CRM mina服务器的IP和端口
        String MINA_SERVER_IP       = "mina.server.ip";
        String MINA_SERVER_PORT     = "mina.server.port";
        String CRM_HOST_URL = "crm.rongyi.com";

        String CMS_URL = "cms.url";
        String VMS_URL = "vms.url";
        String COUPON_URL = "coupon.url";
        String ACTIVITY_URL = "activity.url";
		//积分商城url
		String CMC_URL = "cmc.url";
		//会员管理中心
		String MMS_URL = "mms.url";
		String MCMC_URL = "mcmc.url";
		String TMS_URL = "tms.url";
		String CONTENT_URL = "content.url";
		String MCT_URL = "mct.url";
		String GCC_URL = "gcc.url";
		String EXCEL_ROOT_DIR = "upload.user.dir";    }

    /**
     * 开启状态
     */
    interface OpenState {

        /**
         * 开启
         */
        Byte OPEN_STATE  = 1;
        /**
         * 关闭
         */
        Byte CLOSE_STATE = 0;
    }


    /**
     *  内部员工账号状态
     */
    interface Status {

        /**
         * 正常 1
         */
        Byte STATUS_NORMAL = 1;
        /**
         * 锁定 2
         */
        Byte STATUS_LOCKED = 2;
		/**
		 * 删除 3
		 */
		Byte STATUS_DELETE  = 0;
    }

    interface Accounts {
    	String SUPERADMIN = "superadmin";
    }
    
    /**
     * 账户分页相关常量
     * @author LiuChao
     * 
     */
    interface UserPage {
    	Integer pageSize =10;
    }
    
    /**
     * 角色分页相关常量
     * @author LiuChao
     * 
     */
    interface RolePage {
    	Integer pageSize = 10;
    }
    
    interface InviteCodePage{
    	Integer pageSize = 10;
    }
    
    interface MallGroupPage{
    	Integer pageSize = 10;
    }
    
    interface WechatPage{
    	Integer pageSize = 10 ;
    }
    
    /**
     * 平台类型
     * @author pingkang
     * 超级管理员
     * 百货
     * 商超
     *
     */
    interface PlatformType {
    	Byte SUPERADMIN = 0;
    	Byte STORE = 1;//百货
    	Byte SUPERMARKET = 2;//商超
    	Byte RONGYIADMIN = 3;//管理员
    	Byte MOSHOPADMIN = 4;//摩店
    }
    
    interface PlatformTypeStr {
    	String SUPERADMIN = "PLATFORM_TYPE_0";
    	String STORE = "PLATFORM_TYPE_1";//百货
    	String SUPERMARKET = "PLATFORM_TYPE_2";//商超
    	String RONGYIADMIN = "PLATFORM_TYPE_3";//容易网管理员
    	String MOSHOPADMIN = "PLATFORM_TYPE_4";//摩店
    }
    
    interface GroupsRelation {
    	String DEFAULT_GROUP_ID = "100000";//容易网groupId
    	String DEFAULT_OWNER_ID = "000000";//容易网ownerId	
    	
    }
    
    /**
     * 默认的密码，写死MD5
     * @author pingkang
     *
     */
    interface Password {
    	String DEFAULT = "e10adc3949ba59abbe56e057f20f883e";//123456
    }
    
    interface JSON_RESULT {
    	/**
    	 * 正常返回状态
    	 */
    	short STATUS_NORMAL = 1;
    	/**
    	 * 异常返回状态
    	 */
    	short STATUS_ABNORMAL = 0;
    }
    interface Authorities{
    	String CPS_SHOP = "CPS_SHOP";
    	String CPS_SHOP_VIEW = "CPS_SHOP_VIEW";
    	String CPS_SHOP_ADD = "CPS_SHOP_ADD";
    	String CPS_SHOP_EDIT = "CPS_SHOP_EDIT";
    	String CPS_SHOP_DELETE = "CPS_SHOP_DELETE";
    	String CPS_SHOP_REPLACE = "CPS_SHOP_REPLACE";
    	String CPS_SHOP_VERIFY = "CPS_SHOP_VERIFY";
    	
    	String CPS_ACTIVITY = "CPS_ACTIVITY";
    	
    	String CPS_MALLACTIVITY = "CPS_MALLACTIVITY";
    	String CPS_MALLACTIVITYSORT = "CPS_MALLACTIVITYSORT";
    	String CPS_CONDITION = "CPS_CONDITION";
    	String CPS_CHANNEL = "CPS_CHANNEL";
    	String MMS_BENEFIT = "MMS_BENEFIT";
    	String MMS_INTEGRALRULES = "MMS_INTEGRALRULES";
    	String CMC_COMMODITY = "CMC_COMMODITY";
    	String CMC_INTEGRAL = "CMC_INTEGRAL";
    	String CMC_COUPON = "CMC_COUPON";//优惠券
    	String CMC_CASH = "CMC_CASH";//现金券
    	String WMS_REPLY = "WMS_REPLY";
    	String WMS_IDENTITY = "WMS_IDENTITY";
    	
    	// 客服-工单模块权限
    	String CUSTOM_JOBLIST_VIEW ="CUSTOM_JOBLIST_VIEW"; ///< 浏览
    	String CUSTOM_JOBLISTA_ADD ="CUSTOM_JOBLISTA_ADD"; ///< 新建
    	String CUSTOM_JOBLIST_EDIT ="CUSTOM_JOBLIST_EDIT"; ///< 修改
    	// 客服-整体报表模块权限
    	String CUSTOM_WHORPT_VIEW ="CUSTOM_WHORPT_VIEW"; ///< 浏览
    	String CUSTOM_WHORPT_EXPORT ="CUSTOM_WHORPT_EXPORT"; ///< 导出
    	// 客服-客服人员报表模块权限
    	String CUSTOM_USERRPT_VIEW ="CUSTOM_USERRPT_VIEW"; ///< 浏览
    	String CUSTOM_USERRPT_EXPORT ="CUSTOM_USERRPT_EXPORT"; ///< 导出
    	//客服-心愿单
		String CUSTOM_WISH_VIEW = "CUSTOM_WISH_VIEW";
		String CUSTOM_WISH_REPLY = "CUSTOM_WISH_REPLY";
    	//广告管理
    	String ADVER ="ADVER";
    	//广告内容管理权限
    	String ADVER_CONT ="ADVER_CONT";//广告内容
    	String ADVER_CONT_VIEW ="ADVER_CONT_VIEW";//浏览
    	String ADVER_CONT_ADD ="ADVER_CONT_ADD";//新建
    	String ADVER_CONT_VFY ="ADVER_CONT_VFY";//审核
    	String ADVER_CONT_EDIT ="ADVER_CONT_EDIT";//修改
    	String ADVER_CONT_DEL ="ADVER_CONT_DEL";//删除
    	String ADVER_CONT_OFFLINE ="ADVER_CONT_OFFLINE";//下线
    	//默认素材管理
    	String ADVER_FODDER ="ADVER_FODDER";//默认素材
    	String ADVER_FODDER_VIEW ="ADVER_FODDER_VIEW";//浏览
    	String ADVER_FODDER_ADD ="ADVER_FODDER_ADD";//新建
    	String ADVER_FODDER_EDIT ="ADVER_FODDER_EDIT";//修改
    	String ADVER_FODDER_DEL ="ADVER_FODDER_DEL";//删除
    	String ADVER_FODDER_MOVE ="ADVER_FODDER_MOVE";//上移/下移
    	//参数配置管理
    	String ADVER_PARCONF ="ADVER_PARCONF";//参数配置
    	String ADVER_PARCONF_VIEW ="ADVER_PARCONF_VIEW";//浏览
    	String ADVER_PARCONF_ADD ="ADVER_PARCONF_ADD";//新建
    	String ADVER_PARCONF_EDIT ="ADVER_PARCONF_EDIT";//修改
    	String ADVER_PARCONF_OPT ="ADVER_PARCONF_OPT";//启用/停用
    	//广告关联页
    	String ADVER_RELATION ="ADVER_RELATION";//广告关联页
    	String ADVER_RELATION_VIEW ="ADVER_RELATION_VIEW";//浏览
    	String ADVER_RELATION_ADD ="ADVER_RELATION_ADD";//新建
    	String ADVER_RELATION_EDIT ="ADVER_RELATION_EDIT";//修改
    	String ADVER_RELATION_CLO ="ADVER_RELATION_CLO";//关闭
    	
    	String ADVER_INCREUP="ADVER_INCREUP";//增量更新
    	String ADVER_INCREUP_VIEW="ADVER_INCREUP_VIEW";//浏览
    	String ADVER_INCREUP_UPDATE="ADVER_INCREUP_UPDATE";//更新
    	
    	//商家账号
    	String ACT_MT_VIEW="ACT_MT_VIEW";//商户账号浏览
    	String ACT_MT_ADD="ACT_MT_ADD";//商户账号新建
    	String ACT_MT_EDIT="ACT_MT_EDIT";//商户账号修改
    	String ACT_MT_AUDITING="ACT_MT_AUDITING";//商户账号审核
    	String ACT_MT_OPT="ACT_MT_OPT";//商户账号启用/停用
    	String ACT_MT_FREEZE="ACT_MT_FREEZE";//商户账号冻结/解冻
    	String ACT_MT_AUTH="ACT_MT_AUTH";//商户账号权限查看
    	
    	//行业
    	String ACT_INDU_VIEW="ACT_INDU_VIEW";//行业浏览
    	String ACT_INDU_ADD="ACT_INDU_ADD";//行业新建
    	String ACT_INDU_EDIT="ACT_INDU_EDIT";//行业修改
    	
    	
    }
    
    interface BSTYPE{
    	//0商场、1品牌、2买手
    	Integer mall = 0;
    	Integer brand = 1;
    	Integer buyer = 2;
    }
    
    interface IDENTITY{
    	//身份类型:0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购、6买手、8连锁总部
    	Integer ownerAdmin = 0;
    	Integer mallAdmin = 1;
    	Integer brandAdmin = 2;
    	Integer branchCompany = 3;
    	Integer storeManager = 4;
    	Integer shoppingGuide = 5;
    	Integer buyer = 6;
    	Integer CHAIN_HQ = 8;
    }
    
    /**
     * 项目接入地址
     * @author user
     *
     */
    interface OutsideProjectUrl{
    	String CONTENT_MANAGE = "project.contentManage";
    	String MESSAGE_MANAGE = "project.messageManage";
    	String MEMBER_MANAGE = "project.memberManage";
    	String SETTLEMENT_MANAGE = "project.settlementManage";
    	String COUPONVIEW_MANAGE = "project.couponViewManage";
    	String SHOP_MANAGE = "project.shopManage";
		String ACTIVITY_MANAGE = "project.activityManage";
		String TERMIN_MANAGE = "project.terminManage";
		String COUPON_MANAGE = "project.couponManage";
		String BI_MANAGE = "project.biManage";
		String WECHAT_MANAGE = "project.wechatManage";
		String CALLCENTER_MANAGE = "project.callCenterManage";
		String ADVERT_MANAGE = "project.advertManage";
		String ORDER_MANAGE = "project.orderManage";
		String GOODS_MANAGE = "project.goodsManage";
		String SCORE_MANAGE = "project.scoreManage";
		String TASK_MANAGE = "project.taskManage";
		String ACCOUNT_MANAGE = "project.accountManage";
		String TRADEPLATFORM_MANAGE = "project.tradePlatformManage";
		String ANDROIDSCREEN_MANAGE = "project.androidScreenManage";
		String OPS_MANAGE = "project.opsManage";
		String INTERACTIVE_MANAGEMENT = "project.interactiveManage";
    }
    
    /**
     * 项目权限判断
     * @author user
     *
     */
    interface ProjectAuth{
    	String CONTENT_AUTH = "project.contentAuth";
    	String MESSAGE_AUTH = "project.messageAuth";
    	String MEMBER_AUTH = "project.memberAuth";
    	String SETTLEMENT_AUTH = "project.settlementAuth";
    	String COUPONVIEW_AUTH = "project.couponViewAuth";
    	String SHOP_AUTH = "project.shopAuth";
		String ACTIVITY_AUTH = "project.activityAuth";
		String TERMIN_AUTH = "project.terminAuth";
		String COUPON_AUTH = "project.couponAuth";
		String BI_AUTH = "project.biAuth";
		String WECHAT_AUTH = "project.wechatAuth";
		String CALLCENTER_AUTH = "project.callCenterAuth";
		String ACCOUNT_AUTH = "project.accountrAuth";
		String ADVERT_AUTH = "project.advertAuth";
		String ORDER_AUTH = "project.orderAuth";
		String GOODS_AUTH = "project.goodsAuth";
		String TASK_AUTH = "project.taskAuth";
		String SCORE_AUTH = "project.scoretAuth";
		String TRADEPLATFORM_AUTH = "project.tradePlatformAuth";
		String ANDROIDSCREEN_AUTH = "project.androidScreenAuth";
		String OPS_AUTH = "project.opsAuth";
		String INTERACTIVE_AUTH = "project.interactiveAuth";
    }
    
    interface advertManagerUrl{
    	String ADVERT_URL ="advert_url";//广告调用php接口配置地址
    	String PUBLISH_URL="publish_url";//广告调用php增量同步接口地址
    }
    interface advertCode{
    	Integer BANNER_ADVERT=1;//banner 广告修改
    	Integer BANNER_DEFAULT=2;//banner素材修改
    	Integer FULL_ADVERT=3;//全屏广告修改
    	Integer FULL_DEFAULT=4;//全屏素材修改
    	Integer BANNER_ADVERT_SORT=5;//banner广告顺序
    	Integer BANNER_DEFAULT_SORT=6;//banner素材顺序
    	Integer FULL_ADVERT_SORT=7;//全屏广告顺序
    	Integer FULL_DEFAULT_SORT=8;//banner广告顺序
    	Integer CONFIG=9;//广告配置
    	Integer LOCATION=10;//关联页配置
    	Integer ADVERT_FULL_TO_BANNER=11;//广告全屏修改为banner
    	Integer ADVERT_BANNER_TO_FULL=12;//广告banner修改为全屏
    	Integer DEFAULT_FULL_TO_BANNER=13;//默认素材全屏修改为banner
    	Integer DEFAULT_BANNER_TO_FULL=14;//默认素材banner修改为全屏
    	Integer CONFIG_MALLIDCHANGE=15;//广告配置修改商场的id
		Integer INSIDE_ADVERT=16;//内页广告内容修改
		Integer INSIDE_DEFAULT=17;//内页广告素材修改
		Integer DEFAULT_BANNER_TO_INSIDE=18;//banner默认素材改成内页默认素材
		Integer DEFAULT_FULL_TO_INSIDE=19;//全屏默认素材改成内页默认素材
		Integer DEFAULT_INSIDE_TO_FULL=20;//内页默认素材改成全屏默认素材
		Integer DEFAULT_INSIDE_TO_BANNER=21;//内页默认素材改成banner默认素材
		Integer INSIDE_ADVERT_SORT=22;//内页广告排序
		Integer INSIDE_DEFAULT_SORT=23;//内页素材排序
		Integer ADVERT_FULL_TO_INNER=24;//广告全屏修改为内页广告
		Integer ADVERT_INNER_TO_FULL=25;//广告内页广告修改为全屏
		Integer ADVERT_BANNER_TO_INNER=26;//广告banner修改为内页广告
		Integer ADVERT_INNER_TO_BANNER=27;//广告内页广告修改为banner
    }
    /**
     * 错误码	
     * @author user
     *
     */
    interface ErrorCode{
    	Integer SUCCESS = 0 ; //成功
    	Integer SYSTEM =  1090000; //系统错误
    	Integer PARAM = 1090001 ;//参数错误
    	Integer LOGIC = 1090002 ;//逻辑错误
    	Integer FAIL = 1 ;//失败
    }
    
    interface WechatRelationship {
    	/**
    	 * 类型
    	 */
        PropertyDate[] TYPE_LIST      = { 
        		new PropertyDate("1", "容易内部&代运营"), 
        		new PropertyDate("2", "容易外部"), 
        };
        /**
    	 * 对接方式
    	 */
        PropertyDate[] DOCKING_TYPE_LIST      = { 
        		new PropertyDate("1", "B类"), 
        		new PropertyDate("2", "C类"), 
        };
    }
    
    /**
     * 微信服务号类型
     */
    interface WechatType {
    	Integer group = 0;
    	Integer mall = 1 ;
		Integer shop = 2;
		Integer mall_shop = 3; //连锁总部和商场
    }
    
    /**
     * 上传文件类型
     * @author user
     *
     */
    interface ImportFile {
        String FILE_NAME_SUFFIX = ".xlsx";
    }
    
    /**
     * 商家用户状态
     */
    interface BsUserStatus{
    	/** 用户状态：审核不通过 */
		Integer DELETE = 4;
		
		/** 用户状态：审核中 */
		Integer CHECKING = 2;
		
		/** 用户状态：通过*/
		Integer ACCESS = 1;
		
		/** 用户状态：未提交审核 */
		Integer NOCHECK = 0 ;
    }
    
    interface access{
    	String DOMAINS = "access.domains";
    }
    
    interface ImagesCloud {
//    	PropertyConfigurer propertyConfigurer = (PropertyConfigurer) SpringContextUtil.getBean("propertyPlaceholderConfigurer");
//		String UPLOAD_DIR = propertyConfigurer.getProperty("upload.dir").toString();
        //String UPLOAD_DIR                          = "F:";                                           // 上传的路径
    	String UPAIYUN_Url                         = "http://rongyi.b0.upaiyun.com/";                                // 云盘路径
        String UPAIYUN_URL_MERCHANTPIC = "system/merchantHeadPics/";//入住商家头像路径
    }
    
    interface Property {
		// 商场类型
		PropertyDate[] MALL_MOLD = { new PropertyDate("0", "百货商店"), new PropertyDate("1", "超级市场 "),
				new PropertyDate("2", "便利店"), new PropertyDate("3", "商业步行街"), new PropertyDate("4", "银行"),
				new PropertyDate("5", "购物中心"), new PropertyDate("6", "专业市场"), new PropertyDate("7", "卖场") };
		// 商场店铺推荐
		PropertyDate[] RECOMMEND = { new PropertyDate("0", "未推荐"), new PropertyDate("1", "已推荐") };
		
		// 合作状态
		PropertyDate[] BUSINESSSTATUS = { new PropertyDate("0", "正常营业"), new PropertyDate("1", "即将营业")
				, new PropertyDate("2", "暂停营业"), new PropertyDate("3", "停止营业")		
		};

	}
    interface MERCHANTTYPE{
    	String group = "group";
    	String mall = "mall";
    	String shop = "shop";
    }
}
