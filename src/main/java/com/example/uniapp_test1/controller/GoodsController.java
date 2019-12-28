package com.example.uniapp_test1.controller;

import com.example.uniapp_test1.common.SzpJsonResult;
import com.example.uniapp_test1.pojo.Goods;
import com.example.uniapp_test1.request.AddGoodsRequest;
import com.example.uniapp_test1.request.GoodsRequest;
import com.example.uniapp_test1.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: szp
 * @Date: 2019/10/30 09:39
 * @Description: 沈泽鹏写点注释吧
 */
@Api("GoodsController")
@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @ApiOperation("findGoodsById")
    @GetMapping("/{id}")
    public SzpJsonResult<Goods>  findGoodsById(@PathVariable("id") Long id){
        return SzpJsonResult.ok(goodsService.findGoodById(id));
    }
    @ApiOperation("searchGoods")
    @GetMapping("/search")
    public SzpJsonResult<Goods>  searchGoods(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                              @RequestParam(value = "size",defaultValue = "10")Integer size,
                                             @RequestParam(value = "goodsName",defaultValue = "")String goodsName ){
        return SzpJsonResult.ok(goodsService.searchGoods(goodsName,size,page));
    }
    @ApiOperation("add")
    @PostMapping
    public SzpJsonResult<Integer> add(@RequestBody AddGoodsRequest goods){
        return SzpJsonResult.ok(goodsService.insertGoods(goods));
    }
    @ApiOperation("update")
    @PutMapping
    public SzpJsonResult<Integer> update(@RequestBody GoodsRequest goods){
        return SzpJsonResult.ok(goodsService.updateGoodsById(goods));
    }
    @ApiOperation("id")
    @DeleteMapping("/{id}")
    public SzpJsonResult<Integer> detete(@PathVariable("id")Long id){
        return SzpJsonResult.ok(goodsService.deleteGoodsById(id));
    }
    @ApiOperation("findall")
    @GetMapping("find/all")
    public SzpJsonResult<Goods> findAll(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                        @RequestParam(value = "size",defaultValue = "10")Integer size){
        return SzpJsonResult.ok(goodsService.findAllGoods(page,size));
    }
}
