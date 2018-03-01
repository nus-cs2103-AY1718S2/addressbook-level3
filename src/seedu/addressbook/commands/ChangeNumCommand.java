package seedu.addressbook.commands;

import seedu.addressbook.common.Messages;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.UniquePersonList;


/**
 * Changes the phone number of a person identified using it's last displayed index from the address book.
 */
public class ChangeNumCommand extends Command {

    public static final String COMMAND_WORD = "changenum";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Changes the phone number of the person identified by the index number used in the last person listing.\n"
            + "Parameters: INDEX NEW_NUMBER\n"
            + "Example: " + COMMAND_WORD + " 1" + " 99997777";

    public static final String MESSAGE_CHANGE_NUMBER_PERSON_SUCCESS = "Changed Person's Number: %1$s";
    
    private String newNum;


    public ChangeNumCommand(int targetVisibleIndex, String num) {
        
        super(targetVisibleIndex);
        newNum = num;
    }


    @Override
    public CommandResult execute() {
        try {
            final Person target = (Person)getTargetPerson();
            target.setPhone(newNum);
            return new CommandResult(String.format(MESSAGE_CHANGE_NUMBER_PERSON_SUCCESS, target));

        } catch (IndexOutOfBoundsException ie) {
            return new CommandResult(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        } 
    }

}
