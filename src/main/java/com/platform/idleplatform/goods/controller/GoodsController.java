package com.platform.idleplatform.goods.controller;

import com.platform.idleplatform.goods.entity.GoodsInfo;
import com.platform.idleplatform.goods.entity.OrderInfo;
import com.platform.idleplatform.goods.service.GoodsService;
import com.platform.idleplatform.test.service.TestService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/goods")
@CrossOrigin
public class GoodsController {
    @Resource
    GoodsService goodsService;
    @RequestMapping(value = "getGoodsList")
    AppResponse getGoodsList(){
        return goodsService.getGoodsList();
    }

    @PostMapping("addGoods")
    AppResponse addGoods(GoodsInfo goodsInfo){
        return goodsService.addGoods(goodsInfo);
    }

    @RequestMapping("getImgList")
    AppResponse getImgList(String goodsId){
        return goodsService.getImgList(goodsId);
    }

    @RequestMapping("getGoodsById")
    AppResponse getGoodsById(String userId){
        return goodsService.getGoodsById(userId);
    }

}
