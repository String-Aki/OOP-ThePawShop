
package Controller;

import Model.RegisterM;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class RegisterC {
      
    private Boolean status;
    
    public void Register(String Username,String Password,String lName,String NIC, String Gender, String DOB ){
        
        RegisterM Reg = new RegisterM(Username, Password, lName, NIC, Gender, DOB);
        
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
    
    public Boolean getStatus(){
    return status;
    }
    
    //Loads Cashier Data to the table
    public void ViewCashiers(JTable TCashier){
    
        String [] ColumnN = {"Cashier ID", "Cashier Name", "Date of Birth", "Gender", "NIC"};
        
        DefaultTableModel TModel = new DefaultTableModel(ColumnN, 0);
        
        try{
            
        File file = new File("CashierCred.txt");
        BufferedReader read = new BufferedReader(new FileReader(file));
        String Line;

        while((Line = read.readLine())!= null){
        String CData[] = Line.split(",");
        if(CData.length == 6){
        
        String CID = CData[0].trim();
        String Cpass = CData[1].trim();
        String Cname = CData[2].trim();
        String CNIC = CData[3].trim();
        String CGender = CData[4].trim();
        String CDOB = CData[5].trim();
        
        TModel.addRow(new Object[]{CID, Cname, CDOB, CGender, CNIC});
        
        }
        
        }
        
        
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error: Couldn't Load Data");
        }
        
        TCashier.setModel(TModel);
    }
    
    
}