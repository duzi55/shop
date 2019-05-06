package com.gzq.controller;

import com.gzq.dao.ShopOrderDao;
import com.gzq.dao.ShopRecordDao;
import com.gzq.dto.ShopOderDto;
import com.gzq.po.ShopOrder;
import com.gzq.po.ShopRecord;
import com.gzq.service.OrderService;
import com.gzq.vo.BodyVo;
import com.gzq.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    @Resource
    OrderService orderService;

    @RequestMapping("test1")
    public ResultVo<BodyVo> test1(@RequestBody ShopOderDto shopOderDto){
        log.warn(shopOderDto.getShopOrderName());
        return orderService.savaOrder(shopOderDto);
    }
    @RequestMapping("test2")
    public String test2(){
        log.warn("heol1");
        return ("holle");
    }
}
