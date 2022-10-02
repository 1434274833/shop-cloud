package com.shop.item.service;


import com.shop.item.pojo.ItemsSpec;
import com.shop.item.pojo.vo.CountsVO;
import com.shop.item.pojo.vo.ItemInfoVo;
import com.shop.item.pojo.vo.TmpNewItemVo;
import com.shop.pojo.PagedGridResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("item-api")
public interface ItemService {

    @GetMapping("getItemById")
    ItemInfoVo getItemInfo(@RequestParam("itemId") String itemId);


    //PagedGridResult searchItems(String keywords, Integer page, Integer pageSize, String sort);

    @GetMapping("getItemById")
    PagedGridResult searchItemsByThreeCat(@RequestParam("cateId") Integer catId
            , @RequestParam("page") Integer page
            , @RequestParam("pageSize") Integer pageSize
            , @RequestParam("sort") String sort);


    @GetMapping("getItemSpecList")
    List<TmpNewItemVo> getItemSpecList(List<String> specId);

    /**
     * 根据规格ID查询商品的规格
     * @param specId
     * @return
     */
    @GetMapping("getItemSpecBySpecId")
    ItemsSpec queryItemSpec(@RequestParam("specId") String specId);

    /**
     * 减库存
     * @param itemSpecId
     * @param pendingCounts
     */
    @PostMapping("decreaseItemStock")
    void decreaseItemStock(@RequestParam("itemSpecId") String itemSpecId, @RequestParam("pendingCounts") Integer pendingCounts);

}
