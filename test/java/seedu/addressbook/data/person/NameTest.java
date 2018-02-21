package seedu.addressbook.data.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
    
    public static final String FORMAT_NAME_HEADER = "Name: ";
    
    @Test
    public void getPrintableString() throws Exception {
        Name name1 = new Name("Grimmjow Jaegerjaquez");
        assertEquals(FORMAT_NAME_HEADER + "Grimmjow Jaegerjaquez", name1.getPrintableString());

        Name name2 = new Name("Nelliel Tu Odelschwanck");
        assertEquals(FORMAT_NAME_HEADER + "Nelliel Tu Odelschwanck", name2.getPrintableString());
    }
}