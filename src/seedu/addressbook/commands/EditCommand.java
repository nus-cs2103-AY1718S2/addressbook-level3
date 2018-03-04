package seedu.addressbook.commands;

import seedu.addressbook.common.Messages;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Phone;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.data.person.UniquePersonList.PersonNotFoundException;
import seedu.addressbook.parser.Parser.Attribute;


/**
 * Edits a person identified using its last displayed index from the address book.
 */
public class EditCommand extends Command {

    public static final String COMMAND_WORD = "edit";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Edits an attribute of a person identified by the index number "
            + "used in the last find/list call.\n"
            + "Parameters: INDEX ATTRIBUTE NEW_VALUE\n"
            + "Example: " + COMMAND_WORD + " 1 name Ryan";

    private static final String MESSAGE_EDIT_PERSON_SUCCESS = "Edit successful!\n"
            + "Original Person: %1$s\n"
            + "New Person: %2$s";

    private final Attribute attribute;
    private final String newValue;


    public EditCommand(int targetVisibleIndex, Attribute attribute, String newValue) {
        super(targetVisibleIndex);
        this.attribute = attribute;
        this.newValue = newValue;
    }


    @Override
    public CommandResult execute() {
        try {
            final ReadOnlyPerson target = getTargetPerson();
            if (isNewValueSameAsOld(target)) {
                return new CommandResult(Messages.MESSAGE_INVALID_NEW_VALUE);
            }
            Person updatedPerson = updateExistingPerson(target);
            addressBook.removePerson(target);
            addressBook.addPerson(updatedPerson);
            return new CommandResult(String.format(MESSAGE_EDIT_PERSON_SUCCESS,
                    target.getAsTextHidePrivate(),
                    updatedPerson.getAsTextHidePrivate()));
        } catch (IndexOutOfBoundsException ie) {
            return new CommandResult(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        } catch (PersonNotFoundException pnfe) {
            return new CommandResult(Messages.MESSAGE_PERSON_NOT_IN_ADDRESSBOOK);
        } catch (IllegalValueException ive) {
            return new CommandResult(ive.getMessage());
        }
    }

    private boolean isNewValueSameAsOld(ReadOnlyPerson target) {
        switch (attribute) {
            case NAME:
                return target.getName().toString().equals(newValue);
            case PHONE:
                return target.getPhone().toString().equals(newValue);
            case EMAIL:
                return target.getEmail().toString().equals(newValue);
            case ADDRESS:
                return target.getAddress().toString().equals(newValue);
            default:
                return true;
        }
    }

    private Person updateExistingPerson(ReadOnlyPerson existingPerson) throws IllegalValueException {
        Name name = existingPerson.getName();
        Phone phone = existingPerson.getPhone();
        Email email = existingPerson.getEmail();
        Address address = existingPerson.getAddress();

        switch (attribute) {
            case NAME:
                name = new Name(newValue);
                break;
            case PHONE:
                phone = new Phone(newValue, phone.isPrivate());
                break;
            case EMAIL:
                email = new Email(newValue, email.isPrivate());
                break;
            case ADDRESS:
                address = new Address(newValue, address.isPrivate());
                break;
        }
        return new Person(name, phone, email, address, existingPerson.getTags());
    }
}
