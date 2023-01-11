package com.example.pwl.web;

import com.example.pwl.dao.Files;
import com.example.pwl.service.MonitorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import com.example.pwl.dao.File;
import java.util.List;


@RestController
@RequestMapping("/file")
public class CheckController {
    @Resource
    private MonitorService monitorService;

    @GetMapping("/")
    public Files getAllInnerPathGet(String foldPath){
        List<String> filePathList =  monitorService.getAllFileFromFold(foldPath);
        return new Files(filePathList);
    }

    @PostMapping("/")
    public Files getAllInnerPathPost(String foldPath){
        List<String> filePathList =  monitorService.getAllFileFromFold(foldPath);
        return new Files(filePathList);
    }

    @GetMapping("/isExist")
    public File fileIsExistGet(String filePath){
        return new File(monitorService.fileIsExist(filePath));
    }

    @PostMapping("/isExist")
    public File fileIsExistPost(String filePath){
        return new File(monitorService.fileIsExist(filePath));
    }

}
