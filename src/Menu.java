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
    private List<Recipe> recipes;

    /**
     * The list of wines recommended for the menu.
     */
    private List<Wine> wines;

    /**
     * Constructs a new Menu instance with empty lists of recipes and wines.
     * Initializes the menu with no recipes or wines added.
     */
    public Menu() {
        this.recipes = new ArrayList<>();
        this.wines = new ArrayList<>();
    }

    /**
     * Adds a recipe to the menu.
     * @param recipe The Recipe object to be added to the menu's list of recipes.
     */
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    /**
     * Adds a wine to the menu.
     * @param wine The Wine object to be added to the menu's list of wines.
     */
    public void addWine(Wine wine) {
        wines.add(wine);
    }

    /**
     * Retrieves the list of recipes in the menu.
     * @return A list of Recipe objects contained in the menu.
     */
    public List<Recipe> getRecipes() {
        return recipes;
    }

    /**
     * Retrieves the list of wines recommended for the menu.
     * @return A list of Wine objects recommended for the menu.
     */
    public List<Wine> getWines() {
        return wines;
    }

}
