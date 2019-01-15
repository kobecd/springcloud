package com.rongyi.easy.smart.vo.gameBox;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Description： 游戏盒子删除素材地址
 * Author:  Administrator
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/7/24 17:37          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

@Setter
@Getter
@ToString(callSuper = true)
public class GameBoxSoureVO implements Serializable{

    private static final long serialVersionUID = 1L;

    private Set<Integer> deleteCaseId;

    private Set<Integer> onlineCaseId;


}
