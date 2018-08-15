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
public class SkuRelationResp implements Serializable {
    private static final long serialVersionUID = 7079184512717370474L;
    /**
     * skuId
     */
    private Integer skuId;

    /**
     * sku规格id
     */
    private String skuIdInfo;

    /**
     * sku规格名称
     */
    private String skuValue;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 启用禁用状态
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
     * 默认区域启用的sku最低的计算售价
     */
    private BigDecimal shopPriceReal;

    /**
     * 默认区域启用的sku最低的真实售价
     */
    private BigDecimal shopPrice;

    /**
     * 供方skuId
     */
    private String suppSkuId;

    /**
     * 供方条码
     */
    private String suppSkuBarcode;

    /**
     * sku层级
     */
    private Byte level;

    /**
     * 国际尺码sku规格值
     */
    private String countrySkuValue;

    /**
     * 关联图片id
     */
    private Integer imageId;

    /**
     * 关联图片url
     */
    private String imageUrl;

    /**
     * sku重量
     */
    private BigDecimal skuWeight;

    /**
     * sku长度
     */
    private BigDecimal skuLength;

    /**
     * sku宽度
     */
    private BigDecimal skuWidth;

    /**
     * sku高度
     */
    private BigDecimal skuHeight;

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuIdInfo() {
        return skuIdInfo;
    }

    public void setSkuIdInfo(String skuIdInfo) {
        this.skuIdInfo = skuIdInfo;
    }

    public String getSkuValue() {
        return skuValue;
    }

    public void setSkuValue(String skuValue) {
        this.skuValue = skuValue;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public BigDecimal getShopPriceReal() {
        return shopPriceReal;
    }

    public void setShopPriceReal(BigDecimal shopPriceReal) {
        this.shopPriceReal = shopPriceReal;
    }

    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getSuppSkuId() {
        return suppSkuId;
    }

    public void setSuppSkuId(String suppSkuId) {
        this.suppSkuId = suppSkuId;
    }

    public String getSuppSkuBarcode() {
        return suppSkuBarcode;
    }

    public void setSuppSkuBarcode(String suppSkuBarcode) {
        this.suppSkuBarcode = suppSkuBarcode;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getCountrySkuValue() {
        return countrySkuValue;
    }

    public void setCountrySkuValue(String countrySkuValue) {
        this.countrySkuValue = countrySkuValue;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getSkuWeight() {
        return skuWeight;
    }

    public void setSkuWeight(BigDecimal skuWeight) {
        this.skuWeight = skuWeight;
    }

    public BigDecimal getSkuLength() {
        return skuLength;
    }

    public void setSkuLength(BigDecimal skuLength) {
        this.skuLength = skuLength;
    }

    public BigDecimal getSkuWidth() {
        return skuWidth;
    }

    public void setSkuWidth(BigDecimal skuWidth) {
        this.skuWidth = skuWidth;
    }

    public BigDecimal getSkuHeight() {
        return skuHeight;
    }

    public void setSkuHeight(BigDecimal skuHeight) {
        this.skuHeight = skuHeight;
    }

    @Override
    public String toString() {
        return "SkuRelationResp{" +
                "skuId=" + skuId +
                ", skuIdInfo='" + skuIdInfo + '\'' +
                ", skuValue='" + skuValue + '\'' +
                ", goodsId=" + goodsId +
                ", status=" + status +
                ", currency='" + currency + '\'' +
                ", rate=" + rate +
                ", originalInPrice=" + originalInPrice +
                ", inPrice=" + inPrice +
                ", shopPriceReal=" + shopPriceReal +
                ", shopPrice=" + shopPrice +
                ", suppSkuId='" + suppSkuId + '\'' +
                ", suppSkuBarcode='" + suppSkuBarcode + '\'' +
                ", level=" + level +
                ", countrySkuValue='" + countrySkuValue + '\'' +
                ", imageId=" + imageId +
                ", imageUrl='" + imageUrl + '\'' +
                ", skuWeight=" + skuWeight +
                ", skuLength=" + skuLength +
                ", skuWidth=" + skuWidth +
                ", skuHeight=" + skuHeight +
                '}';
    }
}
