package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Lists all persons in the address book in sorted order by name to the user.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" 
            + "Displays all persons in the address book as a sorted list with index numbers.\n\t"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allSortedPersons = addressBook.getAllSortedPersons().immutableListView();
        return new CommandResult(getMessageForPersonListShownSummary(allSortedPersons), allSortedPersons);
    }
}
