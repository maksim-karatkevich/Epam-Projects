package command;

import bean.Request;
import bean.Response;
import model.Note;

import model.NoteBookProvider;

/**
 * Найти записи в блокноте по содержимому
 */

public class FindNoteOnContentCommand implements Command {
    Response response;

    public Response execute(Request request) {
        response = new Response();
        for (Note note : NoteBookProvider.getInstance().getNotes()) {
            if (request.getArg().equals(note.getText())) {
                response.setStatusMessage(request.getCommandName(), true);
                return response;
            }
        }
        response.setStatusMessage(request.getCommandName(), false);
        return response;
    }

}
