package com.sunxiaodong.weblog.common.constant;

import java.time.format.DateTimeFormatter;

/**
 * @author: sunxiaodong
 * @description: 全局静态变量
 **/
public interface Constants {
    /**
     * 月-日 格式
     */
    DateTimeFormatter MONTH_DAY_FORMATTER = DateTimeFormatter.ofPattern("MM-dd");
}
