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
    
    private String brand;
    private float price;
    private String screenSize;
    private String processor;
    
    public Laptop() {
        
    }
    
    public Laptop(String city, int quantity, String modelNumber) {
      super(quantity, city, modelNumber,DBConstants.LAPTOP);
    }
    
    public Laptop(String modelNo, String brand , float price, String screenSize, String processor, int quantity, String city) {
        super(quantity, city, modelNo,DBConstants.LAPTOP);
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.processor=processor;
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
}
