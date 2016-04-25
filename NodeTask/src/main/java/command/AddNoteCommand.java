package command;

import bean.Request;
import bean.Response;
import model.Note;

/**
 * Добавить запись в Блокнот
 */
public class AddNoteCommand implements Command {
    private Note note;
    public AddNoteCommand(Note note) {
        this.note = note;
    }



    public Response execute(Request request) {
        return null;
    }
}
