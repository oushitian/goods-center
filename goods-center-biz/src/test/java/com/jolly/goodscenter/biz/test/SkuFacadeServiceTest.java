package com.jolly.goodscenter.biz.test;

import com.alibaba.fastjson.JSON;
import com.jolly.betc.rpc.base.RpcResp;
import com.jolly.goodscenter.biz.DemoTest;
import com.jolly.goodscenter.biz.SkuFacadeServiceImpl;
import com.jolly.goodscenter.facade.resp.SkuRelationResp;
import com.jolly.goodscenter.facade.service.SkuFacadeService;
import com.jolly.goodscenter.service.TmpClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author chenjc
 * @since 2018-06-05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/goods-center-biz.xml"})
public class SkuFacadeServiceTest {
    @Resource
    private SkuFacadeService skuFacadeService;

    @Test
    public void getSkuRelationInfo() {
        System.out.println(skuFacadeService);
//        RpcResp<SkuRelationResp> skuRelationInfo = skuFacadeService.getSkuRelationInfo(1);
//        System.out.println(JSON.toJSONString(skuRelationInfo));
    }
}
