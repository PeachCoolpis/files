package com.example.files.controller;


import com.example.files.entity.BaseVo;
import com.example.files.entity.FileParent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Controller
public class FileController {
    
    
    @GetMapping("/")
    public String home() {
        return "testFile";
    }
    
    @PostMapping("/upload")
    @ResponseBody
    public String upload(
            @ModelAttribute BaseVo baseVo
    ) {
        fileOutPut(baseVo);
        return "ok";
    }
    
    public void fileOutPut(BaseVo baseVo) {
        if (baseVo.getFile1() != null) {
            for (MultipartFile file : baseVo.getFile1()) {
                System.out.println("file1 파일 이름: " + file.getOriginalFilename());
                // 파일 저장 또는 처리 로직
            }
        }
        
        // 파일 2 처리
        if (baseVo.getFile2() != null) {
            for (MultipartFile file : baseVo.getFile2()) {
                System.out.println("file2 파일 이름: " + file.getOriginalFilename());
                // 파일 저장 또는 처리 로직
            }
        }
    }
    

}
