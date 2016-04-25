package command;

import model.NoteBookProvider;

/**
 * Срздать блокнотdqwd
 */
public class CreateNoteBookCommand implements Command {

    public void execute() {
        // Create noteBook
        NoteBookProvider.getInstance();
    }
}
