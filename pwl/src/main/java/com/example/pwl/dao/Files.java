package com.example.pwl.dao;

import java.util.List;

public class Files {
    public Files(List<String> files){
        this.files = files;
        this.flag = !files.isEmpty();
    }

    private boolean flag;

    private List<String> files;

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public boolean isFlag() {
        return flag;
    }
}
