package com.sunxiaodong.weblog.admin.model.controller;

import com.sunxiaodong.weblog.admin.model.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.sunxiaodong.weblog.admin.model.service.AdminBlogSettingsService;
import com.sunxiaodong.weblog.common.aspect.ApiOperationLog;
import com.sunxiaodong.weblog.common.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: sunxiaodong
 * @url: www.sunxiaodong.com
 * @date: 2023-09-15 14:01
 * @description: 博客设置
 **/
@RestController
@RequestMapping("/admin/blog/settings")
@Api(tags = "Admin 博客设置模块")
public class AdminBlogSettingsController {

    @Autowired
    private AdminBlogSettingsService blogSettingsService;

    @PostMapping("/update")
    @ApiOperation(value = "博客基础信息修改")
    @ApiOperationLog(description = "博客基础信息修改")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response updateBlogSettings(@RequestBody @Validated UpdateBlogSettingsReqVO updateBlogSettingsReqVO) {
        return blogSettingsService.updateBlogSettings(updateBlogSettingsReqVO);
    }

    @PostMapping("/detail")
    @ApiOperation(value = "获取博客设置详情")
    @ApiOperationLog(description = "获取博客设置详情")
    public Response findDetail() {
        return blogSettingsService.findDetail();
    }

}
