package seedu.addressbook.data.person;

/**
 * Represents an object that can be represented as a printable string.
 */
public interface Printable {

    /**
     * Returns a printable string representing this printable object.
     */
    String getPrintableString();

    /**
     * Returns a concatenated version of the printable strings of each object.
     */
    static String getPrintableString(Printable... printables) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < printables.length; ++i) {
            builder.append(printables[i].getPrintableString());
            if (i > 0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
