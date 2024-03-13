package Classes;

import java.util.List;

public class RecipeCreator {
    private int chefId;
    public String newRecipeIdea;
    public String typeOfChefRole;

    public RecipeCreator(int chefId) {
        this.chefId = chefId;
    }

    public void createRecipe(){

    }

    public void createNewVariationOfRecipe(){

    }

    public void receiveIngredients(){

    }

    public void trackComments(){

    }

    public List<IngredientOrder> getIngredientsAvailable(){
        return null;
    }

    public void orderIngredients(){

    }

    public void refineRecipe(){

    }

    public void trackChanges(){

    }

    public int getChefId() {
        return chefId;
    }

    public void setChefId(int chefId) {
        this.chefId = chefId;
    }

    public String getTypeOfChefRole(){
        return typeOfChefRole;
    }

    public void setTypeOfChefRole(String role){
        this.typeOfChefRole=role;
    }

    public String getNewRecipeIdea(){
        return newRecipeIdea;
    }

    public void setNewRecipeIdea(String name){
        this.newRecipeIdea = name;
    }
}
