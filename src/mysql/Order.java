/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.util.ArrayList;

/**
 *
 * @author Sachin
 */
public class Order {
    
    private ArrayList<Item> items;
    
    public Order() {
        items = new ArrayList<Item>();
    }
    
    public Order(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public void addItem(Item item) {
        this.items.add(item);
    }
    
    public void stringify() {
        
        System.out.println("Order details are as follows :: ");
        
        for(Item item : this.items) {
            item.stringify();
        }
    }
}
