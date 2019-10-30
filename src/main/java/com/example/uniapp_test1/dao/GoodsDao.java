package com.example.uniapp_test1.dao;

import com.example.uniapp_test1.mapper.GoodsMapper;
import com.example.uniapp_test1.pojo.Goods;
import com.example.uniapp_test1.pojo.GoodsExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: szp
 * @Date: 2019/10/29 10:47
 * @Description: 沈泽鹏写点注释吧
 */
@Slf4j
@Repository
public class GoodsDao {
    @Autowired
    private GoodsMapper goodsMapper;
    public Goods findGoodsById(Long id){
       return goodsMapper.selectByPrimaryKey(id);
    }

    public PageInfo<Goods> findGoodsNameLike(String goodsName,Integer page,Integer size){
        GoodsExample goodsExample=new GoodsExample();
        //拿到分页参数
        PageHelper.startPage(page,size);
        goodsExample.createCriteria()
                .andGoodsNameLike("%"+goodsName+"%");
        PageInfo<Goods> pageInfo = new PageInfo<>(goodsMapper.selectByExample(goodsExample));
        return pageInfo;
    }

    public  PageInfo<Goods> findAllGoods(Integer page,Integer size){
        GoodsExample goodsExample=new GoodsExample();
        //拿到分页参数
        PageHelper.startPage(page,size);
        List<Goods> goods = goodsMapper.selectByExample(goodsExample);
        PageInfo<Goods> pageInfo = new PageInfo<>(goods);
        return pageInfo;
    }

    public Integer InsertGoods(Goods goods){
        goods.setId(null);
        return goodsMapper.insert(goods);
    }

    public Integer insertGoodsList(List<Goods> goodsList){
        for (Goods g:goodsList){
            goodsMapper.insert(g);
        }
        return 1;
    }

    public Integer deleteGoodsById(Long id){
        return goodsMapper.deleteByPrimaryKey(id);
    }

    public Integer insertGoods(Goods goods){
        return goodsMapper.insert(goods);
    }

    public Integer updateGoodsById(Goods goods){
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

}
