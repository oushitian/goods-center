/**
 * jollycorp.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.jolly.goodscenter.facade.service;

import com.jolly.betc.rpc.base.RpcResp;
import com.jolly.goodscenter.facade.resp.SkuPriceResp;
import com.jolly.goodscenter.facade.resp.SkuRelationResp;

/**
 * sku相关接口
 *
 * @author jiadao
 * @since 2018-04-10
 */
public interface SkuFacadeService {
    /**
     * 单个查询sku基础信息
     *
     * @param skuId skuId
     * @return SkuRelationResp
     */
    RpcResp<SkuRelationResp> getSkuRelationInfo(Integer skuId);

    /**
     * 查询sku区域价格信息
     *
     * @param skuId 获取sku价格信息
     * @return SkuPriceResp
     */
    RpcResp<SkuPriceResp> getSkuPriceInfo(Integer skuId);
}
