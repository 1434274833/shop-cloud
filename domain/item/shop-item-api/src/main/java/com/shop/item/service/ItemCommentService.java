package com.shop.item.service;

import com.shop.item.pojo.vo.CountsVO;
import com.shop.pojo.PagedGridResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("item-comments-api")
public interface ItemCommentService {

    @GetMapping("getCommentLevel")
    CountsVO getCommentLevel(@RequestParam("itemId") String itemId);

    @GetMapping("getCommentsPage")
    PagedGridResult getCommentsPage(@RequestParam("itemId") String itemId
            ,@RequestParam("level")Integer level
            ,@RequestParam("page")Integer page
            ,@RequestParam("pageSize")Integer pageSize);

}
