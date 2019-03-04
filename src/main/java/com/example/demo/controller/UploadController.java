/*
package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@RestController
public class UploadController {
    @PostMapping("/upload")
    public String upload(MultipartFile uploadfile,HttpServletRequest request) throws Exception{
        String path = request.getSession().getServletContext().getRealPath("/static");
        String oldName = uploadfile.getOriginalFilename();
        String newName = UUID.randomUUID().toString()+oldName;
        File file = new File(path,newName);
        File f = new File(path);
        if(!f.isDirectory()){
            f.mkdirs();
        }
        uploadfile.transferTo(file);
        String filepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/static/"+newName;
        return filepath;
    }
}
*/
