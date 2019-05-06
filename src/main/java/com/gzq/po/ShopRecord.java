package com.gzq.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ShopRecord {
    @Id
    private long shopRecordSparesId;
    private BigDecimal shopRecordPrice;
    private int shopRecordNumber;
    private String shopRecordUnit;
    private int shopRecordDiscount;
    private int mealId;
    private int shopRecordActualprice;

}
