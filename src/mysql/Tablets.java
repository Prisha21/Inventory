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
public class Tablets extends Item{
     private String modelNo;
    private String brand;
    private float price;
    private String screenSize;
    private String operatingSystem;
    private int quantity;
    private int city;
    
    public Tablets(String modelNo, String brand , float price, String screenSize, String operatingSystem, int quantity, int city) {
        
        this.modelNo = modelNo;
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.operatingSystem=operatingSystem;
        this.quantity=quantity;
        this.city=city;
    }

    public Tablets() {
    }

    public String getModelNo()
    {
        return modelNo;
    }
    
    public String getBrand()
    {
        return brand;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public String getScreenSize()
    {
        return screenSize;
    }
    
    public String getOperatingSystem()
    {
        return operatingSystem;
    }
    
    public int getCity()
    {
        return city;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setModelNo(String modelNo)
    {
        this.modelNo = modelNo;
    }
    
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    
    public void setPrice(Float price)
    {
        this.price = price;
    }
    
    public void setScreenSize(String screenSize)
    {
        this.screenSize = screenSize;
    }
    
    public void setOperatingSystem(String operatingSystem)
    {
        this.operatingSystem = operatingSystem;
    }
    
    public void setCity(int city)
    {
        this.city = city;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
}
