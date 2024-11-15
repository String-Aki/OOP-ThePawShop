/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author Deepak
 */
public class LoginM {
    
    private String Username;
    private String Password;
 
    
    public LoginM(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
    }  
    
    public String getPassword(){
    return Password;
    }
  
    public String getUsername(){
    return Username;
    }
    
    
    
    
}
