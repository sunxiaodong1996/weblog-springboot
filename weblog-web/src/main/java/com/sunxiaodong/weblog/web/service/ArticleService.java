package com.sunxiaodong.weblog.web.service;

import com.sunxiaodong.weblog.common.utils.Response;
import com.sunxiaodong.weblog.web.model.vo.article.FindArticleDetailReqVO;
import com.sunxiaodong.weblog.web.model.vo.article.FindIndexArticlePageListReqVO;

/**
 * @author: sunxiaodong
 * @description: 文章
 **/
public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);

    /**
     * 获取文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);

}
