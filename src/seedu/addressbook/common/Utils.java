package seedu.addressbook.common;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import seedu.addressbook.data.person.Printable;

/**
 * Utility methods
 */
public class Utils {

    /**
     * Checks whether any of the given items are null.
     */
    public static boolean isAnyNull(Object... items) {
        for (Object item : items) {
            if (item == null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if every element in a collection are unique by {@link Object#equals(Object)}.
     */
    public static boolean elementsAreUnique(Collection<?> items) {
        final Set<Object> testSet = new HashSet<>();
        for (Object item : items) {
            final boolean itemAlreadyExists = !testSet.add(item); // see Set documentation
            if (itemAlreadyExists) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a concatenated version of the printable strings of each object.
     */
    public static String getPrintableString(Printable... printables) {
        StringBuilder sb = new StringBuilder();
        for (Printable printable: printables) {
            sb.append(printable.getPrintableString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
