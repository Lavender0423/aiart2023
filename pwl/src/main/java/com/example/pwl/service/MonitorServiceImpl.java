package com.example.pwl.service;


import com.example.pwl.util.Util;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonitorServiceImpl implements MonitorService {
    @Override
    public List<String> getAllFileFromFold(String foldPath) {
        List<String> collection = new ArrayList<>();
        Util.getAllFileFromFold(foldPath,collection);
        return collection;
    }

    @Override
    public boolean fileIsExist(String filePath) {
        return Util.isFileExist(filePath);
    }
}
