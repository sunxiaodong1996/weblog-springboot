package com.sunxiaodong.weblog.web.service;

import com.sunxiaodong.weblog.common.utils.Response;
import com.sunxiaodong.weblog.web.model.vo.tag.FindTagArticlePageListReqVO;

/**
 * @author: sunxiaodong
 
 * @description: 分类
 **/
public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();

    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}
