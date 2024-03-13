package Classes;

public class Stock {

    private int ingredientID;
    private int CurrentStock;


    public Stock(int ID, int initialStock){
        this.ingredientID = ID;
        this.CurrentStock = initialStock;
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public int getCurrentStock() {
        return CurrentStock;
    }

    public void addToStock(int amount) {
        this.CurrentStock += amount;
    }

    public void wasteStock(int amount) {
        this.CurrentStock -= amount;
    }
}
