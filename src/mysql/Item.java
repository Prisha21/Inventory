/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

/**
 *
 * @author Prisha
 */
public abstract class Item {
    
    protected String category;
    protected int quantity;
    protected int city;
    protected String modelNo;

    public Item() {
    }
    
    public Item(int quantity, int city, String modelNo, String category) {
        this.quantity = quantity;
        this.city = city;
        this.modelNo = modelNo;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    public int getCity() {
        return city;
    }

    public String getModelNo() {
        return modelNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void stringify() {
        System.out.println("Category :: " + this.category + " ModelNo :: " + this.modelNo + " Quantity :: " + this.quantity + 
                " City :: " + this.city);
    }
}
