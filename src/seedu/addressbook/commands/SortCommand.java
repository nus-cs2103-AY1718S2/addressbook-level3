package seedu.addressbook.commands;

import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Sort all persons in the address book to the user.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" 
            + "Displays all persons sorted by name alphabetically.\n\t"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
    	 addressBook.sort();
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        return new CommandResult(getMessageForPersonSortShownSummary(allPersons), allPersons);
    }
}
