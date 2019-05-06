package com.gzq.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class ShopOrder {
    @Id
    private long shopOrderId;
    private long shopOrderCode;
    private int shopOrderRemarks;
    private String shopOrderUser;
    private int shopOrderTotalprice;
    private int shopOrderStatus;
    private String shopOrderName;
    private String shopOrderCompanyid;
    private String shopOrderUserCard;

}

