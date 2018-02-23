package seedu.addressbook.ui;

import org.junit.Before;
import org.junit.Test;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Phone;
import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.UniqueTagList;
import static org.junit.Assert.assertEquals;

public class GuiTest {

    private Formatter formatter;

    @Before
    public void setup() {
        formatter = new Formatter();
    }

    @Test
    public void testGetPrintableString() throws Exception {
        Name name = new Name("Adam Brown");
        Phone phone = new Phone("111111", false);
        Email email = new Email("adam@gmail.com", false);
        Address address = new Address("111, alpha street", false);
        UniqueTagList uniqueTagList = new UniqueTagList();
        Person person = new Person(name, phone, email, address, uniqueTagList);
        assertEquals(formatter.getPrintableString(
                person.getName(), person.getPhone(), person.getEmail(), person.getAddress()),
                "Name: Adam Brown Phone: 111111 Email: adam@gmail.com Address: 111, alpha street");
    }

}
