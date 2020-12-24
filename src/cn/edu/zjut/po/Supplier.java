package cn.edu.zjut.po;

public class Supplier {
    private int supplier_id;
    private int user_id;
    private String suppliername;
    private String supplieraddress;
    private String suppliertel;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public String getSupplieraddress() {
        return supplieraddress;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public String getSuppliertel() {
        return suppliertel;
    }

    public void setSupplieraddress(String supplieraddress) {
        this.supplieraddress = supplieraddress;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public void setSuppliertel(String suppliertel) {
        this.suppliertel = suppliertel;
    }
}
