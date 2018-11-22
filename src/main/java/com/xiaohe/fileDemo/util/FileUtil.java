package com.xiaohe.fileDemo.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Map;
import java.util.UUID;

public class FileUtil {

    private static String mediaRoot = "target/classes/static/file/";

    public static String saveFile(MultipartFile mediaFile,String key) throws IOException {
        File file = new File(mediaRoot);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileInputStream fileInputStream = (FileInputStream) mediaFile.getInputStream();
        String fileName = key;
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(mediaRoot + fileName));
        byte[] bs = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }
        bos.flush();
        bos.close();
        if(fileName.substring(fileName.lastIndexOf(".") + 1).equals("png")||fileName.substring(fileName.lastIndexOf(".") + 1).equals("bmp")||fileName.substring(fileName.lastIndexOf(".") + 1).equals("jpg")
                ||fileName.substring(fileName.lastIndexOf(".") + 1).equals("jpeg")||fileName.substring(fileName.lastIndexOf(".") + 1).equals("gif")||fileName.substring(fileName.lastIndexOf(".") + 1).equals("webp"))
        {
            return "/static/file/" + fileName;
        }
        else if(fileName.substring(fileName.lastIndexOf(".") + 1).equals("ppt")) {
            String lujing=mediaRoot + fileName.substring(0, fileName.length()-fileName.substring(fileName.lastIndexOf(".")).length())+"/";
            File tempfile = new File(lujing);
            if (!tempfile.exists()) {
                tempfile.mkdirs();
            }
            Map<String, Object> map = PPTToImageUtil.converPPTtoImage(mediaRoot + fileName,
                    lujing, "jpg");
            boolean converReturnResult = (Boolean) map.get("converReturnResult");

            if (converReturnResult) {
                return "/static/file/" + fileName;
            }
        }else if(fileName.substring(fileName.lastIndexOf(".") + 1).equals("pptx")){
            String lujing=mediaRoot + fileName.substring(0, fileName.length()-fileName.substring(fileName.lastIndexOf(".")).length())+"/";
            File tempfile = new File(lujing);
            if (!tempfile.exists()) {
                tempfile.mkdirs();
            }
            Map<String, Object> map = PPTToImageUtil.converPPTXtoImage(mediaRoot + fileName,
                    lujing, "jpg");
            boolean converReturnResult = (Boolean) map.get("converReturnResult");

            if (converReturnResult) {
                return "/static/file/" + fileName;
            }
        }
        else if((fileName.substring(fileName.lastIndexOf(".") + 1).equals("pdf"))){
            String lujing=mediaRoot + fileName.substring(0, fileName.length()-fileName.substring(fileName.lastIndexOf(".")).length())+"/";
            File tempfile = new File(lujing);
            if (!tempfile.exists()) {
                tempfile.mkdirs();
            }
            PdfToImageUtil.pdf2png(mediaRoot,fileName.substring(0, fileName.length()-fileName.substring(fileName.lastIndexOf(".")).length()));
            return "/static/file/" + fileName;
        }
        return "";
    }
}
