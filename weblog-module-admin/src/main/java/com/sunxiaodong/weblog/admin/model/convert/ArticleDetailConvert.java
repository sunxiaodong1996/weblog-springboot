package com.sunxiaodong.weblog.admin.model.convert;

import com.sunxiaodong.weblog.admin.model.model.vo.article.FindArticleDetailRspVO;
import com.sunxiaodong.weblog.common.domain.dos.ArticleDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author: sunxiaodong
 * @url: www.sunxiaodong.com
 * @date: 2023/10/8 14:57
 * @description: 文章详情转换
 **/
@Mapper
public interface ArticleDetailConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleDetailConvert INSTANCE = Mappers.getMapper(ArticleDetailConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindArticleDetailRspVO convertDO2VO(ArticleDO bean);

}
