package com.sunxiaodong.weblog.admin.model.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: sunxiaodong
 * @url: www.sunxiaodong.com
 * @date: 2023-05-11 8:49
 * @description: TODO
 **/
@ConfigurationProperties(prefix = "minio")
@Component
@Data
public class MinioProperties {
    private String endpoint;
    private String accessKey;
    private String secretKey;
    private String bucketName;
}