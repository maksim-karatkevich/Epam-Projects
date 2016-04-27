package command;

import bean.Request;
import bean.Response;
import model.Note;
import model.NoteBookProvider;

/**
 * Показать записи в блокноте
 */
public class ShowNoteInNoteBookCommand implements Command {
    Response response;
    public Response execute(Request request) {
        response = new Response();
        String notes = "";
        for (Note note : NoteBookProvider.getInstance().getNotes()){
            notes += note.getText() + " ";
        }
        if (!notes.equals("")){
            response.setStatusMessage(request.getCommandName() + " " + notes, true);
        } else response.setStatusMessage(request.getCommandName(), false);
        return response;
    }
}
