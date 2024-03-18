package Classes;

/**
 * This class represents an order for a specific ingredient including its name, quantity, and unit.
 */
public class IngredientOrder {

    /** Unique identifier for the order. */
    private int orderID;

    /** The name of the ingredient. */
    private String ingredients;

    /** The quantity of the ingredient needed. */
    private double quantity;

    /**
     * Constructs a new IngredientOrder with the specified name and quantity.
     * @param ingredientName The name of the ingredient.
     * @param quantity The quantity of the ingredient.
     */
    public IngredientOrder(String ingredientName, double quantity) {
        this.ingredients = ingredientName;
        this.quantity = quantity;
    }

    /** Returns the name of the ingredient. */
    public String getIngredients() {
        return ingredients;
    }

    /** Returns the quantity of the ingredient. */
    public double getQuantity() {
        return quantity;
    }

    /** Sets the quantity of the ingredient. */
    public void setQuantity(double amount){
        this.quantity = amount;
    }

    /** Returns a string representation of the ingredient order, including the ingredient name and quantity. */
    @Override
    public String toString() {
        return ingredients + ":" + quantity;
    }

    /** Returns the order ID. */
    public int getOrderID() {
        return orderID;
    }

    /** Sets the order ID. */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /** Method to deliver the ingredients. */
    public void deliverIngredients(){

    }

    /** Method to confirm availability time for the ingredients. */
    public void confirmedIngredientsAvailabilityTime(){

    }
}
