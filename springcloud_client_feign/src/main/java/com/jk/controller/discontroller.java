package com.jk.controller;

import com.jk.model.DiscussModel;
import com.jk.utils.OSSClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.jk.service.gqservice;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("dis")
public class discontroller {
    @Autowired
    private  gqservice service;

    @RequestMapping("adddis")
    public  String  adddis(DiscussModel  disuss){
        return  service.addids(disuss);
    }
    @RequestMapping("uploadimg")
    @ResponseBody
    public Map upload(MultipartFile imgfile, HttpServletRequest request) throws IOException {
        OSSClientUtil ossClient = new OSSClientUtil();
        String name = ossClient.uploadImg2Oss(imgfile);
        System.out.println(name);
        String fileUpload = ossClient.getImgUrl(name);
        HashMap<String, Object> result = new HashMap<>();
        result.put("img", fileUpload);
        return result;
    }
}
