package seedu.addressbook.data.person;


/**
 * A printable immutable interface for data of a Person in the addressbook.
 * Implementations should guarantee: details are of String type to be printed.
 */
public interface Printable {

    String getPrintableString();
}
