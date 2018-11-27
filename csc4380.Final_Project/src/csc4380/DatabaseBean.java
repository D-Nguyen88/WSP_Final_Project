/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380;

import java.beans.*;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaron
 */
public class DatabaseBean implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    
    
    
    private Connection con;
    private java.sql.Statement st;
    private ResultSet rs;
    private String  jdbc_drivers = "com.mysql.jdbc.Driver";
    
    public DatabaseBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String createUser(String uName, String password)
    {
        String tempStatus = "";
         try {
            System.setProperty("jdbc.drivers", jdbc_drivers);
 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_projectdb", "root", "trailblazers");
            st = con.createStatement();
            st.executeUpdate("INSERT INTO user_info (username, password, balance) VALUES ('"+uName+"', '"+password+"', '0')");
            tempStatus ="signup success";
            

        } catch (SQLException ex) {
            //Logger lgr = Logger.getLogger(Version.class.getName());
            //lgr.log(Level.SEVERE, ex.getMessage(), ex);
               Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
               tempStatus = "signup failed";
               
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
               // Logger lgr = Logger.getLogger(Version.class.getName());
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
                //lgr.log(Level.WARNING, ex.getMessage(), ex);
                            }
        }
         return tempStatus;
    }
    
    
    
    public String login(String uName, String password, Model m)
    {
        String tempStatus = "";
        try {
            System.setProperty("jdbc.drivers", jdbc_drivers);
 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_projectdb", "root", "trailblazers");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM user_info WHERE username = '"+uName+"' AND password = '"+password+"'");

            if (rs.next()) {
                m.setCurrent_user(rs.getString(1));
                tempStatus ="login success";
            } else {
                tempStatus = "login failed";
            }

        } catch (SQLException ex) {
            //Logger lgr = Logger.getLogger(Version.class.getName());
            //lgr.log(Level.SEVERE, ex.getMessage(), ex);
               Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
               tempStatus = "login failed";
               
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
               // Logger lgr = Logger.getLogger(Version.class.getName());
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
                //lgr.log(Level.WARNING, ex.getMessage(), ex);
                            }
        }
        return tempStatus;
    }
    
    
    
    String deleteUser(String currentUser) {
        String tempStatus = "";
        try {
            System.setProperty("jdbc.drivers", jdbc_drivers);
 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_projectdb", "root", "trailblazers");
            st = con.createStatement();
            st.executeUpdate("DELETE FROM user_info WHERE username = '"+currentUser+"'");


        } catch (SQLException ex) {
            //Logger lgr = Logger.getLogger(Version.class.getName());
            //lgr.log(Level.SEVERE, ex.getMessage(), ex);
               Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
               tempStatus = "signup failed";
               
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
               // Logger lgr = Logger.getLogger(Version.class.getName());
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
                //lgr.log(Level.WARNING, ex.getMessage(), ex);
                            }
        }
        return tempStatus;
    }
    
    //Connect to the database, and create a new element in the purchased_vehicles 
    //table that says that current_user owns vehicleName
     void purchaseVehicle(String vehicleName, String current_user) {
        
    }
    
    //Connect to the database, and return true if current_user owns vehicleName, and false otherwise
     boolean userOwnsVehicle(String vehicleName, String current_user) {
        return true;
    }
    
     //This will pull all of the past scores from the database and return them
     ArrayList<Score> getScores()
     {
         return null;
     }
     
     //Method will return the balance of the specified user
     int getBalance(String current_user){
         return 0;
     }
    
    
    
    
    
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

    

   
    
}
