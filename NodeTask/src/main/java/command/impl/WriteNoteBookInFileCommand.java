package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import model.NoteBookProvider;
import services.NoteBookService;
import services.factory.ServiceFactory;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Записать Блокнот в файл
 */
public class WriteNoteBookInFileCommand implements Command {
    private Response response;
    private NoteBookService service;

    public Response execute(Request request) {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        service.writeNoteBookOnFile(request.getArg());
        response.setStatusMessage(request.getCommandName(), true);
        return response;
    }
}
