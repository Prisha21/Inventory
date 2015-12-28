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
    private String brand;
    private float price;
    private String screenSize;
    private String operatingSystem;
    
    public Tablets(String modelNo, String brand , float price, String screenSize, String operatingSystem, int quantity, int city) {
        
        super(quantity, city, modelNo, DBConstants.TABLET);
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.operatingSystem=operatingSystem;
    }

    public Tablets(int quantity, int city, String modelNo) {
        super(quantity, city, modelNo,DBConstants.TABLET);
    }
     
    public Tablets() {
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
}
