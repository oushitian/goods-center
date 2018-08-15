package com.jolly.goodscenter.biz;

import com.jolly.betc.rpc.base.RpcResp;
import com.jolly.goodscenter.facade.resp.SkuPriceResp;
import com.jolly.goodscenter.facade.resp.SkuRelationResp;
import com.jolly.goodscenter.facade.service.SkuFacadeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author chenjc
 * @since 2018-06-05
 */
@Component
public class SkuFacadeServiceImpl implements SkuFacadeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SkuFacadeServiceImpl.class);

    @Override
    public RpcResp<SkuRelationResp> getSkuRelationInfo(Integer skuId) {
        SkuRelationResp skuRelationResp = new SkuRelationResp();
        skuRelationResp.setGoodsId(1);
        skuRelationResp.setSuppSkuId("ABCDEFG");
        RpcResp<SkuRelationResp> resp = new RpcResp<>();
        resp.setResult(skuRelationResp);
        LOGGER.info("调用成功");
        return resp;
    }

    @Override
    public RpcResp<SkuPriceResp> getSkuPriceInfo(Integer skuId) {
        return null;
    }
}
