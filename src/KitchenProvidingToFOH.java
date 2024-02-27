import java.util.ArrayList;
/**
 * This interface defines the contract between the Kitchen Team and Front-Of-House (FOH) Team, allowing the kitchen to
 * update the FOH on course statuses and unavailable dishes.
 */
public interface KitchenProvidingToFOH {

    /**
     * @param order The order containing the course to check for readiness.
     * @return CourseStatus Enum indicating the current status of the course.
     */
    CourseStatus isCourseReady(Order order);

    /**
     * @param dishes The current menu to check for availability.
     * @return ArrayList<Recipe> A list of dishes that are unavailable.
     */
    ArrayList<Dish> sendUnavailableDish(Menu dishes);
}
