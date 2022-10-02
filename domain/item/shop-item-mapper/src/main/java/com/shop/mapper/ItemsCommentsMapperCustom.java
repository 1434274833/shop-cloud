package com.shop.mapper;

import com.shop.item.pojo.ItemsComments;
import com.shop.item.pojo.vo.CommentRecordVo;
import com.shop.item.pojo.vo.MyCommentsVo;
import com.shop.my.mapper.MyMapper;

import java.util.List;
import java.util.Map;

public interface ItemsCommentsMapperCustom extends MyMapper<ItemsComments> {

    List<Map<String, Object>> getCommentVital(String itemId);

    List<CommentRecordVo> queryItemComments(Map<String, Object> map);

    List<MyCommentsVo> queryMyComments(Map<String, Object> map);

}