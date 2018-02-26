package seedu.addressbook.data.person;

/**
 * A read-only immutable interface for a contact detail of a Person in the addressbook.
 * Implementations should guarantee: details are present and not null, field values are validated.
 */
public interface Printable {
    String getPrintableString();
}
