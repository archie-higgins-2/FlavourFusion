package Interfaces;

import Classes.IngredientOrder;
import Classes.Menu;
import Classes.WineOrder;

import java.time.LocalDate;
import java.util.List;
/**
 * This interface defines the contract between the Kitchen Team and the Management Team, allowing the kitchen to
 * send menu details, ingredient and wine orders.
     */
    public interface KitchenProvidingToManagement {


    /**
     * Retrieves the compiled menu for a specific date.
     * @param date The date for which the compiled menu is requested.
     * @return Classes.Menu The compiled menu for the specified date, including dishes and possibly associated events.
     */
    Menu GetCompiledMenu(LocalDate date);

    /**
     * Provides a list of ingredient orders that the kitchen needs to place.
     * @return List<Classes.IngredientOrder> A list of ingredients orders, detailing the ingredients needed by the kitchen,
     * including quantities.
     */
    List<IngredientOrder> getIngredientsListToOrder();

    /**
     * Provides a list of wine orders that the Sommelier needs to place.
     * @return List<Classes.WineOrder> A list of wine orders, specifying the wine name and quantities of wines the Sommelier
     * needs.
     */
    List<WineOrder> getWineListToOrder();

    }
