package com.shop.item.controller;


import com.shop.controller.BaseController;
import com.shop.enums.HttpStatus;
import com.shop.item.pojo.vo.CountsVO;
import com.shop.item.pojo.vo.ItemInfoVo;
import com.shop.item.pojo.vo.TmpNewItemVo;
import com.shop.item.service.ItemCommentService;
import com.shop.item.service.ItemService;
import com.shop.pojo.PagedGridResult;
import com.shop.pojo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "商品")
@RequestMapping("items")
@RestController
public class ItemController extends BaseController {

    @Autowired
    ItemService itemService;
    @Autowired
    ItemCommentService commentService;

    @ApiOperation(value = "商品详情", notes = "商品详情", httpMethod = "GET")
    @GetMapping("info/{itemId}")
    public ResultJson info(@PathVariable("itemId") String itemId) {
        ItemInfoVo info = itemService.getItemInfo(itemId);
        return ResultJson.build().ok(HttpStatus.SUCCESS, info);
    }

    @ApiOperation(value = "当前商品评论统计数据", notes = "当前商品评论统计数据", httpMethod = "GET")
    @GetMapping("commentLevel")
    public ResultJson commentLevel(@RequestParam("itemId") String itemId) {
        CountsVO countsVO = commentService.getCommentLevel(itemId);
        return ResultJson.build().ok(HttpStatus.SUCCESS, countsVO);
    }

    @ApiOperation(value = "当前商品评论列表", notes = "当前商品评论列表", httpMethod = "GET")
    @GetMapping("comments")
    public ResultJson comments(@RequestParam("itemId") String itemId,
                               @RequestParam(value = "level", required = false) Integer level,
                               @RequestParam("page") Integer page,
                               @RequestParam("pageSize") Integer pageSize
    ) {
        PagedGridResult result = commentService.getCommentsPage(itemId, level, page, pageSize);
        return ResultJson.build().ok(HttpStatus.SUCCESS, result);
    }

//    @ApiOperation(value = "搜索商品", notes = "搜索商品", httpMethod = "GET")
//    @GetMapping("search")
//    public ResultJson search(@RequestParam("keywords") String keywords,
//                             @RequestParam(value = "sort") String sort,
//                             @RequestParam("page") Integer page,
//                             @RequestParam("pageSize") Integer pageSize
//    ) {
//
//        if (null == pageSize) {
//            pageSize = PAGESIZE;
//        }
//        PagedGridResult result = itemService.searchItems(keywords, page, pageSize, sort);
//        return ResultJson.build().ok(HttpStatus.SUCCESS, result);
//    }

    @ApiOperation(value = "根据三级分类搜索商品", notes = "根据三级分类搜索商品", httpMethod = "GET")
    @GetMapping("catItems")
    public ResultJson catItems(@RequestParam("catId") Integer catId,
                             @RequestParam(value = "sort") String sort,
                             @RequestParam("page") Integer page,
                             @RequestParam("pageSize") Integer pageSize
    ) {

        if (null == pageSize) {
            pageSize = PAGESIZE;
        }
        PagedGridResult result = itemService.searchItemsByThreeCat(catId, page, pageSize, sort);
        return ResultJson.build().ok(HttpStatus.SUCCESS, result);
    }

    @ApiOperation(value = "查询不同规格商品集", notes = "查询不同规格商品集", httpMethod = "GET")
    @GetMapping("refresh")
    public ResultJson refresh(@RequestParam List<String> itemSpecIds) {

    List<TmpNewItemVo> list=itemService.getItemSpecList(itemSpecIds);
        return ResultJson.build().ok(HttpStatus.SUCCESS, list);
    }
}
