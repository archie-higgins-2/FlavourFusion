package Classes;

import java.util.List;

/**
 * The RecipeCreator class represents a chef who creates and manages recipes.
 * It contains information about the chef's ID, new recipe ideas, and chef's role.
 */
public class RecipeCreator {
    /** Unique identifier for the chef. */
    private int chefId;

    /** The new recipe idea proposed by the chef. */
    public String newRecipeIdea;

    /** The type or role of the chef. */
    public String typeOfChefRole;

    /**
     * Constructor for RecipeCreator class.
     * @param chefId The unique identifier for the chef.
     */
    public RecipeCreator(int chefId) {
        this.chefId = chefId;
    }

    /** Method to create a new recipe. */
    public void createRecipe(){

    }

    /** Method to create a new variation of an existing recipe. */
    public void createNewVariationOfRecipe(){

    }

    /** Method to receive ingredients for a recipe. */
    public void receiveIngredients(){

    }

    /** Method to track comments on a recipe. */
    public void trackComments(){

    }

    /** Method to get available ingredients. */
    public List<IngredientOrder> getIngredientsAvailable(){
        return null;
    }

    /** Method to order ingredients for a recipe. */
    public void orderIngredients(){

    }

    /** Method to refine a recipe. */
    public void refineRecipe(){

    }

    /** Method to track changes made to a recipe. */
    public void trackChanges(){

    }

    /** Method to get the chef's ID. */
    public int getChefId() {
        return chefId;
    }

    /** Method to set the chef's ID. */
    public void setChefId(int chefId) {
        this.chefId = chefId;
    }

    /** Method to get the type or role of the chef. */
    public String getTypeOfChefRole(){
        return typeOfChefRole;
    }

    /** Method to set the type or role of the chef. */
    public void setTypeOfChefRole(String role){
        this.typeOfChefRole = role;
    }

    /** Method to get the new recipe idea. */
    public String getNewRecipeIdea(){
        return newRecipeIdea;
    }

    /** Method to set the new recipe idea. */
    public void setNewRecipeIdea(String name){
        this.newRecipeIdea = name;
    }
}
