package com.gzq.dao;

import com.gzq.po.ShopOrder;
import org.springframework.data.repository.CrudRepository;

public interface ShopOrderDao extends CrudRepository<ShopOrder,Long> {
}
