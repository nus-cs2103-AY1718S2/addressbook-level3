package seedu.addressbook.commands;

import seedu.addressbook.data.person.Person;

import java.util.List;

public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    @Override
    public CommandResult execute() {
        List<Person> allPersons = addressBook.getAllPersons().retrieveInternalList();
        allPersons.sort((Person p1, Person p2) -> (
                p1.getName().toString()).compareTo(p2.getName().toString()));
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }

}
