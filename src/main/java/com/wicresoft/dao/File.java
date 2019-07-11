package com.wicresoft.dao;

import org.springframework.web.multipart.MultipartFile;

public class File {
    private String fileName;
    private MultipartFile fileContent;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public MultipartFile getFileContent() {
        return fileContent;
    }

    public void setFileContent(MultipartFile fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", fileContent=" + fileContent +
                '}';
    }
}
