package com.sunxiaodong.weblog.web.controller;

import com.sunxiaodong.weblog.common.aspect.ApiOperationLog;
import com.sunxiaodong.weblog.common.utils.Response;
import com.sunxiaodong.weblog.web.service.BlogSettingsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: sunxiaodong
 @date:
 * @description: 博客设置
 **/
@RestController
@RequestMapping("/blog/settings")
@Api(tags = "博客设置")
public class BlogSettingsController {

    @Autowired
    private BlogSettingsService blogSettingsService;

    @PostMapping("/detail")
    @ApiOperation(value = "前台获取博客详情")
    @ApiOperationLog(description = "前台获取博客详情")
    public Response findDetail() {
        return blogSettingsService.findDetail();
    }

}
