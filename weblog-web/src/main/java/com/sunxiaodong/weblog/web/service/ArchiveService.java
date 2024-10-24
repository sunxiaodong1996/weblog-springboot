package com.sunxiaodong.weblog.web.service;

import com.sunxiaodong.weblog.common.utils.Response;
import com.sunxiaodong.weblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

/**
 * @author: sunxiaodong
 * @description: 归档文章
 **/
public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}
