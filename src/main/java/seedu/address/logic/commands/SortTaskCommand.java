package seedu.address.logic.commands;

import seedu.address.logic.CommandHistory;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

import static java.util.Objects.requireNonNull;

public class SortTaskCommand extends Command {

    public static final String COMMAND_WORD = "sorttask";
    public static final String MESSAGE_SUCCESS = "Task List has been sorted";

    @Override
    public CommandResult execute(Model model, CommandHistory history) throws CommandException {
        requireNonNull(model);
        model.sortTask();
        model.commitTaskList();
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
