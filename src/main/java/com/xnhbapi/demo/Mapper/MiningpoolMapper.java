package com.xnhbapi.demo.Mapper;

import com.xnhbapi.demo.pojo.Miningpool;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface MiningpoolMapper {
    @Select("select * from mining_pool")
    ArrayList<Miningpool> getAllList();
    List<Miningpool> getGlqbList(String qbdz,String szl,String jypt);
}
