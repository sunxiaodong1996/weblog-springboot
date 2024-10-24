package com.sunxiaodong.weblog.admin.model.service;

import com.sunxiaodong.weblog.admin.model.model.vo.category.AddCategoryReqVO;
import com.sunxiaodong.weblog.admin.model.model.vo.category.DeleteCategoryReqVO;
import com.sunxiaodong.weblog.admin.model.model.vo.category.FindCategoryPageListReqVO;
import com.sunxiaodong.weblog.common.utils.PageResponse;
import com.sunxiaodong.weblog.common.utils.Response;

/**
 * @author: sunxiaodong
 
 * @description: TODO
 **/
public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryPageList(FindCategoryPageListReqVO findCategoryPageListReqVO);

    /**
     * 删除分类
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    /**
     * 获取文章分类的 Select 列表数据
     * @return
     */
    Response findCategorySelectList();

}
