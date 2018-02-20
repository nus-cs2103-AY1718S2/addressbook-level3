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
import seedu.addressbook.ui.Formatter;

public class PrintableTest {

    private Person Johan;
    private Person Steve;

    @Before
    public void setUp() throws Exception {
        Johan = new Person(new Name("Johan"),
                            new Phone("123456", true),
                            new Email("johan@gmail.com", true),
                            new Address("321 Ave", true),
                            new UniqueTagList(new Tag("Dog"), new Tag("Cat")));
        Steve = new Person(new Name("Steve"),
                            new Phone("654321", false),
                            new Email("steve@gmail.com", false),
                            new Address("123 Ave", false),
                            new UniqueTagList(new Tag("Person"), new Tag("Good")));
    }

    @Test
    public void printable_testPrivate() {
        final String privateDetails = "Name: Johan Phone: (private) 123456 Email: (private) johan@gmail.com Address: (private) 321 Ave ";
        assertPrivatePrintableString(privateDetails);
    }

    @Test
    public void printable_testPublic() {
        final String publicDetails = "Name: Steve Phone: 654321 Email: steve@gmail.com Address: 123 Ave ";
        assertPublicPrintableString(publicDetails);
    }

    /**
     * Asserts that the details of Johan is the same as expected
     */
    private void assertPrivatePrintableString(String privateDetails) {
        assertEquals(Formatter.getPrintableString(Johan.getName(), Johan.getPhone(),
                    Johan.getEmail(), Johan.getAddress()), privateDetails);
    }

    /**
     * Asserts that the details of Steve is the same as expected
     */
    private void assertPublicPrintableString(String publicDetails) {
        assertEquals(Formatter.getPrintableString(Steve.getName(), Steve.getPhone(),
                Steve.getEmail(), Steve.getAddress()), publicDetails);
    }

}
