package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Orders;
import org.springframework.stereotype.Service;


public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     * @return
     */
    public void submit(Orders orders);
}
