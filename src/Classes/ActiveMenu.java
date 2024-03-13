package Classes;

import java.util.ArrayList;
import java.util.List;

public class ActiveMenu {
    public int date;
    public List<Dish> activeDishes;

    public void setDate(int date){
        this.date = date;
    }

    public int getDate(){
        return this.date;
    }

    public void setActiveDishes(List<Dish> dishes){
        this.activeDishes = new ArrayList<>(dishes);
    }

    public List<Dish> getActiveDishes(){
        return this.activeDishes;
    }
}
