package com.sunxiaodong.weblog.web.service;

import com.sunxiaodong.weblog.common.utils.Response;
import com.sunxiaodong.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;

/**
 * @author: sunxiaodong
 
 * @description: 分类
 **/
public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList();

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
