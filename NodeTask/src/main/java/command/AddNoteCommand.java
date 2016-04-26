package command;

import bean.Request;
import bean.Response;
import model.Note;
import model.NoteBookProvider;

/**
 * Добавить запись в Блокнот
 */
public class AddNoteCommand implements Command {
    Response response;
    private Note note;

    public Response execute(Request request) {
        response = new Response();
        note = new Note(request.getArg());
        NoteBookProvider.getInstance().add(note);
        response.setStatusMassage(request.getCommandName(), true);
        return response;
    }
}
