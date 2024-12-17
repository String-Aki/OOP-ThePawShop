
package Controller;

import Model.SearchM;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SearchC {
    
    public void Search(String D1, String File, String [] Column, JTable Table){
    
        String Filename = File;
        String [] ColumnName = Column; 
        
    SearchM Srch1 = new SearchM(D1);
    
    DefaultTableModel TModel = new DefaultTableModel(ColumnName, 0);
        
        try{
            
        File file = new File(Filename);
        BufferedReader read = new BufferedReader(new FileReader(file));
        String Line;
        
         
        while((Line = read.readLine())!= null){
        String CData[] = Line.split(",");
        if(CData.length == 6){
        
        String V1 = CData[0].trim();
        String V2 = CData[1].trim();
        String V3 = CData[2].trim();
        String V4 = CData[3].trim();
        String V5 = CData[4].trim();
        String V6 = CData[5].trim();
        
        if(Srch1.getValue1().contains(V1)){
        
        TModel.addRow(CData);
        
        
        }
        
        else if(Srch1.getValue1().equals(V3)){
        TModel.addRow(CData);
        }
        
        }
        
        
        
        }
        
        
        }
        
        catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error: Couldn't Load Data");
        }
        
        Table.setModel(TModel);
    }
    
    
    
    
    
    }

