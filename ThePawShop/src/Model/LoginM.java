
package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import javax.swing.JOptionPane;
public class LoginM {
      public boolean match;
//    private String Username;
//    private String Password; 
//   
//    
//   
//    public void setLoginM(String Username,String Password){
//        this.Username = Username;
//        this.Password = Password;
//    }
//    
//    public String getPassword(){
//    return Password;
//    }
//
//    public String getUsername(){
//    return Username;
//    }
    
    public void LoginF(String Username,String Password){
      
        try{
        
        BufferedReader read = new BufferedReader(new FileReader("ManagerCred.txt"));
        String Line;
//        spliting the line of data stored for manager registratation into variables
        while((Line = read.readLine())!= null){
        String MgData[] = Line.split(",");
        if(MgData.length == 4){
        String auth1 = MgData[0].trim();
        String auth2 = MgData[1].trim();
        
//        checking if the stored values match the entered values
        if(auth1.equals(Username) && auth2.equals(Password)){
            match = true;
//            JOptionPane.showMessageDialog(null,"Login Successful");
            break;
        }
       }
      }
       
        
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "An IOException Occured");
            }
        
        
   }
    
    public boolean getMatch(){
    return match;
    }
    
//    pulic void ForgotPass(){
//    
//    try{
//        
//        BufferedReader read = new BufferedReader(new FileReader("ManagerCred.txt"));
//        String Line;
//
//        while((Line = read.readLine())!= null){
//        String MgData[] = Line.split(",");
//        if(MgData.length == 4){
//        String lname = MgData[0].trim();
//        String nic = MgData[1].trim();
//        
////        checking if the stored values match the entered values
//        if(lname.equals(Lname) && pass.equals(NIC)){
//            match = true;
//            break;
//        }
//       }
//      }
//        read.close();   
//        
//      }
//        catch(IOException ex){
//            JOptionPane.showMessageDialog(null, "An IOException Occured");
//            }
//    
//    }
    
    
    
}
