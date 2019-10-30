package com.example.uniapp_test1;

import com.example.uniapp_test1.bo.GoodsImgBo;
import com.example.uniapp_test1.pojo.Goods;
import com.example.uniapp_test1.request.GoodsRequest;
import com.example.uniapp_test1.service.GoodsService;
import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public  class UniappTest1ApplicationTests {
    @Autowired
    private GoodsService goodsService;
    @Test
    public void contextLoads() {
        String imgUrl="http://kxg-neituibao-jianli.oss-cn-beijing.aliyuncs.com/data/1572412645265.png?Expires=1887772641&OSSAccessKeyId=LTAIfo7xBETxaY0m&Signature=aDOV9wcTbXGZ1CnAzHhnC9EnOk4%3D";
        for (int i=0;i<100;i++){
            GoodsRequest goodsRequest=new GoodsRequest();
            goodsRequest.setCreateTime(new Date());
            goodsRequest.setUpdateTime(new Date());
            goodsRequest.setGoodsExist((int)(Math.random()*1000));
            goodsRequest.setGoodsNumbers((int)(Math.random()*1000));
            goodsRequest.setGoodsIntroduce(UUID.randomUUID().toString());
            goodsRequest.setGoodsName(UUID.randomUUID().toString());
            goodsRequest.setGoodsPrice((double)(Math.random()*1000));
            List<GoodsImgBo> goodsImgBos=new ArrayList<>();
            for (int j=0;j<(int)(Math.random()*10);j++) {
                GoodsImgBo goodsImgBo = new GoodsImgBo();
                goodsImgBo.setImgUrl(imgUrl);
                goodsImgBo.setImgUUID(UUID.randomUUID().toString());
                goodsImgBos.add(goodsImgBo);
            }
            goodsRequest.setGoodsImgBoList(goodsImgBos);
            goodsRequest.setGoodsImg(imgUrl);
            goodsService.insertGoods(goodsRequest);
        }
    }

}
