package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.SpuImage;
import com.atguigu.gmall.model.product.SpuSaleAttr;

import java.util.List;

public interface SkuInfoService {
    List<SpuImage> getSpuImageList(Long spuId);

    List<SpuSaleAttr> getSpuSaleAttrList(Long spuId);
}
