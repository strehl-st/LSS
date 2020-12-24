package cn.edu.zjut.po;

public class Order {
    private int order_id;
    private int commodity_id;
    private int supplier_id;
    private int retailer_id;
    private int order_number;
    private double order_price;
    private String buyer;

    public int getOrder_id() {
        return order_id;
    }

    public int getCommodity_id() {
        return commodity_id;
    }

    public int getOrder_number() {
        return order_number;
    }

    public int getRetailer_id() {
        return retailer_id;
    }

    public String getBuyer() {
        return buyer;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public double getOrder_price() {
        return order_price;
    }

    public void setCommodity_id(int commodity_id) {
        this.commodity_id = commodity_id;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setOrder_price(double order_price) {
        this.order_price = order_price;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public void setRetailer_id(int retailer_id) {
        this.retailer_id = retailer_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }
}
