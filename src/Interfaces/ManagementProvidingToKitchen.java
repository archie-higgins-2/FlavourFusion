package Interfaces;

import Classes.IngredientOrder;
import Classes.Menu;
import Classes.Order;

import java.util.List;

/**
 * An interface outlining the kitchen operations in the restaurant.
 * It handles tasks related to managing orders and ingredient availability.
 */
public interface ManagementProvidingToKitchen {
    /**
     * Retrieves the next delivery order for the kitchen to process.
     *
     * @return A list of delivered items to be added to the kitchen stock.
     */
    Order getDeliveryOrder();

    /**
     * Retrieves the availability status of ingredients from suppliers.
     *
     * @return An array of available ingredients from the supplier.
     */
    List<IngredientOrder> getIngredientsAvailable();

    /**
     * Checks and approves the restaurant's menu based on ingredient availability.
     *
     * @return true if the menu can be approved, false otherwise.
     */
    boolean getMenuApproval(Menu menu);
}