
package Controller;

import Model.RegisterCashierM;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class RegisterCashierC extends RegisterC {
    
    private boolean status;

    @Override
    public void Register(String Username, String Password, String lName, String NIC, String Gender, String DOB) {
    
    
        RegisterCashierM Reg = new RegisterCashierM(Username, Password, lName, NIC, Gender, DOB);
        
        String FileN = "CashierCred.txt";
        
        try {
            // Creating the file if it doesn't exist
            File file = new File(FileN);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            try(FileWriter insert = new FileWriter(FileN, true)){
                insert.write(Reg.getUsername()+ "," + Reg.getPassword() + ",");
                insert.write(Reg.getlName() + "," + Reg.getNIC() + ",");
                insert.write(Reg.getGender() + "," + Reg.getDOB() + "\n");
                status = true;
            }
    
            catch(IOException ex){
                JOptionPane.showMessageDialog(null,"Error While Writing File");
                status = false;
            }
      
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error While Writing File");
            status = false;
        }
        
    
    }
    
    public boolean returnStatus(){
    return status;
    }

    
}
