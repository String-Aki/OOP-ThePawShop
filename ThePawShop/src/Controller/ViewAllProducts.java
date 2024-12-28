
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewAllProducts extends ViewAllC {

    @Override
    public void ViewAll(JTable TProduct) {
        
        String [] ColumnN = {"Product ID", "Product Name", "Product Category", "Price", "Color", "Brand"};
        
        DefaultTableModel TModel = new DefaultTableModel(ColumnN, 0);
        
        try{
            
        File file = new File("Product.txt");
        BufferedReader read = new BufferedReader(new FileReader(file));
        String Line;

        while((Line = read.readLine())!= null){
        String CData[] = Line.split(",");
        if(CData.length == 6){
        
        String PID = CData[0].trim();
        String PName = CData[1].trim();
        String PCat = CData[2].trim();
        String Price = CData[3].trim();
        String Color = CData[4].trim();
        String Brand = CData[5].trim();
        
        TModel.addRow(new Object[]{PID, PName, PCat, Price, Color, Brand});
        
        }
        
        }
        
        
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error: Couldn't Load Data");
        }
        
        TProduct.setModel(TModel);
    }
    
    
    
}
