//package com.example.uniapp_test1;
//
//import com.example.uniapp_test1.mapper.GoodsMapper;
//import com.example.uniapp_test1.mapper.UserMapper;
//import com.example.uniapp_test1.pojo.GoodsExample;
//import com.example.uniapp_test1.pojo.UserExample;
//import lombok.extern.slf4j.Slf4j;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
////@Slf4j
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public  class UniappTest1ApplicationTests {
//    @Autowired
//    private UserMapper userMapper;
//    @Autowired
//    private GoodsMapper goodsMapper;
//    @Test
//    public void contextLoads() {
//      UserExample userExample=new UserExample();
//      userExample.createCriteria()
//              .andIdIsNotNull();
//      userMapper.deleteByExample(userExample);
//      GoodsExample goodsExample=new GoodsExample();
//      goodsExample.createCriteria()
//              .andIdIsNotNull();
//      goodsMapper.deleteByExample(goodsExample);
//    }
//
//}
