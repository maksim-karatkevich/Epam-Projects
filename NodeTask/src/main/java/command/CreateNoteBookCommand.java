package command;

import bean.Request;
import bean.Response;
import model.NoteBookProvider;

/**
 * Срздать блокнот
 */
public class CreateNoteBookCommand implements Command {
    Response response;


    public Response execute(Request request) {
        response = new Response();
        NoteBookProvider.getInstance();
        response.setMassage(response.getMassage() + " " + request.getCommandName());
        return response;
    }
}
