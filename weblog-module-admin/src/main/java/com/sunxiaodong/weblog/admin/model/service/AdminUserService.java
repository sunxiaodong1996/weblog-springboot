package com.sunxiaodong.weblog.admin.model.service;

import com.sunxiaodong.weblog.admin.model.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.sunxiaodong.weblog.common.utils.Response;

/**
 * @author: sunxiaodong
 * @url: www.sunxiaodong.com
 * @date: 2023-09-15 14:03
 * @description: TODO
 **/
public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);

    /**
     * 获取当前登录用户信息
     * @return
     */
    Response findUserInfo();
}