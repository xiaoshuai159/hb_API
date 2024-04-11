package com.xnhbapi.demo.Service;

import com.xnhbapi.demo.pojo.Miningpool;
import com.xnhbapi.demo.pojo.pageBean;

import java.util.ArrayList;
import java.util.List;

public interface MiningpoolService {
    ArrayList<Miningpool> getAllList();
    pageBean<Miningpool> getGlqbList(int pageNum,int pageSize,String qbdz,String szl,String jypt);
}
