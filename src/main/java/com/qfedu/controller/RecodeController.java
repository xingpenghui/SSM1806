package com.qfedu.controller;

import com.qfedu.domain.Recode;
import com.qfedu.service.RecodeService;
import com.qfedu.vo.PageVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *@Author feri
 *@Date Created in 2019/2/19 10:35
 */
//@Controller
@RestController //作用等于：@Controller+ @ResponseBody
public class RecodeController {
    @Autowired
    private RecodeService recodeService;

    @PostMapping("recodesave.do")
    public ResultVo save( Recode recode){

        return recodeService.save(recode);
    }
    @GetMapping("recodedetail.do")
    public ResultVo queryById(int id){
        return recodeService.queryById(id);
    }
    @GetMapping("recodelike.do")
    public ResultVo queryByLike(String msg){
        return recodeService.queryLike(msg);
    }
    @GetMapping("recodepage.do")
    public PageVo<Recode> page(int page, int limit){
        return recodeService.queryPage(page,limit);
    }
    @GetMapping("recodepagelike.do")
    public PageVo<Recode> page2(@RequestParam(defaultValue = "") String msg,int page, int limit){
        return recodeService.queryPage2(msg,page,limit);
    }
}
