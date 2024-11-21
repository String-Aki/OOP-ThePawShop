
package Controller;

import View.LoginFrame;
import Model.LoginM;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LoginC {
    public LoginM model;
    public LoginFrame view;
    
    public LoginC(){
    model = new LoginM();
    view = new LoginFrame();
    }
    
    public void Login(String Username, String Password){
        model.setLoginM(Username, Password);
        model.LoginM();
        
    }
            
}
