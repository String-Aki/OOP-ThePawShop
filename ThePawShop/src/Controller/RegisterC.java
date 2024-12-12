
package Controller;

import Model.RegisterM;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class RegisterC {
      
    Boolean status;
    
    public void Register(String Username,String Password,String lName,String NIC ){
        
        RegisterM Reg = new RegisterM(Username, Password, lName, NIC);
        
        String FileN = "CashierCred.txt";
        
        try {
            // Creating the file if it doesn't exist
            File file = new File(FileN);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            try(FileWriter insert = new FileWriter(FileN, true)){
                insert.write(Reg.getUsername()+ "," + Reg.getPassword() + ",");
                insert.write(Reg.getlName() + "," + Reg.getNIC() +"\n");
                status = true;
            }
    
            catch(IOException ex){
                JOptionPane.showMessageDialog(null,"Error While Writing File");
                status = false;
            }
      
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error While Writing File");
        }
        
    }
    
    public Boolean getStatus(){
    return status;
    }
    
    
}
    
  
    
    
    

