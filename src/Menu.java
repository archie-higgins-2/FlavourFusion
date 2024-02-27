import java.util.ArrayList;
import java.util.List;
/**
 * This class represents a menu containing a collection of recipes and wines pairing and allows for the addition and
 * retrieval of recipes and wines to a menu.
 */
public class Menu {

    /**
     * The unique identifier for the menu.
     */
    private String menuID;

    /**
     * The list of recipes included in the menu.
     */
    private List<Dish> dishes;

    /**
     * Constructs a new Menu instance with empty lists of recipes and wines.
     * Initializes the menu with no recipes or wines added.
     */
    public Menu() {
        this.dishes = new ArrayList<>();
    }

    /**
     * Adds a recipe to the menu.
     * @param dish The Recipe object to be added to the menu's list of recipes.
     */
    public void addRecipe(Dish dish) {
        dishes.add(dish);
    }

    /**
     * Retrieves the list of recipes in the menu.
     * @return A list of Recipe objects contained in the menu.
     */
    public List<Dish> getRecipes() {
        return dishes;
    }

}
