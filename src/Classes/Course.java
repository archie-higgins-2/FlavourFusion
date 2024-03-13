package Classes;

import java.util.List;

public class Course {
    private int courseID;
    private List<Dish> Dishes;

    public Course(int courseID, List<Dish> Dishes){
        this.setCourseID(courseID);
        this.setDishes(Dishes);
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public List<Dish> getDishes() {
        return Dishes;
    }

    public void setDishes(List<Dish> dishes) {
        Dishes = dishes;
    }

    public void callWaiterWhenReady(){

    }

    public boolean isCourseReady(Order order){
        return false;
    }
}
