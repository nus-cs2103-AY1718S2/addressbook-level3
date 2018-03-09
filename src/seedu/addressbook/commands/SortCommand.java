package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Lists all persons in alphabetical order in the address book to the user.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n"
            + "Displays all persons in the address book as a list with index numbers sorted in alphabetical order.\n\t"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson>allPersons = sortList();
        return new CommandResult(getMessageForSortedPersonListShownSummary(), allPersons);
    }

    private List<ReadOnlyPerson> sortList() {
        List<ReadOnlyPerson> matchedPersons = new ArrayList<>();
        List<String> alphabeticalOrder = new ArrayList<>();
        for (ReadOnlyPerson person : addressBook.getAllPersons()) {
            alphabeticalOrder.add((person.getName()).toString());
        }
        Collections.sort(alphabeticalOrder);
        for (String personName : alphabeticalOrder) {
            Set<String> name = new HashSet<>();
            name.add(personName);
            for (ReadOnlyPerson person : addressBook.getAllPersons()) {
                Set<String> wordsInName = new HashSet<>(person.getName().getWordsInName());
                if ((!Collections.disjoint(wordsInName, name))) {
                    matchedPersons.add(person);
                }
            }
            name.clear();
        }
        return matchedPersons;
    }
}
