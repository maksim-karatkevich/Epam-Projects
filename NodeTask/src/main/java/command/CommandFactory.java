package command;


public class CommandFactory {

    public static Command getCommand(String commandName){

        switch (commandName) {
            case "CreateNoteBookCommand":
                return new CreateNoteBookCommand();
            case "AddNoteCommand":
                return new AddNoteCommand();
            case "FindNoteOnDateCommand":
                return new FindNoteOnDateCommand();
            case "FindNoteOnContentCommand":
                return new FindNoteOnContentCommand();
            case "LoadNoteBookOnFile":
                return new LoadNoteBookOnFile();
            case "ShowNoteInNoteBookCommand":
                return new ShowNoteInNoteBookCommand();
            case "WriteNoteBookInFileCommand":
                return new WriteNoteBookInFileCommand();
            default:
                throw new IllegalArgumentException(commandName + "command not exists");
        }

    }
}
