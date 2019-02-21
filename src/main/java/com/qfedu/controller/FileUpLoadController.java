package com.qfedu.controller;

import com.qfedu.util.ResultUtil;
import com.qfedu.vo.ResultVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;

/**
 *@Author feri
 *@Date Created in 2019/2/21 10:12
 */
@RestController
public class FileUpLoadController {

    @PostMapping("fileupsave.do")
    public ResultVo fileUp(@RequestParam("fileimg")CommonsMultipartFile multipartFile) throws IOException {
        File file=new File(multipartFile.getOriginalFilename());
        multipartFile.transferTo(file);
        return ResultUtil.exec(true,file.getAbsolutePath(),null);
    }
}
