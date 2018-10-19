package com.wlt.mall.controller;

import com.wlt.mall.common.BaseResponse;
import com.wlt.mall.pojo.OrderLog;
import com.wlt.mall.pojo.Question;
import com.wlt.mall.serivce.OrderLogService;
import com.wlt.mall.vo.OrderLogVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/order/*")

public class OrderLogController {


    @Autowired
    private OrderLogService orderLogService;

    @RequestMapping(value = "/list" )
    private BaseResponse List() {
        List<OrderLog> list =  orderLogService.getList();
        return new BaseResponse<>(list);
    }


    @RequestMapping(value = "/info" ,method = RequestMethod.GET)
    private BaseResponse Info(@RequestParam(value = "id") Integer id) {
        OrderLogVo orderLogVo = new OrderLogVo();
        OrderLog orderLog = orderLogService.getInfo(id);
        BeanUtils.copyProperties(orderLog, orderLogVo);
        return new BaseResponse<>(orderLogVo);
    }


    @RequestMapping(value = "/update" ,method = RequestMethod.POST)
    private BaseResponse Update(@RequestParam(value = "id") Integer id) {
        Integer res= orderLogService.update(id);
        return new BaseResponse<>(res);
    }


    @RequestMapping(value = "/del" ,method = RequestMethod.POST)
    private BaseResponse del(@RequestParam(value = "id") Integer id) {
        Integer res= orderLogService.del(id);
        return new BaseResponse<>(res);
    }

    @RequestMapping(value = "/qs/info" ,method = RequestMethod.GET)
    private BaseResponse QsInfo(@RequestParam(value = "id") Integer id) {
        OrderLogVo orderLogVo = new OrderLogVo();
        Question orderLog = orderLogService.QsInfo(id);
        return new BaseResponse<>(orderLogVo);
    }






}
