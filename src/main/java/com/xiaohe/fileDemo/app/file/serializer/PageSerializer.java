package com.xiaohe.fileDemo.app.file.serializer;

import com.xiaohe.fileDemo.framework.Serializer;
import org.springframework.web.multipart.MultipartFile;

public class PageSerializer extends Serializer {

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}