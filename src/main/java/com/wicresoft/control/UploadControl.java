package com.wicresoft.control;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wicresoft.dao.File;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/v1")
@Api(value = "/v1",description = "File Upload API")
public class UploadControl {

    @RequestMapping("/fileUpload")
    @ApiOperation(value = "/fileUpload", httpMethod = "POST", notes = "Retrieve uploaded pics from PowerApps",produces = "application/json")
    @ResponseBody
    public JSONObject fileUpload(@RequestParam(value = "filename") String fileName, @RequestParam(value = "file") MultipartFile file){

        String base64String = null;
        try {
             base64String = new BASE64Encoder().encodeBuffer(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jsonString="{"+
                "\"fileName\":\""+fileName+"\","+
                "\"fileContent\":\"" + base64String +
                "\"}";



        return JSONObject.parseObject(jsonString);
    }
}
