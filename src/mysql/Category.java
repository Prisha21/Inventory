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
public class Category {

    private String category;

    public Category(String category) {
        this.category=category;
      }

    public String getCategoryName() {
        return category;
    }

    public void setCategoryName() {
        this.category = category;
    }

}
