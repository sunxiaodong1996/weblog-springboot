package com.sunxiaodong.weblog.admin.model.model.vo.category;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author: sunxiaodong
 * 
 * @description: 删除分类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "删除分类 VO")
public class DeleteCategoryReqVO {

    @NotNull(message = "分类 ID 不能为空")
    private Long id;

}
