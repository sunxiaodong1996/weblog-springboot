package com.sunxiaodong.weblog.admin.model.service;

import com.sunxiaodong.weblog.common.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: sunxiaodong
 
 * @description: TODO
 **/
public interface AdminFileService {
    /**
     * 上传文件
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}
