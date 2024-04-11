package com.xnhbapi.demo.Service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xnhbapi.demo.Mapper.MiningpoolMapper;
import com.xnhbapi.demo.Service.MiningpoolService;
import com.xnhbapi.demo.pojo.Miningpool;
import com.xnhbapi.demo.pojo.pageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MiningpoolServiceImpl implements MiningpoolService {
    @Autowired
    private MiningpoolMapper miningpoolMapper;
    @Override
    public ArrayList<Miningpool> getAllList() {
        ArrayList<Miningpool> al = miningpoolMapper.getAllList();
        return al;
    }

    @Override
    public pageBean<Miningpool> getGlqbList(int pageNum,int pageSize,String qbdz,String szl,String jypt) {
        pageBean<Miningpool> l = new pageBean<>();
        PageHelper.startPage(pageNum, pageSize);
        List<Miningpool> ml = miningpoolMapper.getGlqbList(qbdz,szl,jypt);
        Page p = (Page)ml;
        int total = (int)p.getTotal();
        int ps = p.getPageSize();
        int pn = p.getPageNum();
        l.setTotal(total);
        l.setPageNum(pn);
        l.setPageSize(ps);
        l.setList(ml);
        return l;
    }

}
