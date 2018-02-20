package seedu.addressbook.data.person;

/**
 * An interface for printing personal information as string.
 * Implementations should guarantee: details are present and not null, field values are validated.
 */
public interface Printable {

    String getPrintableString();
}
