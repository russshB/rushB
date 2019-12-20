/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/upload")
public class UploadController {
    @ResponseBody
    @RequestMapping(value = "/wang")
    public WangEditor uploadFile(@RequestParam("myFile") MultipartFile multipartFile, HttpServletRequest request) {

        try {
            // 获取服务器真实路径
            String realPath = request.getSession().getServletContext().getRealPath("");
            InputStream inputStream = multipartFile.getInputStream();
            String contextPath = request.getContextPath();
            // 服务器根目录的路径
            String path = null;
            if (contextPath.length() > 0) {
                path = realPath.replace(contextPath.substring(1), "");
            } else {
                path = realPath;
            }
            // 根目录下新建文件夹upload，存放上传图片
            String uploadPath = path + "upload";
            /* 获取上传文件的后缀 */
            String suffix = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));
            /* 保存文件名称 */
            String filename = UUID.randomUUID().toString() + suffix;
            // 将文件上传的服务器根目录下的upload文件夹
            File file = new File(uploadPath, filename);
            FileUtils.copyInputStreamToFile(inputStream, file);
            // 返回图片访问路径
            String url = request.getScheme() + "://" + request.getServerName()
                    + ":" + request.getServerPort() + "/upload/" + filename;

            String[] strs = {url};
            WangEditor we = new WangEditor();
            we.setErrno(new Integer(0));
            we.setData(strs);
            return we;
        } catch (IOException e) {
            //log.error("上传文件失败", e);
            e.printStackTrace();
        }
        return null;

    }
}
