package seedu.addressbook.data.person;

import org.junit.Test;
import seedu.addressbook.data.tag.UniqueTagList;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getPrintableString() throws Exception {
        Name name = new Name(Name.EXAMPLE);
        Phone phone = new Phone(Phone.EXAMPLE, false);
        Email email = new Email(Email.EXAMPLE, false);
        Address address = new Address(Address.EXAMPLE, false);
        UniqueTagList tagList = new UniqueTagList();
        Person person = new Person(name, phone, email, address, tagList);

        assertEquals(person.getPrintableString(person.getName(), person.getEmail(), person.getAddress()),
                Name.MESSAGE_NAME + Name.EXAMPLE + Email.MESSAGE_EMAIL + Email.EXAMPLE + Address.MESSAGE_ADDRESS + Address.EXAMPLE);
    }
}