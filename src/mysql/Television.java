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
public class Television extends Item{

    private String brand;
    private float price;
    private String screenSize;
    private int screenResolutionHeight;
    private int screenResolutionWidth;

    public Television(String modelNo, String brand, float price, String screenSize, int screenResolutionHeight, int screenResolutionWidth, int quantity, int city) {
        
        super(quantity, city, modelNo, DBConstants.TELEVISION);
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.screenResolutionHeight = screenResolutionHeight;
        this.screenResolutionWidth = screenResolutionWidth;
    }

    public Television() {
    }
    
    public Television(int quantity, int city, String modelNo) {
        super(quantity, city, modelNo,DBConstants.TELEVISION);
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
        return screenResolutionHeight;
    }

    public int getScreenResolutionWidth() {
        return screenResolutionWidth;
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
}
