package Classes;

/**
 * Ingredient class represents an ingredient used in dishes.
 * It contains information about the ingredient's ID, name, and stock.
 */
public class Ingredient {
    /** Unique identifier for the ingredient. */
    private int ingredientId;

    /** Name of the ingredient. */
    private String ingredientName;

    /** Stock of the ingredient. */
    private Stock ingredientStock;

    /**
     * Constructor for Ingredient class.
     * @param ingredientId The unique identifier for the ingredient.
     * @param ingredientName The name of the ingredient.
     */
    public Ingredient(int ingredientId, String ingredientName){
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;
    }

    /** Method to retrieve the name of the ingredient. */
    public String getIngredientName() {
        return ingredientName;
    }

    /** Method to set the name of the ingredient. */
    public void setIngredientName(String ingredientName) {
        ingredientName = ingredientName;
    }

    /** Method to retrieve the ID of the ingredient. */
    public int getIngredientId() {
        return ingredientId;
    }

    /** Method to retrieve the stock of the ingredient. */
    public Stock getIngredientStock() {
        return ingredientStock;
    }

    /** Method to set the stock of the ingredient. */
    public void setIngredientStock(Stock ingredientStock) {
        this.ingredientStock = ingredientStock;
    }
}
