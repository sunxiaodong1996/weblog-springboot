package com.sunxiaodong.weblog.web.service;

import com.sunxiaodong.weblog.common.utils.Response;

/**
 * @author: sunxiaodong
 
 * @description: 博客设置
 **/
public interface BlogSettingsService {
    /**
     * 获取博客设置信息
     * @return
     */
    Response findDetail();
}
