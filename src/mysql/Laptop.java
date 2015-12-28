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
    
    public Laptop(int city, int quantity, String modelNumber) {
      super(quantity, city, modelNumber,DBConstants.LAPTOP);
    }
    
    public Laptop(String modelNo, String brand , float price, String screenSize, String processor, int quantity, int city) {
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
    
    public void setProcessor(String processor)
    {
        this.processor = processor;
    }
}
