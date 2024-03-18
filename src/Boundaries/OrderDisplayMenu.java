package Boundaries;

import Classes.Order;

/**
 * The OrderDisplayMenu class represents the boundary for displaying active orders.
 * It contains information about the active orders.
 */
public class OrderDisplayMenu {
    /** The active orders to be displayed. */
    public Order activeOrders;

    /**
     * Constructor for OrderDisplayMenu class.
     * @param activeOrders The active orders to be displayed.
     */
    public OrderDisplayMenu(Order activeOrders){
        this.activeOrders = activeOrders;
    }

    /**
     * Method to update the status of an order.
     * This method would typically be invoked when the status of an order changes.
     */
    public void updateOrderStatus(){

    }
}
