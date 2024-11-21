
package Model;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;


public class RegisterM {
    private String lName;
    private String NIC;
    private String Password;
    private String Username;
    
    public boolean status =true;
    
    public void setRegisterM(String Username,String Password,String fname,String NIC){
        this.Username = "MG-" + Username;
        this.Password = Password;
        this.lName = fname;
        this.NIC = NIC;
    }
   
    
    public String getUsername(){
    return Username;
    }

    public String getPassword(){
    return Password;
    }
    
    public String getfName(){
    return lName;
    }
    
    public String getNIC(){
    return NIC;
    }
    
    
    
    public void writeCred(){

    try(FileWriter insert = new FileWriter("ManagerCred.txt", true)){
    insert.write(Username + "," + Password+ ",");
    insert.write(lName + "," + NIC +"\n");
    status = true;
//    return "Passed";
    }
    
    catch(IOException ex){
    System.err.println("An IOException occurred: " + ex.getMessage());
//    JOptionPane.showMessageDialog(null, "An IOException occurred: " + ex.getMessage());
//    return "Failed";
    status = false;
    }
    
    }
    
    public boolean Status(){
    return status;
    }
    
}
    
    
    
    


    

