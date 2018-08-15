/**
 * jollycorp.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.jolly.goodscenter.facade.resp;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author jiadao
 * @since 2018-04-10
 */
public class SkuPriceResp implements Serializable {

    private static final long serialVersionUID = -5526578232065744746L;
    /**
     * skuId
     */
    private Integer skuId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * sku启禁用状态
     */
    private Byte status;

    /**
     * 原币成本价币种
     */
    private String currency;

    /**
     * 原币转本币汇率
     */
    private BigDecimal rate;

    /**
     * 原币价格
     */
    private BigDecimal originalInPrice;

    /**
     * 本币价格
     */
    private BigDecimal inPrice;

    /**
     * 区域sku的价格
     */
    private List<SkuSellPriceResp> skuSellPriceRespList;


    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getOriginalInPrice() {
        return originalInPrice;
    }

    public void setOriginalInPrice(BigDecimal originalInPrice) {
        this.originalInPrice = originalInPrice;
    }

    public BigDecimal getInPrice() {
        return inPrice;
    }

    public void setInPrice(BigDecimal inPrice) {
        this.inPrice = inPrice;
    }

    public List<SkuSellPriceResp> getSkuSellPriceRespList() {
        return skuSellPriceRespList;
    }

    public void setSkuSellPriceRespList(List<SkuSellPriceResp> skuSellPriceRespList) {
        this.skuSellPriceRespList = skuSellPriceRespList;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "SkuPriceResp{" +
                "skuId=" + skuId +
                ", goodsId=" + goodsId +
                ", status=" + status +
                ", currency='" + currency + '\'' +
                ", rate=" + rate +
                ", originalInPrice=" + originalInPrice +
                ", inPrice=" + inPrice +
                ", skuSellPriceRespList=" + skuSellPriceRespList +
                '}';
    }
}
