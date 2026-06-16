package com.luoshanghua.com.entity.vo;

import lombok.Data;

@Data
public class FileUploadVO {

    //上传状态，1成功2失败
    private int status;
    //信息
    private String msg;

}
