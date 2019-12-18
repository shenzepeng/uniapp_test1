package com.example.uniapp_test1.service;

import com.example.uniapp_test1.pojo.Goods;
import com.example.uniapp_test1.request.GoodsRequest;
import com.example.uniapp_test1.response.GoodSearchResponse;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/10/29 12:24
 * @Description: 沈泽鹏写点注释吧
 */
public interface GoodsService {
    GoodSearchResponse searchGoods(String goodsName, Integer size, Integer page);
    List<Goods> findAllGoods(Integer size,Integer page);
    Goods findGoodById(Long id);
    Integer insertGoods(GoodsRequest goodsRequest);
    Integer updateGoodsById(GoodsRequest goodsRequest);
    Integer deleteGoodsById(Long id);

}
