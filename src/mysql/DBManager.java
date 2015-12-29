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

    public static void removeCity(String cityName) {
        try {
            String sql = "DELETE FROM city_table WHERE city_name = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, cityName);
            int a = pst.executeUpdate();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public static String getUserPassword(String userName) {

        try {
            String pass;
            String sql = "Select password from user_table where user_name = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                pass = rs.getString(1);
                return pass;
            }

            return null;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public static String getUserPassword() {

        try {
            String pass;
            String sql = "Select password from user_table";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                pass = rs.getString(1);
                return pass;
            }

            return null;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
    
    public static void changePassword(String newPwd)
    {
        try {
            String sql = "UPDATE user_table SET password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, newPwd);
            Integer a = pst.executeUpdate();
            System.out.println(a);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // This will be used in the main function of AddItem code to populate the list
    public static ArrayList<String> getAllCategories() {

        try {
            String sql = "Select category_name from category_table";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ArrayList<String> catNames = new ArrayList<>();

            while (rs.next()) {
                catNames.add(rs.getString(1));
            }

            return catNames;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static ArrayList<String> getAllCities() {

        try {
            String sql = "Select city_name from city_table";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ArrayList<String> cityNames = new ArrayList<>();

            while (rs.next()) {
                cityNames.add(rs.getString(1));
            }

            return cityNames;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public static String getUserName()
    {
        try {
            String pass;
            String sql = "select user_name from user_table";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                pass = rs.getString(1);
                return pass;
            }
            return null;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    
    public static String getName()
    {
        try {
            String pass;
            String sql = "select name from user_table";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                pass = rs.getString(1);
                return pass;
            }
            return null;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String getEmailId()
    {
        try {
            String pass;
            String sql = "select email_id from user_table";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                pass = rs.getString(1);
                return pass;
            }
            return null;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static Admin getUserDetails(String userName) {
        // To be used 
        return null;
    }


    public static void addOrder(Order order) {

        /*
         Add the order to the DB
         Leave this code for the time being
         */
    }

    public static void addLaptop(Laptop laptop) {
        try {
            String sql1 = "select city_id where city_name = laptop.getCity()";
            PreparedStatement pst1 = conn.prepareStatement(sql1);
            ResultSet rs = pst1.executeQuery();
            String sql = "insert into laptop_table values (?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, laptop.getModelNo());
            pst.setString(2, laptop.getBrand());
            pst.setFloat(3, laptop.getPrice());
            pst.setString(4, laptop.getScreenSize());
            pst.setString(5, laptop.getProcessor());
            pst.setInt(6, laptop.getCity());
            pst.setInt(7, laptop.getQuantity());
            int a = pst.executeUpdate();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void addMobile(Mobile mobile) {
        try {
            String sql = "insert into mobile_table values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, mobile.getModelNo());
            pst.setString(2, mobile.getBrand());
            pst.setFloat(3, mobile.getPrice());
            pst.setString(4, mobile.getScreenSize());
            pst.setFloat(5, mobile.getFrontCamera());
            pst.setFloat(6, mobile.getRearCamera());
            pst.setString(7, mobile.getOperatingSystem());
            pst.setFloat(8, mobile.getRam());
            pst.setInt(9, mobile.getCity());
            pst.setInt(10, mobile.getQuantity());
            int a = pst.executeUpdate();
            System.out.println(a);

        } catch (Exception e) {
            System.out.println();
        }

    }

    public static void addTablet(Tablets tablet) {
        try {
            String sql = "insert into tablets_table values (?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tablet.getModelNo());
            pst.setString(2, tablet.getBrand());
            pst.setFloat(3, tablet.getPrice());
            pst.setString(4, tablet.getScreenSize());
            pst.setString(5, tablet.getOperatingSystem());
            pst.setInt(6, tablet.getCity());
            pst.setInt(7, tablet.getQuantity());
            int a = pst.executeUpdate();
            System.out.println(a);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void addTelevision(Television television) {
        try {
            String sql = "insert into television_table values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, television.getModelNo());
            pst.setString(2, television.getBrand());
            pst.setFloat(3, television.getPrice());
            pst.setString(4, television.getScreenSize());
            pst.setFloat(5, television.getScreenResolutionHeight());
            pst.setFloat(6, television.getScreenResolutionWidth());
            pst.setInt(7, television.getCity());
            pst.setInt(8, television.getQuantity());
            int a = pst.executeUpdate();
            System.out.println(a);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void addCity(String cityName, Float longitude, Float latitude) {

        try {
            String sql = "insert into city_table values (NULL,cityName,longitude,latitude)";
            PreparedStatement pst = conn.prepareStatement(sql);
            //pst.setString(1, cityName);
            int a = pst.executeUpdate();
            System.out.println(a);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
