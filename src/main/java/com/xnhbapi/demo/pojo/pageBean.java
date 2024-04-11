package com.xnhbapi.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class pageBean<T> {
    private int pageSize;
    private int pageNum;
    private int total;
    private List<T> list;
}
