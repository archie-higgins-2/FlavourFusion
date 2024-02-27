/**
 * This class represents the various statuses a course can have.
 * This enum is utilized to track the progress of a course from its inception, through preparation, to its final serving.
 */
public enum CourseStatus {
    /**
     * Indicates that the course has been ordered but its preparation has not yet started.
     */
    PENDING,

    /**
     * Represents the state where the course is currently being prepared in the kitchen.
     */
    PREPARING,

    /**
     * Signifies that the course preparation is completed, and it is ready to be served.
     */
    READY,

    /**
     * Indicates that the course has been served to the customer.
     */
    SERVED
}
