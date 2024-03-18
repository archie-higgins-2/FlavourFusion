package Classes;

/**
 * Customer class represents a customer who visited the restaurant.
 * It contains information about the customer's name and their feedback.
 */
public class Customer {
    /** Name of the customer. */
    private String name;

    /**
     * Constructor for Customer class.
     * @param name The name of the customer.
     */
    public Customer(String name){
        this.setName(name);
    }

    /**
     * Method to leave feedback.
     * @return A string representing the feedback.
     */
    public String LeaveFeedback(){
        return "it was good";
    }

    /** Method to retrieve the customer's name. */
    public String getName() {
        return name;
    }

    /** Method to set the customer's name. */
    public void setName(String name) {
        this.name = name;
    }
}
