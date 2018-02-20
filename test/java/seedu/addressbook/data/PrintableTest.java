package seedu.addressbook.data;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Phone;
import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.tag.UniqueTagList;

/**
 * Used for testing the string representation of printable entities
 */
public class PrintableTest {
    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person(new Name("Test"),
                new Phone("123", true),
                new Email("test@gmail.com", false),
                new Address("321 Street", false),
                new UniqueTagList(new Tag("tea"), new Tag("happy")));
    }

    /**
     * Asserts that the details of the person is the same.
     */
    @Test
    public void getPrintableString_compareWithExpectedString_printedCorrectly() {
        final String expectedPersonDetails = "Test Phone: (private) 123 Email: test@gmail.com Address: 321 Street";
        assertEquals(person.getPrintableString(person.getName(), person.getPhone(),
                person.getEmail(), person.getAddress()), expectedPersonDetails);
    }
}
