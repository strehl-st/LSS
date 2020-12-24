package cn.edu.zjut.po;

public class Retailer {
    private int retailer_id;
    private int user_id;
    private  String retailername;
    private String retailertel;

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getRetailer_id() {
        return retailer_id;
    }

    public String getRetailername() {
        return retailername;
    }

    public String getRetailertel() {
        return retailertel;
    }

    public void setRetailer_id(int retailer_id) {
        this.retailer_id = retailer_id;
    }

    public void setRetailername(String retailername) {
        this.retailername = retailername;
    }

    public void setRetailertel(String retailertel) {
        this.retailertel = retailertel;
    }
}
