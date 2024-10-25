package com.sunxiaodong.weblog.admin.service;

import com.sunxiaodong.weblog.admin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.sunxiaodong.weblog.common.utils.Response;

/**
 * @author: sunxiaodong
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
