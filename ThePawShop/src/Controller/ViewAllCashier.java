
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ViewAllCashier extends ViewAllC {

    @Override
    public void ViewAll(JTable TCashier) {
        
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
    

