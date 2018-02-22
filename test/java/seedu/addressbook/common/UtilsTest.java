package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {

    //Checks that some of the objects is null.
    private void assertContainsNull(Object... objects) {
        assertTrue(Utils.isAnyNull(objects));
    }

    //Checks that none of the objects is null.
    private void assertNoNull(Object... objects) {
        assertFalse(Utils.isAnyNull(objects));
    }

    //Checks that the objects are unique.
    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    //Checks that the objects are not unique.
    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    //Runs a number of checks on empty object/one object/many objects if they are null or none are null.
    @Test
    public void isAnyNull() throws Exception {
        assertNoNull();

        assertNoNull(999);
        assertNoNull("");
        assertNoNull(new Object());
        assertContainsNull((Object) null);
        
        assertNoNull(999, 999);
        assertNoNull(999, 9999, "");
        assertNoNull(new Object(), new Object());
        assertNoNull("", 999);
        assertNoNull("", "");
        assertNoNull("cat", "cat");
        assertContainsNull(null, null);
        assertContainsNull(999, null);
        assertContainsNull(999, 999, null);
        assertContainsNull("", null, null);
        assertContainsNull(null, 999);

    }

    //Runs a number of checks on empty object/one object/many objects if they are unique or not unique.
    @Test
    public void elementsAreUnique() throws Exception {

        assertAreUnique();

        assertAreUnique((Object) null);
        assertAreUnique(999);
        assertAreUnique("");
        assertAreUnique("cat");

        assertAreUnique("cat", "ab", "a");
        assertAreUnique(999, 9999);

        assertNotUnique(999, new Integer(999));
        assertNotUnique(null, 999, new Integer(999));
        assertNotUnique(null, null);
        assertNotUnique("c", "a","t", null);
        assertNotUnique("cat", "cat");
        assertNotUnique("cat", "", "cat", "CAT");
        assertNotUnique("", "cat", "c", "cat");

    }
}