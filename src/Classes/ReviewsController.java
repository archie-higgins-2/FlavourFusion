package Classes;

/**
 * The ReviewsController class manages reviews for dishes.
 * It contains information about the review ID, dish name, customer feedback,
 * customer details, and menu ID.
 */
public class ReviewsController {
    /** Unique identifier for the review. */
    private int reviewID;

    /** Name of the dish being reviewed. */
    private String dishName;

    /** Feedback provided by the customer. */
    private String customerFeedback;

    /** Details of the customer providing the feedback. */
    private String customerDetails;

    /** ID of the menu associated with the review. */
    private int menuID;

    /** Method to get the review ID. */
    public int getReviewID() {
        return reviewID;
    }

    /** Method to set the review ID. */
    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    /** Method to get the dish name. */
    public String getDishName() {
        return dishName;
    }

    /** Method to set the dish name. */
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    /** Method to get the customer feedback. */
    public String getCustomerFeedback() {
        return customerFeedback;
    }

    /** Method to set the customer feedback. */
    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }

    /** Method to get the customer details. */
    public String getCustomerDetails() {
        return customerDetails;
    }

    /** Method to set the customer details. */
    public void setCustomerDetails(String customerDetails) {
        this.customerDetails = customerDetails;
    }

    /** Method to get the menu ID. */
    public int getMenuID() {
        return menuID;
    }

    /** Method to set the menu ID. */
    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }
}
