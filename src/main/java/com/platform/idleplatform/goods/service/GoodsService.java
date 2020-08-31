package com.platform.idleplatform.goods.service;

import com.platform.idleplatform.goods.dao.GoodsDao;
import com.platform.idleplatform.goods.entity.GoodsInfo;
import com.platform.idleplatform.goods.entity.ImgList;
import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.tool.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsService {
    @Resource
    GoodsDao goodsDao;

    public AppResponse getGoodsList(){
        List<GoodsInfo> goodsList = goodsDao.getGoodsList();
        return AppResponse.success("查询成功",goodsList);
    }
/**
 * 发布商品
 */
    public AppResponse addGoods(GoodsInfo goodsInfo){
        goodsInfo.setGoodsId(StringUtil.getCommonCode(2));
        goodsDao.addGoods(goodsInfo);
        goodsInfo.url.remove(goodsInfo.url.size()-1);
        goodsDao.addImage(goodsInfo.url,goodsInfo.goodsId);
        return AppResponse.success("新增成功");
    }

    public AppResponse getImgList(String goodsId){
        List<ImgList> imgLists = goodsDao.getImgList(goodsId);
        return AppResponse.success("查询成功",imgLists);
    }
}
