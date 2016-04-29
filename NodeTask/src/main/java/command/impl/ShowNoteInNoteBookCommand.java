package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import services.factory.impl.NoteBookServiceImpl;
import services.factory.ServiceFactory;

/**
 * Показать записи в блокноте
 */
public class ShowNoteInNoteBookCommand implements Command {
    private Response response;
    private NoteBookServiceImpl service;

    public Response execute(Request request) {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        service.showNotes();
        response.setStatusMessage(request.getCommandName(), true);
        return response;
    }
}
