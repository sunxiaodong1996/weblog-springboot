package com.sunxiaodong.weblog.admin.model.convert;

import com.sunxiaodong.weblog.admin.model.model.vo.blogsettings.FindBlogSettingsRspVO;
import com.sunxiaodong.weblog.admin.model.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.sunxiaodong.weblog.common.domain.dos.BlogSettingsDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author: sunxiaodong
 * @url: www.sunxiaodong.com
 * @date: 2023/10/8 14:57
 * @description: 博客设置转换
 **/
@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 VO 转化为 DO
     * @param bean
     * @return
     */
    BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindBlogSettingsRspVO convertDO2VO(BlogSettingsDO bean);

}
