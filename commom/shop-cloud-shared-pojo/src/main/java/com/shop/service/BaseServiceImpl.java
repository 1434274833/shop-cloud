package com.shop.service;


import com.github.pagehelper.PageInfo;
import com.shop.pojo.PagedGridResult;

import java.util.List;

public class BaseServiceImpl {

    protected PagedGridResult setPageGridResult(List pageList, int page) {
        PageInfo<?> pageInfo = new PageInfo<>(pageList);
        PagedGridResult result = new PagedGridResult();
        result.setPage(page);
        result.setRows(pageList);
        result.setTotal(pageInfo.getPages());
        result.setRecords(pageInfo.getTotal());
        return result;
    }
}
