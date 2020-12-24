package cn.edu.zjut.po;

public class Commodity {
    private int commodity_id;
    private String commodity_name;
    private double commodity_price;
    private int supplier_id;
    private int commodity_inventory;
    private String commodity_information;

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public void setCommodity_id(int commodity_id) {
        this.commodity_id = commodity_id;
    }

    public int getCommodity_id() {
        return commodity_id;
    }

    public double getCommodity_price() {
        return commodity_price;
    }

    public int getCommodity_inventory() {
        return commodity_inventory;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public String getCommodity_information() {
        return commodity_information;
    }

    public void setCommodity_information(String commodity_information) {
        this.commodity_information = commodity_information;
    }

    public void setCommodity_inventory(int commodity_inventory) {
        this.commodity_inventory = commodity_inventory;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public void setCommodity_price(double commodity_price) {
        this.commodity_price = commodity_price;
    }
}
