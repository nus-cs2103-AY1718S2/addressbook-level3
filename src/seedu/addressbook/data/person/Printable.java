package seedu.addressbook.data.person;

/**
 * A printable interface for the particulars of a Person in the addressbook.
 * Implementations should guarantee: a printable string representation of the object.
 */
public interface Printable {
    String getPrintableString();
}
