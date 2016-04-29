package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import model.NoteBook;
import model.NoteBookProvider;
import services.NoteBookService;
import services.factory.ServiceFactory;

import java.io.IOException;

/**
 * Загрузить Блокнот из файла
 */
public class LoadNoteBookOnFile implements Command {
    private Response response;
    private NoteBookService service;

    public Response execute(Request request) throws IOException, ClassNotFoundException {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        NoteBookProvider.getInstance().setInstance(service.loadNoteBook(request.getArg()));
        response.setStatusMessage(request.getCommandName(), true);
        return response;
    }
}
