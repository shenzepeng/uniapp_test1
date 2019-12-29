package com.example.uniapp_test1.service.impl;

import com.example.uniapp_test1.bo.GoodsImgBo;
import com.example.uniapp_test1.dao.GoodsDao;
import com.example.uniapp_test1.mapper.GoodsMapper;
import com.example.uniapp_test1.pojo.Goods;
import com.example.uniapp_test1.request.AddGoodsRequest;
import com.example.uniapp_test1.request.GoodsRequest;
import com.example.uniapp_test1.response.GoodSearchResponse;
import com.example.uniapp_test1.service.GoodsService;
import com.example.uniapp_test1.utils.JsonUtils;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: szp
 * @Date: 2019/10/30 10:37
 * @Description: 沈泽鹏写点注释吧
 */
@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public GoodSearchResponse searchGoods(String goodsName, Integer size, Integer page) {
        if (StringUtils.isEmpty(goodsName)){
             return getGoodSearchResponse( goodsDao.findGoodsNameLike(goodsName, page, size));
        }
        else {
            return getGoodSearchResponse(goodsDao.findAllGoods(page, size));
        }
    }

    @Override
    public List<Goods> findAllGoods(Integer size,Integer page) {
        List<Goods> list = goodsDao.findAllGoods(size, page).getList();
        return list;
    }

    @Override
    public Goods findGoodById(Long id) {
        return goodsDao.findGoodsById(id);
    }

    @Override
    public Integer insertGoods(AddGoodsRequest goodsRequest) {
        Goods goods=new Goods();
        BeanUtils.copyProperties(goodsRequest,goods);
        List<String> goodsImgBoList = goodsRequest.getGoodsImgBoList();
        if (!CollectionUtils.isEmpty(goodsImgBoList)){
            HashMap<String,String> hashMap=new HashMap<>();
            for (String s : goodsImgBoList) {
                String uuid= UUID.randomUUID().toString();
                hashMap.put(uuid,s);
            }
            goods.setGoodsImgs( JsonUtils.objectToJson(hashMap));
        }
        goods.setUpdateTime(new Date());
        goods.setCreateTime(new Date());
        log.info("添加商品-{}",goods);
        return goodsDao.insertGoods(goods);
    }

    @Override
    public Integer updateGoodsById(GoodsRequest goodsRequest) {
        Goods goods=new Goods();
        BeanUtils.copyProperties(goodsRequest,goods);
        List<GoodsImgBo> goodsImgBoList = goodsRequest.getGoodsImgBoList();
        if (!CollectionUtils.isEmpty(goodsImgBoList)){
            for (GoodsImgBo goodsImgBo : goodsImgBoList) {
               if (StringUtils.isEmpty(goodsImgBo.getImgUUID())){
                   String uuid= UUID.randomUUID().toString();
                   goodsImgBo.setImgUUID(uuid);
               }
            }
            goods.setGoodsImgs( JsonUtils.objectToJson(goodsImgBoList));
        }
        return goodsDao.updateGoodsById(goods);
    }

    @Override
    public Integer deleteGoodsById(Long id) {
        return goodsDao.deleteGoodsById(id);
    }

    public GoodSearchResponse getGoodSearchResponse(PageInfo<Goods> goodsPageInfo){
        GoodSearchResponse goodSearchResponse=new GoodSearchResponse();
        goodSearchResponse.setGoodsList(goodsPageInfo.getList());
        goodSearchResponse.setTotal(goodsPageInfo.getTotal());
        return goodSearchResponse;
    }
}
