package seedu.addressbook.commands;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;

public class EditNameCommand extends Command{

    public static final String COMMAND_WORD = "editName";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" + "Edits the name of a person(case-sensitive) in the address book. "
            + "Parameters: CURRENTNAME c/NEWNAME"
            + "Example: " + COMMAND_WORD
            + " John Doe c/Jane Doe";

    public static final String MESSAGE_SUCCESS = "%1$s successfully changed to: %2$s";
    public static final String MESSAGE_PERSON_NOT_FOUND = "This person does not exists in the address book";


    private final String currName;
    private final Name newName;
    private Person toEdit;


    public EditNameCommand(String currName, String newName) throws IllegalValueException {
        this.currName = currName;
        this.newName = new Name(newName);
    }
    
    public String getNewName(){
        return newName.toString();
    }

    @Override
    public CommandResult execute() {

        if(personExits(currName)) {
            
            toEdit.editName(newName);

            return new CommandResult(String.format(MESSAGE_SUCCESS, currName, newName));
        }
        else {
            return new CommandResult(MESSAGE_PERSON_NOT_FOUND);
        }
    }

    /**
     * Search if person with currName exists in the Address Book
     *
     * @param currName for searching
     * @return true if person exists and false otherwise
     */
    public boolean personExits(String currName){
        for (Person person : addressBook.getAllPersons()) {
            String name = person.getName().toString();
            if (currName.equals(name)){
                this.toEdit = person;
                return true;
            }
        }
        return false;
    }
}
