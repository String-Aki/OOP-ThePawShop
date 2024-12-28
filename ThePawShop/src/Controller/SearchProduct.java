
package Controller;

import javax.swing.JTable;

public class SearchProduct extends SearchC {
    
    public void SearchProductIDOrCategory(String Category, JTable TableName){
        
        String Filename = "Product.txt";
        String [] Column = {"Product ID", "Product Name", "Product Category", "Price", "Color", "Brand"};
        
        super.Search(Category, Filename, Column, TableName);
    }
    
    
}
