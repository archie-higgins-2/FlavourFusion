package Classes;

/**
 * This class represents an order for a specific ingredient including its name, quantity, and unit.
 */
public class IngredientOrder {

    /**
     * The name of the ingredient.
     */
    private String ingredientName;

    /**
     * The quantity of the ingredient needed.
     */
    private double quantity;

    /**
     * The unit of measurement for the quantity of the ingredient (e.g., kg, l, boxes etc.).
     */
    private String unit;

    /**
     * Constructs a new Classes.IngredientOrder with the specified name, quantity, and unit.
     *
     * @param ingredientName The name of the ingredient.
     * @param quantity The quantity of the ingredient.
     * @param unit The unit of measurement for the quantity.
     */
    public IngredientOrder(String ingredientName, double quantity, String unit) {
        this.ingredientName = ingredientName;
        this.quantity = quantity;
        this.unit = unit;
    }

    /**
     * Returns the name of the ingredient.
     * @return The name of the ingredient.
     */
    public String getIngredientName() {
        return ingredientName;
    }

    /**
     * Returns the quantity of the ingredient.
     * @return The quantity of the ingredient.
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Returns the unit of measurement for the ingredient's quantity.
     * @return The unit of measurement.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Returns a string representation of the ingredient order, including the ingredient name,
     * quantity, and unit.
     * @return A string representation of the ingredient order.
     */
    @Override
    public String toString() {
        return ingredientName + ":" + quantity + " " + unit;
    }
}
