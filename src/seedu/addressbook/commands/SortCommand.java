package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;
import java.util.List;

/**
 * Sorts entries in the address book according to first name.
 */

public class SortCommand extends Command{
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts entries in the address book according to first name.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        this.addressBook.sort();
        return new CommandResult("Address Book sorted!");
    }
}