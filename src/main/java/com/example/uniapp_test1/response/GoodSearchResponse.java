package com.example.uniapp_test1.response;

import com.example.uniapp_test1.pojo.Goods;
import lombok.Data;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/10/30 13:23
 * @Description: 沈泽鹏写点注释吧
 */
@Data
public class GoodSearchResponse {
    private List<Goods> goodsList;
    private Long total;
}
