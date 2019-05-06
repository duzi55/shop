package com.gzq.dto;

import com.gzq.po.ShopRecord;
import lombok.Data;

import java.util.List;

@Data
public class ShopOderDto {
    private long shopOrderId;
    private long shopOrderCode;
    private int shopOrderRemarks;
    private String shopOrderUser;
    private int shopOrderTotalprice;
    private int shopOrderStatus;
    private String shopOrderName;
    private String shopOrderCompanyid;
    private List<ShopRecord> shopRecordList;
    private String shopOrderUserCard;

}
