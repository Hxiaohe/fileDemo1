package com.xiaohe.fileDemo.app.file.serializer;

import com.xiaohe.fileDemo.framework.Serializer;
import org.springframework.web.multipart.MultipartFile;

public class AvatarSerializer extends Serializer {

    private MultipartFile avatar;

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }
}
