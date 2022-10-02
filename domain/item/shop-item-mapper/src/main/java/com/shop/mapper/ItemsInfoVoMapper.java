package com.shop.mapper;

import com.shop.item.pojo.vo.ItemInfoVo;
import com.shop.my.mapper.MyMapper;

public interface ItemsInfoVoMapper extends MyMapper<ItemInfoVo> {

    ItemInfoVo getItemInfo(String itemId);
}