package com.xnhbapi.demo.Controller;

import com.xnhbapi.demo.Service.MiningpoolService;
import com.xnhbapi.demo.pojo.Miningpool;
import com.xnhbapi.demo.pojo.Result;
import com.xnhbapi.demo.pojo.pageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class miningpoolController {
    @Autowired
    private MiningpoolService miningpoolService;
    @GetMapping("/api/testGetAllList")
    public Result<ArrayList<Miningpool>> getAllList(){
        ArrayList<Miningpool> al = miningpoolService.getAllList();
        return Result.success(al);
    };
    @GetMapping("/api/getGlqbList")
    public Result<pageBean<Miningpool>> getGlqbList(@RequestParam(required = false, value = "qbdz") String qbdz,
                              @RequestParam(required = false, value = "szl") String szl,
                              @RequestParam(required = false, value = "jypt") String jypt,
                              @RequestParam(required = true, value = "pageNum") int pageNum,
                              @RequestParam(required = true, value = "pageSize") int pageSize){
        pageBean l = miningpoolService.getGlqbList(pageNum,pageSize,qbdz,szl,jypt);
        return Result.success(l);
    };
}
