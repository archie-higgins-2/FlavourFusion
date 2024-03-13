package Classes;

public class Wasteage {

    public int amountOfWaste;
    public String causeOfWaste;

    public Wasteage(int amount, String cause){
        this.amountOfWaste = amount;
        this.causeOfWaste = cause;
        this.documentWaste();
    }

    public void UpdateStock(){

    }

    public int getAmountOfWaste(){
        return this.amountOfWaste;
    }

    public void setAmountOfWaste(int amount){
        this.amountOfWaste = amount;
    }

    public String getCauseOfWaste(){
        return this.causeOfWaste;
    }

    public void documentWaste(){

    }
}
