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

    public Order(ArrayList<Item> items) {
        this.items = items;
    }

    public Order() {
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
