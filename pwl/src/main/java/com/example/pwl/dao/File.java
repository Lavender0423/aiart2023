package com.example.pwl.dao;

/**
 * 文件类，仅包含一个属性-->文件是否存在
 */
public class File {
    private boolean flag;

    public File(boolean flag){
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

}
