package Boundaries;

public class LoginInterface {
    public boolean authorisation;

    public LoginInterface(){
        this.authorisation = Login();
    }

    public boolean Login(){
        return false;
    }

    public void Logout(){

    }

    public boolean getAuthorise(){
        return this.authorisation;
    }
}
