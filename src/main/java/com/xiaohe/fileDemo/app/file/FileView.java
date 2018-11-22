package com.xiaohe.fileDemo.app.file;

import com.xiaohe.fileDemo.app.file.response.FileResponse;
import com.xiaohe.fileDemo.app.file.response.PageResponse;
import com.xiaohe.fileDemo.app.file.serializer.AvatarSerializer;
import com.xiaohe.fileDemo.app.file.serializer.PageSerializer;
import com.xiaohe.fileDemo.framework.View;
import com.xiaohe.fileDemo.util.FileUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileView extends View {

    public FileResponse uploadAvatar(AvatarSerializer avatarSerializer) throws IOException {
        MultipartFile avatar = avatarSerializer.getAvatar();
        String key=avatarSerializer.getKey();
        String filePath = FileUtil.saveFile(avatar,key);
        FileResponse fileResponse = new FileResponse();
        fileResponse.setUserAvatarUrl(filePath);
        return fileResponse;
    }

    public PageResponse getPage(PageSerializer pageSerializer) throws IOException {
        String key=pageSerializer.getKey();
        int num=0;
        if(key.substring(key.lastIndexOf(".") + 1).equals("pptx")||key.substring(key.lastIndexOf(".") + 1).equals("ppt")||key.substring(key.lastIndexOf(".") + 1).equals("pdf")){
            String lujing="target/classes/static/file/"+key.substring(0, key.length()-key.substring(key.lastIndexOf(".")).length());
            File file = new File(lujing);
            if (!file.exists()) {
                file.mkdirs();
            }
            File list[] = file.listFiles();
            for(int i = 0; i < list.length; i++){
                num++;
            }
        }
        PageResponse pageResponse = new PageResponse();
        pageResponse.setPage(num);
        return pageResponse;
    }
}
