package seedu.addressbook.data;

import org.junit.Before;
import org.junit.Test;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Phone;
import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.tag.UniqueTagList;
import seedu.addressbook.data.person.Address;
import seedu.addressbook.ui.Formatter;
import static junit.framework.TestCase.assertEquals;

public class PrintableTest {
    private Person ahgou;
    private Person ahmao;

    @Before
    public void setUp() throws Exception {
        ahgou = new Person(new Name("Gou"),
                new Phone("123", true),
                new Email("gou@gmail.com", true),
                new Address("123 Clementi", true),
                new UniqueTagList(new Tag("ah"), new Tag("happy")));
        ahmao = new Person(new Name("Mao"),
                new Phone("321", false),
                new Email("mao@gmail.com", false),
                new Address("321 Clementi", false),
                new UniqueTagList(new Tag("ah"), new Tag("sad")));
    }

    @Test
    public void printable_testPrivate() {
        final String expectedPrivateDetails = "Name: Gou Phone: (private) 123 Email: (private) gou@gmail.com Address: (private) 123 Clementi ";
        assertPrivatePrintableString(expectedPrivateDetails);
    }

    @Test
    public void printable_testPublic() {
        final String expectedPublicDetails = "Name: Mao Phone: 321 Email: mao@gmail.com Address: 321 Clementi ";
        assertPublicPrintableString(expectedPublicDetails);
    }

    private void assertPrivatePrintableString(String privateDetails) {
        assertEquals(Formatter.getPrintableString(ahgou.getName(), ahgou.getPhone(), ahgou.getEmail(), ahgou.getAddress()), privateDetails);
    }

    private void assertPublicPrintableString(String publicDetails) {
        assertEquals(Formatter.getPrintableString(ahmao.getName(), ahmao.getPhone(), ahmao.getEmail(), ahmao.getAddress()), publicDetails);
    }
}
