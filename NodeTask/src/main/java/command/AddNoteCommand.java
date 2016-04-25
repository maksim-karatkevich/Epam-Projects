package command;

import model.Note;

/**
 * Добавить запись в Блокнот
 */
public class AddNoteCommand implements Command {
    private Note note;
    public AddNoteCommand(Note note) {
        this.note = note;
    }

    public void execute() {
        //todo
    }

}
