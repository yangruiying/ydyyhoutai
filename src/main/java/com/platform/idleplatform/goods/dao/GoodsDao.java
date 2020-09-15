package com.platform.idleplatform.goods.dao;

import com.platform.idleplatform.goods.entity.GoodsInfo;
import com.platform.idleplatform.goods.entity.ImgList;
import com.platform.idleplatform.goods.entity.OrderInfo;
import com.platform.idleplatform.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsDao {
    public List<GoodsInfo> getGoodsList();

    public List<GoodsInfo> getAttenGoodsList(String userId);

    public int addGoods(GoodsInfo goodsInfo);

    public int addImage(@Param("url") List<String> url,@Param("goodsId") String goodsId);

    public List<ImgList> getImgList(String goodsId);

    public  List<GoodsInfo> getGoodsById(String userId);

    public int getIsUserGoods(GoodsInfo userInfo);

    public GoodsInfo getGoodsQuery(String goodsId);
}
