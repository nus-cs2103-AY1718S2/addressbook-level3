package seedu.addressbook.data.person;

/**
 * An interface for a printable objects.
 * Implementations should guarantee: details are present and not null, field values are validated.
 */
public interface Printable {
    /**
     * Formats the printable object as text
     */
    String getPrintableString();
}
