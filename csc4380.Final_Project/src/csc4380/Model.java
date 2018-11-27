/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author aaron
 */
public class Model implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    DatabaseBean databaseBean;
    
    private String status;
    
    private String current_user;
    
    
    
    public Model() {
        propertySupport = new PropertyChangeSupport(this);
        databaseBean = new DatabaseBean();
    }
    
    void createUser(String uName, String password) {
        
       status = databaseBean.createUser(uName, password);
    }
    
    void login(String uName, String password) {
        status = databaseBean.login(uName, password, this);   
    }
    
    void setCurrent_user(String user) {
        current_user = user;
    }
    
    void setStatus(String s) {
        status = s;
    }
    
    String getStatus() {
        return status;
    }
    
    void deleteUser() {
        String tempStatus = databaseBean.deleteUser(current_user);
        if(tempStatus.equals("signup failed"))
        {
            status = "signup failed";
        }
        current_user = "";
        
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
