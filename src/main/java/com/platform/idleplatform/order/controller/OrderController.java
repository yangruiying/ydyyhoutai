package com.platform.idleplatform.order.controller;

import com.platform.idleplatform.order.entity.BuyInfo;
import com.platform.idleplatform.order.entity.OrderInfo;
import com.platform.idleplatform.order.service.OrderService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("order")
@CrossOrigin
public class OrderController {
    @Resource
    OrderService orderService;


    @RequestMapping("addOrder")
    AppResponse addOrder(OrderInfo orderInfo){
        return orderService.addOrder(orderInfo);
    }

    @RequestMapping("getBuyList")
    AppResponse getBuyList(String buyer){
        return orderService.getBuyList(buyer);
    }

    @RequestMapping("getSellList")
    AppResponse getSellList(String userId){
        return orderService.getSellList(userId);
    }

    @RequestMapping("getIsOrder")
    AppResponse getIsOrder(BuyInfo buyInfo){
        return orderService.getIsOrder(buyInfo);
    }

    @RequestMapping("getOrderState")
    AppResponse getOrderState(BuyInfo buyInfo){
        return orderService.getOrderState(buyInfo);
    }
}
