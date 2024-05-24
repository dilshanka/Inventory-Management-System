/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.Set;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {
    
    
     @FXML
    private Button close;

    @FXML
    private Button loginbtn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML 
    private TextField username;
    
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    
    public void loginAdmin()
    {
        String sql = "SELECT * FROM admin WHERE username = ? and password = ? ";
        
        connect = database.connectDb();
        
        
        try{
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, username.getText());
            prepare.setString(2, password.getText());
            
            
            result = prepare.executeQuery();
            Alert alert;
            
            if(username.getText().isEmpty()
                    || password.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();  
            }
            
            
            else{
                
                if(result.next())
                {
                    
                    alert = new Alert(Alert)
                    
                    
                    
                }
            }
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
    
    
    
    public void close()
    {
        System.exit(0);
    }
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
