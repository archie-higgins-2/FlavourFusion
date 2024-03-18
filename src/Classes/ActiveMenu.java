package Classes;

import java.util.ArrayList;
import java.util.List;

/** ActiveMenu is a class to be used the day a menu is being implemented,
 *  it will contain the activeDishes for that day and should be an easier way of accessing
 *  which dishes are available that day or potentially any replacements. */

public class ActiveMenu {

    /** Date of the menu to be used. */
    private int date;

    /** List of the dishes to be used on the active menu. */
    private List<Dish> activeDishes;

    /** Method to change the date of this menu to be active if management/admin
     * changes the day they want to use it. */
    public void setDate(int date){
        this.date = date;
    }

    /** Method to return the date. */
    public int getDate(){
        return this.date;
    }

    /** Method to set the active dishes used. */
    public void setActiveDishes(List<Dish> dishes){
        this.activeDishes = new ArrayList<>(dishes);
    }

    /** Method to return the active dishes list. */
    public List<Dish> getActiveDishes(){
        return this.activeDishes;
    }
}
