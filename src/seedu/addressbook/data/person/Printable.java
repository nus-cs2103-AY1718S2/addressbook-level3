package seedu.addressbook.data.person;

public interface Printable {
    String getPrintableString();
    String toString();
    boolean equals(Object o);
    int hashCode();
}
