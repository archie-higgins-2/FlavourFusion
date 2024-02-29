package Classes;

public class Ingredient {
    private int ingredientId;
    private String ingredientName;

    public Ingredient(int ingredientId, String ingredientName){
        this.ingredientId=ingredientId;
        this.ingredientName = ingredientName;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        ingredientName = ingredientName;
    }

    public int getIngredientId() {
        return ingredientId;
    }

}
