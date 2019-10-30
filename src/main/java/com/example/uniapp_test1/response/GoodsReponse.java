package com.example.uniapp_test1.response;

import com.example.uniapp_test1.bo.GoodsImgBo;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/10/30 13:02
 * @Description: 沈泽鹏写点注释吧
 */
@Data
public class GoodsReponse {
    private Long id;

    private String goodsName;

    private Double goodsPrice;
    /**
     * 商品大图
     */
    private String goodsImg;

    private Integer goodsNumbers;

    private Integer goodsExist;

    private String goodsIntroduce;

    private Date createTime;

    private Date updateTime;

    private List<GoodsImgBo> goodsImgBoList;
}
