package seedu.addressbook.data.person;

public interface Printable {
    /**
     * To be inherited by Email, Name, Address, and Phone - gives printable string representation of object
     */
    public String getPrintableString(Printable... printables);
}
