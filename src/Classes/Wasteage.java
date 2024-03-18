package Classes;

/**
 * The Wasteage class represents the waste generated.
 * It contains information about the amount of waste and the cause of waste.
 */
public class Wasteage {

    /** The amount of waste generated. */
    public int amountOfWaste;

    /** The cause of waste generation. */
    public String causeOfWaste;

    /**
     * Constructor for Wasteage class.
     * @param amount The amount of waste generated.
     * @param cause The cause of waste generation.
     */
    public Wasteage(int amount, String cause){
        this.amountOfWaste = amount;
        this.causeOfWaste = cause;
        this.documentWaste(); // Document waste upon creation of Wasteage object
    }

    /** Method to update stock after wasteage. */
    public void UpdateStock(){

    }

    /** Method to get the amount of waste. */
    public int getAmountOfWaste(){
        return this.amountOfWaste;
    }

    /** Method to set the amount of waste. */
    public void setAmountOfWaste(int amount){
        this.amountOfWaste = amount;
    }

    /** Method to get the cause of waste. */
    public String getCauseOfWaste(){
        return this.causeOfWaste;
    }

    /** Method to document waste. */
    public void documentWaste(){

    }
}
