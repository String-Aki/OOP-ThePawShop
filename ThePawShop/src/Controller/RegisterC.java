/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.RegisterM;
import View.ManagerReg;
import java.io.*;
import javax.swing.JOptionPane;

public class RegisterC {
    public RegisterM model;
    public ManagerReg view;
    
    public RegisterC (){
        model = new RegisterM();
        view = new ManagerReg();
    }
    
    public void Register(String Username,String Password,String fname,String NIC ){
    
    model.setRegisterM(Username, Password, fname, NIC);
    model.writeCred();
      
    }
    }
    
  
    
    
    

