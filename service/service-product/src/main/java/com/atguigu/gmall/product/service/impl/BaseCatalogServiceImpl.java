package com.atguigu.gmall.product.service.impl;

import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.model.product.BaseCategory3;
import com.atguigu.gmall.product.mapper.BaseCategory1Mapper;
import com.atguigu.gmall.product.mapper.BaseCategory2Mapper;
import com.atguigu.gmall.product.mapper.BaseCategory3Mapper;
import com.atguigu.gmall.product.service.BaseCatalogService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;


@Service
public class BaseCatalogServiceImpl implements BaseCatalogService {

    @Autowired
    BaseCategory1Mapper baseCategory1Mapper;

    @Autowired
    BaseCategory2Mapper baseCategory2Mapper;

    @Autowired
    BaseCategory3Mapper baseCategory3Mapper;

    @Override
    public List<BaseCategory1> getCategory1() {

        List<BaseCategory1> baseCategory1s = baseCategory1Mapper.selectList(null);

        return baseCategory1s;
    }

    @Override
    public List<BaseCategory2> getCategory2(String category1Id) {

        QueryWrapper wrapper = new QueryWrapper<BaseCategory2>();
        wrapper.eq("category1_id",category1Id);
        List<BaseCategory2> baseCategory2s = baseCategory2Mapper.selectList(wrapper);

        return baseCategory2s;
    }

    @Override
    public List<BaseCategory3> getCategory3(String category2Id) {
        QueryWrapper wrapper = new QueryWrapper<BaseCategory3>();
        wrapper.eq("category2_id",category2Id);
        List<BaseCategory3> baseCategory3s = baseCategory3Mapper.selectList(wrapper);

        return baseCategory3s;
    }
}
