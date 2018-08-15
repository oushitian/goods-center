/**
 * jollycorp.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.jolly.goodscenter.facade.resp;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author jiadao
 * @since 2018-04-10
 */
public class SkuSellPriceResp implements Serializable {

    private static final long serialVersionUID = 4777576612069140176L;
    /**
     * 实际售价
     */
    private BigDecimal shopPrice;

    /**
     * 计算售价
     */
    private BigDecimal shopPriceReal;

    /**
     * 促销结束时间
     */
    private Integer promoteStartTime;

    /**
     * 促销开始时间
     */
    private Integer promoteEndTime;

    /**
     * 单品促销价格
     */
    private BigDecimal promotePrice;

    /**
     * 价格区域
     */
    private Integer areaId;

    /**
     * 价格站点
     */
    private Integer siteId;

    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    public BigDecimal getShopPriceReal() {
        return shopPriceReal;
    }

    public void setShopPriceReal(BigDecimal shopPriceReal) {
        this.shopPriceReal = shopPriceReal;
    }

    public Integer getPromoteStartTime() {
        return promoteStartTime;
    }

    public void setPromoteStartTime(Integer promoteStartTime) {
        this.promoteStartTime = promoteStartTime;
    }

    public Integer getPromoteEndTime() {
        return promoteEndTime;
    }

    public void setPromoteEndTime(Integer promoteEndTime) {
        this.promoteEndTime = promoteEndTime;
    }

    public BigDecimal getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(BigDecimal promotePrice) {
        this.promotePrice = promotePrice;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    @Override
    public String toString() {
        return "SkuSellPriceResp{" +
                "shopPrice=" + shopPrice +
                ", shopPriceReal=" + shopPriceReal +
                ", promoteStartTime=" + promoteStartTime +
                ", promoteEndTime=" + promoteEndTime +
                ", promotePrice=" + promotePrice +
                ", areaId=" + areaId +
                ", siteId=" + siteId +
                '}';
    }
}
