package seedu.addressbook.commands;

import java.util.List;

import seedu.addressbook.data.person.Person;

public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n"
            + "Sort all people in alphabetical order.\n\t"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        List<Person> allPerson = addressBook.getAllPersons().getInternalList();
        allPerson.sort((Person p1, Person p2) -> (p1.getName().toString()).compareTo(p2.getName().toString()));
        return new CommandResult(getMessageForPersonListShownSummary(allPerson), allPerson);
    }
}
