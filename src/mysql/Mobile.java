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
    private String modelNo;
    private String brand;
    private float price;
    private String screenSize;
    private float frontCamera;
    private float rearCamera;
    private String operatingSystem;
    private float ram;
    private int quantity;
    private int city;
    
    public Mobile(String modelNo, String brand , float price, String screenSize, float frontCamera, float rearCamera, String operatingSystem, float ram, int quantity, int city) {
        
        this.modelNo = modelNo;
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
        this.frontCamera=frontCamera;
        this.rearCamera=rearCamera;
        this.operatingSystem=operatingSystem;
        this.ram=ram;
        this.quantity=quantity;
        this.city=city;
    }

    public Mobile() {
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
    
    public void setCity(int city)
    {
        this.city = city;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    
}
