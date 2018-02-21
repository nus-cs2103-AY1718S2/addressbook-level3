package seedu.addressbook.data.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailTest {
    
    private static final String FORMAT_EMAIL_HEADER = "Email: ";
    private static final String FORMAT_PRIVATE = "(private) ";

    @Test
    public void getPrintableString_isPrivate() throws Exception {
        Email email1 = new Email("batman@mail.com", true);
        assertEquals(FORMAT_EMAIL_HEADER + FORMAT_PRIVATE + "batman@mail.com", email1.getPrintableString());

        Email email2 = new Email("catMan@mail.com", true);
        assertEquals(FORMAT_EMAIL_HEADER + FORMAT_PRIVATE + "catMan@mail.com", email2.getPrintableString());
    }

    @Test
    public void getPrintableString_isNotPrivate() throws Exception {
        Email email1 = new Email("batman@mail.com", false);
        assertEquals(FORMAT_EMAIL_HEADER + "batman@mail.com", email1.getPrintableString());

        Email email2 = new Email("catMan@mail.com", false);
        assertEquals(FORMAT_EMAIL_HEADER + "catMan@mail.com", email2.getPrintableString());
    }
}