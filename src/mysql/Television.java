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
public class Television extends Item {

    private String modelNo;
    private String brand;
    private float price;
    private String screenSize;
    private int screenResolutionHeight;
    private int screenResolutionWidth;
    private int quantity;
    private int city;

    public Television(String modelNo, String brand, float price, String screenSize, int screenResolutionHeight, int screenResolutionWidth, int quantity, int city) {

        this.modelNo = modelNo;
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.screenResolutionHeight = screenResolutionHeight;
        this.screenResolutionWidth = screenResolutionWidth;
        this.quantity = quantity;
        this.city = city;
    }

    public Television() {
    }

    public String getModelNo() {
        return modelNo;
    }

    public String getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public int getScreenResolutionHeight() {
        return getScreenResolutionHeight();
    }

    public int getScreenResolutionWidth() {
        return screenResolutionWidth;
    }

    public int getCity() {
        return city;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setScreenResolutionHeight(int screenResolutionHeight) {
        this.screenResolutionHeight = screenResolutionHeight;
    }

    public void setScreenResolutionWidth(int screenResolutionWidth) {
        this.screenResolutionWidth = screenResolutionWidth;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
