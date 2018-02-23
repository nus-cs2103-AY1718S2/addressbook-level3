package seedu.addressbook.common;

import java.util.*;

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

    public static String getPrintableString(Printable... printables) {
        String printableString = "";
        List printablesList = Arrays.asList(printables);
        for (int i = 0; i < printablesList.size() - 1; i++) {
            printableString += printablesList.get(i);
            printableString += ", ";
        }
        if (printablesList.size() > 0) printableString += printablesList.get(printables.length - 1);
        return printableString;
    }
}
