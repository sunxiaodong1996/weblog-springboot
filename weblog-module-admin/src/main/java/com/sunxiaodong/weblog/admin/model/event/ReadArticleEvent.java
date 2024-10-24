package com.sunxiaodong.weblog.admin.model.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author: sunxiaodong
 * @url: www.sunxiaodong.com
 * @date: 2023/11/9 10:05
 * @description: 文章被阅读事件
 **/

@Getter
public class ReadArticleEvent extends ApplicationEvent {

    /**
     * 文章 ID
     */
    private Long articleId;

    public ReadArticleEvent(Object source, Long articleId) {
        super(source);
        this.articleId = articleId;
    }
}
