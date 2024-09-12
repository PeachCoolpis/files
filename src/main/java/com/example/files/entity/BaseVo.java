package com.example.files.entity;


import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class BaseVo {
    
    private String textValue;
    private List<MultipartFile> file1;  // 파일 데이터
    private List<MultipartFile> file2;  // 파일 데이터
    
    
    public String getTextValue() {
        return textValue;
    }
    
    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }
    
    public List<MultipartFile> getFile1() {
        return file1;
    }
    
    public void setFile1(List<MultipartFile> file1) {
        this.file1 = file1;
    }
    
    public List<MultipartFile> getFile2() {
        return file2;
    }
    
    public void setFile2(List<MultipartFile> file2) {
        this.file2 = file2;
    }
}
