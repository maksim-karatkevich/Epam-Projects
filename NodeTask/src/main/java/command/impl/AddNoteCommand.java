package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import service.factory.impl.NoteBookServiceImpl;
import service.factory.ServiceFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Добавить запись в Блокнот
 */
public class AddNoteCommand implements Command {
    private Response response;
    private NoteBookServiceImpl service;
    public Response execute(Request request) {
        service = ServiceFactory.getInstance().getNoteBookService();
        response = new Response();
        String noteText = request.getArg();
        service.addNote(noteText);
        response.setStatusMessage(request.getCommandName(), true);
        return response;
    }
}
