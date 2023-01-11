package com.example.pwl.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Util {
    public static boolean isDirExist(String path){
        if(path.trim().length()>0){
            File file = new File(path);
            if(!file.exists()){
                return false;
            }else return !file.isFile();
        }
        return false;
    }

    public static boolean isFileExist(String path){
        if(path.trim().length()>0){
            File file = new File(path);
            if(!file.exists()){
                return false;
            }else return file.isFile();
        }
        return false;
    }

    /**
     *
     * @param path：文件夹路径
     * @param collection：容器
     */
    public static void getAllFileFromFold(String path,List<String> collection){
        if(isDirExist(path)){//存在才进行下一步
            File file = new File(path);
            String[] inners = file.list();
            if(inners!=null&&inners.length>0) {
                for (String inner : inners) {
                    String tempPath = join(path, inner);
                    if (new File(tempPath).isFile()) {
                        //说明是文件，直接将路径加入集合
                        collection.add(tempPath);
                    } else {
                        getAllFileFromFold(tempPath, collection);
                    }
                }
            }
        }
    }

    /**
     * 模拟python的join方法，拼接路径
     * @param parts:需要拼接的碎片
     * @return 返回拼接结果
     */
    public static String join(String... parts){
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(part);
            System.out.println(part);
            sb.append("\\");
        }

        return sb.toString();
    }
}
