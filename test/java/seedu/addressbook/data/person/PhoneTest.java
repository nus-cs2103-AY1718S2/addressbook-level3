package seedu.addressbook.data.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneTest {
    
    private static final String FORMAT_PHONE_HEADER = "Phone: ";
    private static final String FORMAT_PRIVATE = "(private) ";

    @Test
    public void getPrintableString_isPrivate() throws Exception {
        Phone phone1 = new Phone("999", true);
        assertEquals(FORMAT_PHONE_HEADER + FORMAT_PRIVATE + "999", phone1.getPrintableString());

        Phone phone2 = new Phone("995", true);
        assertEquals(FORMAT_PHONE_HEADER + FORMAT_PRIVATE + "995", phone2.getPrintableString());
    }

    @Test
    public void getPrintableString_isNotPrivate() throws Exception {
        Phone phone1 = new Phone("999", false);
        assertEquals(FORMAT_PHONE_HEADER + "999", phone1.getPrintableString());

        Phone phone2 = new Phone("995", false);
        assertEquals(FORMAT_PHONE_HEADER + "995", phone2.getPrintableString());
    }
}