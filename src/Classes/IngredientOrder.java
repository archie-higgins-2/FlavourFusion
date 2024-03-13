package Classes;

/**
 * This class represents an order for a specific ingredient including its name, quantity, and unit.
 */
public class IngredientOrder {

    private int orderID;

    /**
     * The name of the ingredient.
     */
    private String ingredients;

    /**
     * The quantity of the ingredient needed.
     */
    private double quantity;

    /**
     * The unit of measurement for the quantity of the ingredient (e.g., kg, l, boxes etc.).
     */


    /**
     * Constructs a new Classes.IngredientOrder with the specified name, quantity, and unit.
     *
     * @param ingredientName The name of the ingredient.
     * @param quantity The quantity of the ingredient.
     */
    public IngredientOrder(String ingredientName, double quantity) {
        this.ingredients = ingredientName;
        this.quantity = quantity;
    }

    /**
     * Returns the name of the ingredient.
     * @return The name of the ingredient.
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * Returns the quantity of the ingredient.
     * @return The quantity of the ingredient.
     */
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double amount){
        this.quantity = amount;
    }


    /**
     * Returns a string representation of the ingredient order, including the ingredient name,
     * quantity, and unit.
     * @return A string representation of the ingredient order.
     */
    @Override
    public String toString() {
        return ingredients + ":" + quantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void deliverIngredients(){

    }

    public void confirmedIngredientsAvailabilityTime(){

    }


}
