
package Model;

public class LoginM {

   private String Username;
   private String Password; 
   
  
   public boolean found;
   
   // Constructors
   
    public LoginM(){
        this.Username = "SuperAdmin";
        this.Password = "Admin";
    }
    
    public LoginM(String Username,String Password){
        this.Username = Username;
        this.Password = Password;
    }
    
    // Getters
    
    public String getPassword(){
    return Password;
    }

    public String getUsername(){
    return Username;
    }
    
    
}
