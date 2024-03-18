package Classes;

/**
 * The Stock class represents the stock of an ingredient.
 * It contains information about the ingredient ID and the current stock level.
 */
public class Stock {

    /** Unique identifier for the ingredient. */
    private int ingredientID;

    /** Current stock level of the ingredient. */
    private int currentStock;

    /**
     * Constructor for Stock class.
     * @param ID The unique identifier for the ingredient.
     * @param initialStock The initial stock level of the ingredient.
     */
    public Stock(int ID, int initialStock){
        this.ingredientID = ID;
        this.currentStock = initialStock;
    }

    /** Method to get the ingredient ID. */
    public int getIngredientID() {
        return ingredientID;
    }

    /** Method to get the current stock level. */
    public int getCurrentStock() {
        return currentStock;
    }

    /**
     * Method to add to the current stock level.
     * @param amount The amount to add to the stock.
     */
    public void addToStock(int amount) {
        this.currentStock += amount;
    }

    /**
     * Method to reduce the current stock level (waste stock).
     * @param amount The amount to reduce from the stock.
     */
    public void wasteStock(int amount) {
        this.currentStock -= amount;
    }
}
