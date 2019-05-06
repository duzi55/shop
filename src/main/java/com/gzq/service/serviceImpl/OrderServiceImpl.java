package com.gzq.service.serviceImpl;

import com.gzq.dao.ShopOrderDao;
import com.gzq.dao.ShopRecordDao;
import com.gzq.dto.ShopOderDto;
import com.gzq.enums.CodeEnum;
import com.gzq.enums.OrderStatusEnum;
import com.gzq.po.ShopOrder;
import com.gzq.po.ShopRecord;
import com.gzq.service.OrderService;
import com.gzq.util.KeyUtil;
import com.gzq.vo.BodyVo;
import com.gzq.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    ShopRecordDao shopRecordDao;
    @Resource
    ShopOrderDao shopOrderDao;
    @Override
    public ResultVo<BodyVo> savaOrder(ShopOderDto shopOderDto) {
        ShopOrder shopOrder=new ShopOrder();
        BeanUtils.copyProperties(shopOderDto, shopOrder);
        shopOrderDao.save(shopOrder);
        for(ShopRecord shopRecord:shopOderDto.getShopRecordList()){
            shopRecordDao.save(shopRecord);
        }
        shopOderDto.setShopOrderId(Long.parseLong(KeyUtil.genUniqueKey()));
        BodyVo bodyVo=new BodyVo();
        bodyVo.setShopOrderId(shopOderDto.getShopOrderId());
        ResultVo<BodyVo> resultVo=new ResultVo<>();
        resultVo.setSuccess("true");
        resultVo.setErrorCode(OrderStatusEnum.SUCCESS.getCode());
        resultVo.setMsg(OrderStatusEnum.SUCCESS.getMessage());
        resultVo.setBody(bodyVo);
        return resultVo;
    }

}
