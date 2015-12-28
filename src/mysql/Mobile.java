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
public class Mobile extends Item{
    private String brand;
    private float price;
    private String screenSize;
    private float frontCamera;
    private float rearCamera;
    private String operatingSystem;
    private float ram;
    
    public Mobile(String modelNo, String brand , float price, String screenSize, float frontCamera, float rearCamera, String operatingSystem, float ram, int quantity, int city) {
        super(quantity, city, modelNo,DBConstants.MOBILE);
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.frontCamera=frontCamera;
        this.rearCamera=rearCamera;
        this.operatingSystem=operatingSystem;
        this.ram=ram;
    }

    public Mobile(int quantity, int city, String modelNo) {
        super(quantity, city, modelNo,DBConstants.MOBILE);
    }
    
    public Mobile() {
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
    
    public float getFrontCamera()
    {
        return frontCamera;
    }
    
    public float getRearCamera()
    {
        return rearCamera;
    }
    
    public String getOperatingSystem()
    {
        return operatingSystem;
    }
    
    public float getRam()
    {
        return ram;
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
    
    public void setFrontCamera(float frontCamera)
    {
        this.frontCamera = frontCamera;
    }
    
    public void setRearCamera(float rearCamera)
    {
        this.rearCamera = rearCamera;
    }
    
    public void setOperatingSystem(String operatingSystem)
    {
        this.operatingSystem = operatingSystem;
    }
    
    public void setRam(float ram)
    {
        this.ram = ram;
    }
}
