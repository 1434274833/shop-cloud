package com.shop.mapper;

import com.shop.item.pojo.vo.SearchItemVo;
import com.shop.item.pojo.vo.TmpNewItemVo;
import com.shop.my.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ItemsMapperCustom extends MyMapper<SearchItemVo> {

    public List<SearchItemVo> searchItems(@Param("paramsMap") Map<String, Object> paramsMap);

    public List<SearchItemVo> searchItemsByThreeCat(@Param("paramsMap") Map<String, Object> paramsMap);

    public List<TmpNewItemVo> getItemSpecList(@Param("specIds") List<String> specIds);

    public int decreaseItemStock(@Param("paramMap") Map<String, Object> paramMap);
}