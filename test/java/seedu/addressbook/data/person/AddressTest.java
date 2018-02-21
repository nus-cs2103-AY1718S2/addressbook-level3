package seedu.addressbook.data.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {
    private static final String FORMAT_ADDRESS_HEADER = "Address: ";
    private static final String FORMAT_PRIVATE = "(private) ";
    
    @Test
    public void getPrintableString_isPrivate() throws Exception {
        Address address1 = new Address("380 South San Rafael Avenue", true);
        assertEquals(FORMAT_ADDRESS_HEADER + FORMAT_PRIVATE + "380 South San Rafael Avenue", address1.getPrintableString());

        Address address2 = new Address("2 Bayfront Avenue, Bay Level, 01-03", true);
        assertEquals(FORMAT_ADDRESS_HEADER + FORMAT_PRIVATE + "2 Bayfront Avenue, Bay Level, 01-03", address2.getPrintableString());
    }

    @Test
    public void getPrintableString_isNotPrivate() throws Exception {
        Address address1 = new Address("380 South San Rafael Avenue", false);
        assertEquals(FORMAT_ADDRESS_HEADER + "380 South San Rafael Avenue", address1.getPrintableString());
        
        Address address2 = new Address("2 Bayfront Avenue, Bay Level, 01-03", false);
        assertEquals(FORMAT_ADDRESS_HEADER + "2 Bayfront Avenue, Bay Level, 01-03", address2.getPrintableString());
    }
}