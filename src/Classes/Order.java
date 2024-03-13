package Classes;

import Classes.Course;

import java.util.List;

/** This class represents an order placed which consists of multiple dishes, a unique identifier, a table identifier,
 *  and an optional note for special dish adjustments.
 */
public class Order {
    /** Unique identifier for the order. */
    private final int id;

    /** Identifier of the table where the order was placed. */
    private int tableId;

    /** List of courses included in the order. */
    private List<Course> courses;

    /** Optional note containing special instructions for the order. */
    private String note;

    /**
     * Constructs a new Classes.Order instance.
     *
     * @param id The unique identifier for the order.
     * @param tableId The table identifier where the order is placed.
     * @param note An optional note with special requests for the order.
     * @param courses The list of courses included in the order.
     */
    public Order(int id, int tableId, String note, List<Course> courses) {
        this.id = id;
        this.note = note;
        this.courses = courses;
    }

    /**
     * Returns the unique identifier of the order.
     * @return The unique order ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the note containing special dish request for the order.
     * @return The note for the order.
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the note with special requests for the order.
     * @param note The new note to be set for the order.
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Returns the table identifier where the order was placed.
     * @return The table ID for the order.
     */
    public int getTableId() {
        return tableId;
    }


    /**
     * Returns the list of courses included in the order.
     * @return The list of courses in the order.
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * Sets or updates the list of courses included in the order.
     * @param courses The new list of courses to be set for the order.
     */
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
