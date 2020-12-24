package cn.edu.zjut.service;

import cn.edu.zjut.dao.IOrderDAO;
import cn.edu.zjut.po.Order;

public class OrderService implements IOrderService {
    private IOrderDAO orderDAO = null;

    public OrderService() {
    }



    public void setOrderDAO(IOrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public void submit(Order order) {
        orderDAO.submit(order);
    }
}
