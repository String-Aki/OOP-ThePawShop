
package Model;

public class RegisterM {
   
    private String Username;
    private String Password;
    private String lName;
    private String NIC;
    private String Gender;
    private String DOB;
    

    
    public RegisterM(String fName,String Password,String lname,String NIC, String Gender, String DOB){
        this.Username = "Cs-" + fName;
        this.Password = Password;
        this.lName = lname;
        this.NIC = NIC;
        this.Gender = Gender;
        this.DOB = DOB;
    }
   
    //Getters
    public String getUsername(){
    return Username;
    }

    public String getPassword(){
    return Password;
    }
    
    
    public String getlName(){
    return lName;
    }
    
    public String getNIC(){
    return NIC;
    }
    
    public String getGender(){
    return Gender;
    }
    
    public String getDOB(){
    return DOB;
    }
    
    
}
    
    
    
    


    

