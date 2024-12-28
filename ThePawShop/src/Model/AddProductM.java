
package Model;


public class AddProductM {
    
    private String PID;
    private String PName;
    private String PCat;
    private String Price;
    private String Color;
    private String Brand;
    
    public AddProductM(String PID, String PName, String PCat, String Price, String Color, String Brand){
    
        this.PID = PID;
        this.PName = PName;
        this.PCat = PCat;
        this.Price = Price;
        this.Color = Color;
        this.Brand = Brand;
    }
    
    //Getters
    
    public String getPID(){
    return PID;
    }

    public String getPName(){
    return PName;
    }
    
    
    public String getPCat(){
    return PCat;
    }
    
    public String getPrice(){
    return Price;
    }
    
    public String getColor(){
    return Color;
    }
    
    public String getBrand(){
    return Brand;
    } 
    
}
