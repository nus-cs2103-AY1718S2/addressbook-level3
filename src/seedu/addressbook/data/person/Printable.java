package seedu.addressbook.data.person;

/**
 * Interface that prints Person's personal Information, such as Address, Email, Name and Phone
 */
public interface Printable {
    /**
     * Produces a printable string representation of an object.
     *
     */
    public String getPrintableString();
}
