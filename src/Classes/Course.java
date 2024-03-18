package Classes;

import java.util.List;

/**
 * Course class represents a course in a meal, such as appetizer, main course, or dessert.
 * It contains information about the course ID and the list of dishes associated with it.
 */
public class Course {
    /** Unique identifier for the course. */
    private int courseID;

    /** List of dishes included in this course. */
    private List<Dish> dishes;

    /**
     * Constructor for Course class.
     * @param courseID The unique identifier for the course.
     * @param dishes List of dishes included in this course.
     */
    public Course(int courseID, List<Dish> dishes){
        this.setCourseID(courseID);
        this.setDishes(dishes);
    }

    /** Method to retrieve the course ID. */
    public int getCourseID() {
        return courseID;
    }

    /** Method to set the course ID. */
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    /** Method to retrieve the list of dishes in this course. */
    public List<Dish> getDishes() {
        return dishes;
    }

    /** Method to set the list of dishes in this course. */
    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    /** Method to call the waiter when the course is ready. */
    public void callWaiterWhenReady(){

    }

    /**
     * Method to check if the course is ready for a given order.
     * @param order The order to check the readiness for.
     * @return True if the course is ready, false otherwise.
     */
    public boolean isCourseReady(Order order){
        return false;
    }
}
