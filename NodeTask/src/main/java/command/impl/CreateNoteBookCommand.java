package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import model.NoteBookProvider;
import services.factory.impl.NoteBookServiceImpl;
import services.factory.ServiceFactory;

/**
 * Создать блокнот
 */
public class CreateNoteBookCommand implements Command {
    private Response response;
    private NoteBookServiceImpl noteBookService;


    public Response execute(Request request) {
        noteBookService = ServiceFactory.getInstance().getNoteBookService();
        response = new Response();
        if (NoteBookProvider.getInstance().getNoteBook() != null){
            noteBookService.createNoteBook();
            response.setStatusMessage(request.getCommandName(), true);
        } else {
            response.setStatusMessage("noteBook already. " + request.getCommandName(), false);
        }
        return response;
    }
}
