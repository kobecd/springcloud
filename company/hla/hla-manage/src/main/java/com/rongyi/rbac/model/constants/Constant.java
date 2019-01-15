package com.rongyi.rbac.model.constants;



public interface Constant {

	String USER_SESSIONKEY = "SESSION_USER";
	Integer SESSION_TIMEOUT = 60 * 60 * 2;


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
	 * 错误码
	 * @author user
	 *
	 */
	interface ErrorCode{
		Integer SUCCESS = 0 ; //成功
		Integer SYSTEM =  1090000; //系统错误
		Integer PARAM = 1090001 ;//参数错误
		Integer LOGIC = 1090002 ;//逻辑错误
		Integer LOGIN = 1090003 ;//登陆失败
		Integer  NOTLOGIN = 1090004;//未登陆
		Integer FAIL = 1 ;//失败
	}


	/**
	 * 用户状态
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


	interface SpringSecurityConfig{

		String LOGINPAGE = "/login/loginPage"; //账号登陆页




	}

}
