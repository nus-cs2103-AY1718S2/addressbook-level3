package seedu.addressbook.data.person;

/**
 * A printable interface for a Person and its attribute.
 */
public interface Printable {
    /**
     * Returns a printable string representation of the object.
     */
    String getPrintableString(Printable... printables);
}
