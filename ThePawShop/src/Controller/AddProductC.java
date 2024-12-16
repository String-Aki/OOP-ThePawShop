
package Controller;

import Model.AddProductM;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class AddProductC extends RegisterC {
    
    private boolean status;

    @Override
    public void Register(String PID, String PName, String PCat, String Price, String Color, String Brand) {
        
        AddProductM add = new AddProductM(PID, PName, PCat, Price, Color, Brand);
        
                String FileN = "Product.txt";
        
        try {
            // Creating the file if it doesn't exist
            File file = new File(FileN);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            try(FileWriter insert = new FileWriter(FileN, true)){
                insert.write(add.getPID() + "," + add.getPName() + ",");
                insert.write(add.getPCat() + "," + add.getPrice() + ",");
                insert.write(add.getColor() + "," + add.getBrand() + "\n");
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
    
    public boolean getStatus(){
    return status;
    }
    
}
