package seedu.addressbook.data.person;

/**
 * A printable interface for a Person's particulars in the addressbook.
 * Implementations should guarantee: details are present and not null, field values are validated.
 */
public interface Printable {

    String getPrintableString();
}
