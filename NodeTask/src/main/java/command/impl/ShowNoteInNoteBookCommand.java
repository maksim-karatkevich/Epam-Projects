package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import model.NoteBook;
import model.NoteBookProvider;
import services.NoteBookService;
import services.factory.ServiceFactory;

/**
 * Показать записи в блокноте
 */
public class ShowNoteInNoteBookCommand implements Command {
    Response response;
    NoteBookService service;
    public Response execute(Request request) {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        service.showNotes();
        response.setStatusMessage(request.getCommandName(), true);
        return response;
    }
}
