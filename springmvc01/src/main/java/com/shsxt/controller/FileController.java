package com.shsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by xlf on 2019/4/15.
 */
@Controller
public class FileController {

    @RequestMapping("upload")
    @ResponseBody
    public String upload(HttpServletRequest request){
        // 获取上传请求对象
        MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
        // 获取上传文件
        MultipartFile file = mr.getFile("file");
        // 获取图片存储目录
        String path=request.getSession().getServletContext().getRealPath("upload");
        System.out.println(path);
        // 存图片
        if(null!=file && !file.isEmpty()){
            // 获取上传文件的名字
            String filename = file.getOriginalFilename();
            try {
                // 存
                file.transferTo(new File(path,filename));
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败";
            }
        }

        return "上传成功";
    }
}
