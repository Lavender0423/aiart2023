package com.example.pwl.service;

import java.util.List;

public interface MonitorService {
    List<String> getAllFileFromFold(String foldPath);

    boolean fileIsExist(String filePath);
}
