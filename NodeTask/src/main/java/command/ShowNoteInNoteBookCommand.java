package command;

import bean.Request;
import bean.Response;
import model.Note;
import model.NoteBookConsoleView;
import model.NoteBookProvider;

/**
 * Показать записи в блокноте
 */
public class ShowNoteInNoteBookCommand implements Command {
    Response response;
    public Response execute(Request request) {
        response = new Response();
//        NoteBookConsoleView.print(NoteBookProvider.getInstance());
//        response.setStatusMassage(request.getCommandName(), true);
//        return response;
        String notes = "";
        for (Note note : NoteBookProvider.getInstance().getNotes()){
            notes += note.getText() + " ";
        }
        if (!notes.equals("")){
            response.setStatusMassage(request.getCommandName() + " " + notes, true);
        } else response.setStatusMassage(request.getCommandName(), false);
        return response;
    }
}
