package command;

import bean.Request;
import bean.Response;
import model.NoteBookProvider;

/**
 * Создать блокнот
 */
public class CreateNoteBookCommand implements Command {
    Response response;


    public Response execute(Request request) {
        response = new Response();
        NoteBookProvider.getInstance();
        response.setStatusMessage(request.getCommandName(), true);
        return response;
    }
}
