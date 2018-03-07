package seedu.addressbook.commands;

import seedu.addressbook.common.Messages;

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
        return new CommandResult(Messages.MESSAGE_SORTED);
    }
}