package com.xiaohe.fileDemo.app.file;

import com.xiaohe.fileDemo.app.file.response.FileResponse;
import com.xiaohe.fileDemo.app.file.response.PageResponse;
import com.xiaohe.fileDemo.app.file.serializer.AvatarSerializer;
import com.xiaohe.fileDemo.app.file.serializer.PageSerializer;
import com.xiaohe.fileDemo.framework.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/file")
public class FileController extends Controller {

    @Autowired
    private FileView fileView;

    @RequestMapping(value = "/avatar", method = RequestMethod.POST)
    private FileResponse uploadAvatar(AvatarSerializer avatarSerializer) throws IOException {
        return fileView.uploadAvatar(avatarSerializer);
    }


    @RequestMapping(value = "/page", method = RequestMethod.POST)
    private PageResponse getPage(PageSerializer pageSerializer) throws IOException {
        return fileView.getPage(pageSerializer);
    }
}
