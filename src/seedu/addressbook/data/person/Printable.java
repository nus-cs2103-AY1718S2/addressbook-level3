package seedu.addressbook.data.person;

/**
 * An interface to create printable string representation of an object.
 * Implementations should guarantee: details are present and not null, field values are validated.
 */
public interface Printable {

    /**
     * Returns a printable string representation of the object
     */
    String getPrintableString();

}
