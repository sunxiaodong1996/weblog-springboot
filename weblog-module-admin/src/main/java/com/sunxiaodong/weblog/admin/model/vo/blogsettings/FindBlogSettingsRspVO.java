package com.sunxiaodong.weblog.admin.model.vo.blogsettings;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: sunxiaodong
 * @description: 博客基础信息
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindBlogSettingsRspVO {

    private String logo;

    private String name;

    private String author;

    private String introduction;

    private String avatar;

    private String githubHomepage;

    private String csdnHomepage;

    private String giteeHomepage;

    private String zhihuHomepage;
}
