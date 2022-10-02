package com.shop.item.service.impl;

import com.github.pagehelper.PageHelper;
import com.shop.cons.Constant;
import com.shop.item.pojo.ItemsSpec;
import com.shop.item.pojo.vo.*;
import com.shop.item.service.ItemService;
import com.shop.mapper.ItemsCommentsMapperCustom;
import com.shop.mapper.ItemsInfoVoMapper;
import com.shop.mapper.ItemsMapperCustom;
import com.shop.mapper.ItemsSpecMapper;
import com.shop.pojo.PagedGridResult;
import com.shop.service.BaseServiceImpl;
import com.shop.utils.DesensitizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ItemServiceImpl extends BaseServiceImpl implements ItemService {
    @Autowired
    ItemsInfoVoMapper infoVoMapper;


    @Autowired
    ItemsMapperCustom itemsMapperCustom;
    @Autowired
    ItemsSpecMapper itemsSpecMapper;


    @Override
    public ItemInfoVo getItemInfo(String itemId) {
        return infoVoMapper.getItemInfo(itemId);
    }


//    @Override
//    public PagedGridResult searchItems(String keywords, Integer page, Integer pageSize, String sort) {
//        Map<String, Object> params = new HashMap<>();
//        params.put("keywords", keywords);
//        params.put("sort", sort);
//        PageHelper.startPage(page, pageSize);
//        List<SearchItemVo> list = itemsMapperCustom.searchItems(params);
//        return setPageGridResult(list, page);
//    }

    @Override
    public PagedGridResult searchItemsByThreeCat(Integer catId, Integer page, Integer pageSize, String sort) {
        Map<String, Object> params = new HashMap<>();
        params.put("catId", catId);
        params.put("sort", sort);
        PageHelper.startPage(page, pageSize);
        List<SearchItemVo> list = itemsMapperCustom.searchItems(params);
        return setPageGridResult(list, page);
    }

    @Override
    public List<TmpNewItemVo> getItemSpecList(List<String> specIds) {
        return itemsMapperCustom.getItemSpecList(specIds);
    }

    @Override
    public ItemsSpec queryItemSpec(String specId) {
        return itemsSpecMapper.selectByPrimaryKey(specId);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public void decreaseItemStock(String itemSpecId,Integer pendingCounts) {
        Map<String,Object> paramMap=new HashMap<>();
        paramMap.put("itemSpecId",itemSpecId);
        paramMap.put("pendingCounts",pendingCounts);
        itemsMapperCustom.decreaseItemStock(paramMap);
    }


}
