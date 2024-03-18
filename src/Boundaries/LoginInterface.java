package Boundaries;

/**
 * The LoginInterface class represents the boundary for user login functionality.
 * It contains information about the authorization status.
 */
public class LoginInterface {
    /** Boolean flag indicating authorization status. */
    public boolean authorisation;

    /**
     * Constructor for LoginInterface class.
     * Initializes the authorization status by calling the Login method.
     */
    public LoginInterface(){
        this.authorisation = Login();
    }

    /**
     * Method to perform user login.
     * @return True if login is successful, false otherwise.
     */
    public boolean Login(){
        return false; // Placeholder for login functionality
    }

    /**
     * Method to perform user logout.
     */
    public void Logout(){

    }

    /**
     * Method to get the authorization status.
     * @return The authorization status.
     */
    public boolean getAuthorise(){
        return this.authorisation;
    }
}