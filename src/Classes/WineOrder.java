package Classes;

/**
 * This class represents an order for a specific wine including its name and quantity.
 */
public class WineOrder {

    /**
     * The name of the wine.
     */
    private String wineName;

    /**
     * The quantity of the wine needed.
     */
    private double quantity;

    /**
     * Constructs a new Classes.WineOrder with the specified name and quantity.
     *
     * @param wineName The name of the ingredient.
     * @param quantity The quantity of the ingredient.
     */
    public WineOrder(String wineName, double quantity) {
        this.wineName = wineName;
        this.quantity = quantity;
    }

    /**
     * Returns the name of the wine.
     * @return The name of the wine.
     */
    public String getWineName() {
        return wineName;
    }

    /**
     * Returns the quantity of the wine.
     * @return The quantity of the wine.
     */
    public double getQuantity() {
        return quantity;
    }


    /**
     * Returns a string representation of the wine order, including the wine name and quantity.
     * @return A string representation of the wine order.
     */
    @Override
    public String toString() {
        return wineName + ":" + quantity;
    }
}
