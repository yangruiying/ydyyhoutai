package com.platform.idleplatform.order.service;

import com.platform.idleplatform.order.dao.OrderDao;
import com.platform.idleplatform.order.entity.OrderInfo;
import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.tool.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {
    @Resource
    public OrderDao orderDao;

    public AppResponse addOrder(OrderInfo orderInfo){
        orderInfo.setOrderId(StringUtil.getCommonCode(2));
        orderDao.addOrder(orderInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse getBuyList(String buyer){
        List<OrderInfo> orderInfoList = orderDao.getBuyList(buyer);
        return AppResponse.success("查询成功",orderInfoList);
    }

    public AppResponse getSellList(String userId){
        List<OrderInfo> orderInfos = orderDao.getSellList(userId);
        return AppResponse.success("查询成功",orderInfos);
    }
}
