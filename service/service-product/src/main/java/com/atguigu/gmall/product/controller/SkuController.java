package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.model.product.BaseAttrInfo;
import com.atguigu.gmall.model.product.SpuImage;
import com.atguigu.gmall.model.product.SpuSaleAttr;
import com.atguigu.gmall.product.service.SkuInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "商品SKU接口")
@RestController
@RequestMapping("admin/product")
@CrossOrigin
public class SkuController {

    @Autowired
    private SkuInfoService skuInfoService;

    /**
     * 根据spuId 查询spuImageList
     * @param spuId
     * @return
     */
    @GetMapping("spuImageList/{spuId}")
    public Result<List<SpuImage>> getSpuImageList(@PathVariable("spuId") Long spuId) {
        List<SpuImage> spuImageList = skuInfoService.getSpuImageList(spuId);
        return Result.ok(spuImageList);
    }

    /**
     * 根据spuId 查询销售属性集合
     * @param spuId
     * @return
     */
    @GetMapping("spuSaleAttrList/{spuId}")
    public Result<List<SpuSaleAttr>> getSpuSaleAttrList(@PathVariable("spuId") Long spuId) {
        List<SpuSaleAttr> spuSaleAttrList = skuInfoService.getSpuSaleAttrList(spuId);
        return Result.ok(spuSaleAttrList);
    }

}


