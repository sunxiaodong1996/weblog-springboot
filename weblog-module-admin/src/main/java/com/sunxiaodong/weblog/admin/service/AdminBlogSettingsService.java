package com.sunxiaodong.weblog.admin.service;

import com.sunxiaodong.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.sunxiaodong.weblog.common.utils.Response;

/**
 * @author: sunxiaodong
 
 * @description: TODO
 **/
public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);

    /**
     * 获取博客设置详情
     * @return
     */
    Response findDetail();
}
