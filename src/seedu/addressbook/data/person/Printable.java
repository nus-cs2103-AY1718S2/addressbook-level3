package seedu.addressbook.data.person;

/**
 * A printable interface for Name, Phone, Email and Address in the addressbook.
 */
public interface Printable {
    /**
     * The returned String is a representation of the object. 
     * e.g. Name: John Smith, Phone: 12349862
     */
    String getPrintableString();
}