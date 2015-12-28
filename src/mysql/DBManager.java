/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Prisha
 */
public class DBManager {
    
    private final static Connection conn = ConnectionManager.getConnection();
    
    public static void handleUserSignUp(Admin admin) {
        
        try {
            String sql = "insert into user_table values (?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, admin.getUserName());
            pst.setString(2, admin.getPassword());
            pst.setString(3, admin.getEmailId());
            pst.setString(4, admin.getName());
            pst.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static String getUserPassword(String userName) {
     
        try {
            String pass;
            String sql="Select password from user_table where user_name=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,userName);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()) {
                pass=rs.getString(1);
                return pass;
            }
            
           return null;
           
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    // This will be used in the main function of AddItem code to populatee the list
    public static ArrayList<String> getAllCategories() {
        
        try {
            String sql="Select category_name from category_table";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ArrayList<String> catNames = new ArrayList<>();
            
            while(rs.next()) {
                catNames.add(rs.getString(2));
            }
            
            return catNames;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public static Admin getUserDetails(String userName) {
        // To be used 
        return null;
    }
    
    public static void addCategory(Category category)
    {
        try {
            String sql="insert into category_table values (NULL,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, category.getCategoryName());
            Integer a = pst.executeUpdate();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void addOrder(Order order) {
        
        /*
            Add the order to the DB
            Leave this code for the time being
        */
    }
    
    public static void addLaptop(Laptop laptop)
    {
        
    }
    
    public static void addMobile(Mobile mobile)
    {
        
    }
    
    public static void addTablet(Tablets tablet)
    {
        
    }
    
    public static void addTelevision(Television television)
    {
        
    }
}
