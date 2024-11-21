
package Controller;

import Model.RegisterM;
import View.ManagerReg;
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
    
  
    
    
    

