package seedu.addressbook.data.person;

/**
 * A interface for detail object(eg. Name, Phone) of a Person in the addressbook.
 * Implementations should guarantee: detail produces a printable string representation of the object.
 */

public interface Printable {

    String getPrintableString();

}
