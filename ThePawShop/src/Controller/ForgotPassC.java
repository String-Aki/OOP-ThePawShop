
package Controller;

import Model.ForgotPassM;


public class ForgotPassC {
    public ForgotPassM model;
    
    public ForgotPassC(){
    model = new ForgotPassM();
    }
    
    public void RetrievePass(String Lname,String NIC){
    
        model.LoginF(Lname, NIC);
    
    }
    
    public boolean getMatch(){
    return model.getMatch();
    }
    
}
