package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import model.Note;
import services.NoteBookService;
import services.factory.ServiceFactory;

/**
 * Добавить запись в Блокнот
 */
public class AddNoteCommand implements Command {
    private Response response;
    private NoteBookService service;
    private Note note;

    public Response execute(Request request) {
        service = ServiceFactory.getInstance().getNoteBookService();
        response = new Response();
        note = new Note(request.getArg());
        service.addNote(note);
        response.setStatusMessage(request.getCommandName(), true);
        return response;
    }
}
