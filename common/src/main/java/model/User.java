package model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//user表对应的实体
@ToString
@Setter
@Getter
public class User extends BaseModel {
    private static final long serialVersionUID = 1L;

    private Long id;                             //数据库中的id
    private String nickName;            //用户的昵称---登陆时候的 username 用这个
    private String username;            //网页登陆时候的账号
    private String password;             //密码
    private String openId;                  //用户的标识，对当前公众号唯一o6_bmjrPTlm6_2sgVt7hMZOPfL2M
    private String accessToken;       //token令牌
    private Integer subscribe;          //关注的状态---------------------0未关注
    private String remark;                //对粉丝添加备注
    private Integer gender;                     //性别 1-男 2-女 3-未知
    private String headImgUrl;           //图像
    private String email;                    //
    private Long totalPoint;             //总积分
    private Long cardNumber;        //会员卡号
    private Integer vipLevel;           //会员等级


}
