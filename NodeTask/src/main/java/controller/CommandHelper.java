package controller;


import command.Command;
import command.impl.*;
import controller.exception.CommandHelperException;
import java.util.HashMap;
import java.util.Map;

public class CommandHelper {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandHelper() {
        commands.put(CommandName.CREATE_NOTE_BOOK_COMMAND, new CreateNoteBookCommand());
        commands.put(CommandName.ADD_NOTE_COMMAND, new AddNoteCommand());
        commands.put(CommandName.FIND_NOTE_ON_CONTENT_COMMAND, new FindNoteOnContentCommand());
        commands.put(CommandName.FIND_NOTE_ON_DATE_COMMAND, new FindNoteOnDateCommand());
        commands.put(CommandName.SHOW_NOTE_IN_NOTE_BOOK_COMMAND, new ShowNoteInNoteBookCommand());
        commands.put(CommandName.SAVE_NOTE_BOOK_IN_FILE_COMMAND, new SaveNoteBookInFileCommand());
        commands.put(CommandName.LOAD_NOTE_BOOK_ON_FILE_COMMAND, new LoadNoteBookOnFile());
    }

    public Command getCommand(String commandName) throws CommandHelperException {
        try {
            CommandName command = CommandName.valueOf(commandName);
            Command executeCommand = commands.get(command);
            return executeCommand;
        } catch (IllegalArgumentException ex){
            throw new CommandHelperException(commandName + " not exists", ex);
        }
    }
}
