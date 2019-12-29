package com.example.uniapp_test1.request;

import com.example.uniapp_test1.bo.GoodsImgBo;
import lombok.Data;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/29 00:42
 * @Description: 沈泽鹏写点注释吧
 */
@Data
public class AddGoodsRequest {

    private String goodsName;

    private Double goodsPrice;
    /**
     * 商品大图
     */
    private String goodsImg;

    private Integer goodsNumbers;

    private Integer goodsExist;

    private String goodsIntroduce;

    /**
     * 商品详情多图
     */
    private List<String> goodsImgBoList;
}
