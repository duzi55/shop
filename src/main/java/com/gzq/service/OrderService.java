package com.gzq.service;

import com.gzq.dto.ShopOderDto;
import com.gzq.vo.ResultVo;

public interface OrderService {
    public ResultVo savaOrder(ShopOderDto shopOderDto);

}
