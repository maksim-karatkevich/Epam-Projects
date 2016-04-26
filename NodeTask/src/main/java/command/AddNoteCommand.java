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

//    public AddNoteCommand(String arg) {
//        this.note = new Note(arg);
//    }

    public Response execute(Request request) {
        //        NoteBookProvider.getInstance().add(new Note("Some note"));
        response = new Response();
        NoteBookProvider.getInstance().add(note);
        response.setMassage(response.getMassage() + " " + request.getCommandName());
        return response;
    }
}
