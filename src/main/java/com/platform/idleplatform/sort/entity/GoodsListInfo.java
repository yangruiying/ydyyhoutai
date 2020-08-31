package com.platform.idleplatform.sort.entity;

public class GoodsListInfo {
    /**
     *商品id
     */
    private String goodsId;
    /**
     *商品名称
     */
    private String title;
    /**
     *图片路径
     */
    private String indexPath;
    /**
     *售价
     */
    private double price;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndexPath() {
        return indexPath;
    }

    public void setIndexPath(String indexPath) {
        this.indexPath = indexPath;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
