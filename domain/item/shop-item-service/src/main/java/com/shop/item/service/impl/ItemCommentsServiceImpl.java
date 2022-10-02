package com.shop.item.service.impl;

import com.github.pagehelper.PageHelper;
import com.shop.cons.Constant;
import com.shop.item.pojo.vo.CommentRecordVo;
import com.shop.item.pojo.vo.CountsVO;
import com.shop.item.service.ItemCommentService;
import com.shop.mapper.ItemsCommentsMapperCustom;
import com.shop.pojo.PagedGridResult;
import com.shop.service.BaseServiceImpl;
import com.shop.utils.DesensitizationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ItemCommentsServiceImpl extends BaseServiceImpl implements ItemCommentService {
    @Autowired
    ItemsCommentsMapperCustom itemsCommentsMapperCustom;
    @Override
    public CountsVO getCommentLevel(String itemId) {
        CountsVO countsVO = new CountsVO();
        List<Map<String, Object>> result = itemsCommentsMapperCustom.getCommentVital(itemId);
        int total = 0;
        for (Map<String, Object> map : result) {
            Object level = map.get("commentLevel");
            Object count = map.get("commentCount");

            if (null != level) {
                if (level == Constant.ONE) {
                    countsVO.setGoodCounts(((Long) count).intValue());
                }
                if (level == Constant.TWO) {
                    countsVO.setNormalCounts(((Long) count).intValue());
                }
                if (level == Constant.THREE) {
                    countsVO.setBadCounts(((Long) count).intValue());
                }

                total += ((Long) count).intValue();
            }


        }
        countsVO.setTotalCounts(total);
        return countsVO;
    }

    @Override
    public PagedGridResult getCommentsPage(String itemId, Integer level, Integer index, Integer pageSize) {

        Map<String, Object> map = new HashMap<>();
        map.put("itemId", itemId);
        map.put("level", level);
        PageHelper.startPage(index, pageSize);

        List<CommentRecordVo> list = itemsCommentsMapperCustom.queryItemComments(map);

        if (null != list) {
            list.forEach(item -> {
                item.setNickname(DesensitizationUtil.commonDisplay(item.getNickname()));
            });
        }
        return setPageGridResult(list, index);
    }

}
