/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.LoginFrame;
import Model.LoginM;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Deepak
 */
public class LoginC {
    
    public String Un,Pw;
    
    public void setLogin(String UN, String PW){
    LoginM L1 = new LoginM(UN,PW);
    
     Un = L1.getUsername();
     Pw = L1.getPassword();
    
    }
    
    public void Authenticate(){
    
    }
    
    
    
  /*  public void View(){
        
    JOptionPane.showMessageDialog(null,U);
    JOptionPane.showMessageDialog(null,P);
    
}*/
}
