package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;

/**
 * List of all persons in addressbook sorted in increasing alphabetical order based on first name.
 */

public class SortCommand extends Command {

	public static final String COMMAND_WORD = "sort";

	public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" + "Displays all persons in the address book"
			+ "sorted in increasing alphabetical order based on the first name as a list.\n\t"
			+ "Example: " + COMMAND_WORD;

	@Override
	public CommandResult execute() {
		addressBook.sort();
		List<ReadOnlyPerson> allPersons = addressbook.getAllPersons.immmutableListView();
		return new CommandResult(getMessageForSortListShownSummary(allPersons), allPersons);
	}
	
}