package com.quanxiaoha.weblog.web.service;

import com.quanxiaoha.weblog.common.utils.Response;
import com.quanxiaoha.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;

/**
 * @author: 犬小哈
 * @url: www.quanxiaoha.com
 * @date: 2023-09-15 14:03
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
