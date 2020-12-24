package cn.edu.zjut.action;
import cn.edu.zjut.po.Order;
import cn.edu.zjut.service.IOrderService;
public class OrderAction {
    private Order order;
    private IOrderService orderService = null;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setOrderService(IOrderService orderService) {
        this.orderService = orderService;
    }

    public String execute() {
        order.setCommodity_id(112);
        order.setOrder_price(2222.2);
        order.setSupplier_id(11);
        order.setRetailer_id(1);
        order.setOrder_number(555);
        orderService.submit(order);
        return "success";
    }
}