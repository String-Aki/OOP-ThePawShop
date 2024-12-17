
package Controller;

import javax.swing.JTable;

public class SearchCashier extends SearchC{
    
    public void SearchCashierIDOrName(String CashierID, JTable TableName){
        
        String Filename = "CashierCred.txt";
        String [] Column = {"Cashier ID","Password", "Cashier Name", "Date of Birth", "Gender", "NIC"};
        
       super.Search(CashierID, Filename, Column, TableName);
    }

}
