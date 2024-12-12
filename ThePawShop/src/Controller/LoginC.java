
package Controller;

import Model.LoginM;
import java.io.*;
import javax.swing.JOptionPane;

public class LoginC {
  
   public boolean matchM;
   public boolean matchC;
    
    public void LoginM(String Username, String Password){
        
        LoginM Lm = new LoginM();
        
        if(Lm.getUsername().equals(Username)&&Lm.getPassword().equals(Password)){
        matchM = true;
        }
        
        else {
            matchM = false;
        }
        
    }
    
    
    
    
    
    
            
    public void LoginC(String Username,String Password){
        
        LoginM Lc = new LoginM(Username,Password);
               
        try{
        
        BufferedReader read = new BufferedReader(new FileReader("CashierCred.txt"));
        String Line;
//        spliting the line of data stored for manager registratation into variables
        while((Line = read.readLine())!= null){
        String CsData[] = Line.split(",");
        if(CsData.length == 4){
        
        String auth1 = CsData[0].trim();
        String auth2 = CsData[1].trim();

//        checking if the stored values match the entered values
        if(Lc.getUsername().equals(auth1) && Lc.getPassword().equals(auth2)){
            matchC = true;
//            JOptionPane.showMessageDialog(null,"Login Successful");
            break;
        }
        
        else {
            matchC = false;
//            JOptionPane.showMessageDialog(null,"Login Failed");
        
        }
        
        }
        
        
        }
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "An IOException Occured");
            }
        }
    
    public boolean getMatchM(){
    return matchM;
    }
    
    public boolean getMatchC(){
    return matchC;
    }
    
    
    

}
    

    
        



    
    

    

