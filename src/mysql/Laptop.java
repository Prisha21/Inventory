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
public class Laptop extends Item{
    
    private String modelNo;
    private String brand;
    private float price;
    private String screenSize;
    private String processor;
    private int quantity;
    private String city;
    
    public Laptop(String modelNo, String brand , float price, String screenSize, String processor, int quantity, String city) {
        
        this.modelNo = modelNo;
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.processor=processor;
        this.quantity=quantity;
        this.city=city;
    }

    public Laptop() {
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
    
    public String getProcessor()
    {
        return processor;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getQuantity()
    {
        return modelNo;
    }
    
    public void setModelNo()
    {
        this.modelNo = modelNo;
    }
    
    public void setBrand()
    {
        this.brand = brand;
    }
    
    public void setPrice()
    {
        this.price = price;
    }
    
    public void setScreenSize()
    {
        this.screenSize = screenSize;
    }
    
    public void setProcessor()
    {
        this.processor = processor;
    }
    
    public void setCity()
    {
        this.city = city;
    }
    
    public void setQuantity()
    {
        this.quantity = quantity;
    }
}
