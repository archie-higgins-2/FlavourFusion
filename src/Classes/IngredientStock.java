package Classes;

import Classes.Ingredient;

public class IngredientStock {
    private Ingredient ingredient;
    private int stock;


    public IngredientStock(Ingredient ingredient, int initialStock){
        this.ingredient = ingredient;
        this.stock = initialStock;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public int getStock() {
        return stock;
    }

    public void AddStock(int amount) {
        this.stock += amount;
    }

    public void WasteStock(int amount) {
        this.stock -= amount;
    }
}
