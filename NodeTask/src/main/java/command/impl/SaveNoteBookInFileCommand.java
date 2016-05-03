package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import service.factory.exception.ServiceException;
import service.factory.impl.NoteBookServiceImpl;
import service.factory.ServiceFactory;

import java.io.IOException;

/**
 * Записать Блокнот в файл
 */
public class SaveNoteBookInFileCommand implements Command {
    private Response response;
    private NoteBookServiceImpl service;

    public Response execute(Request request) {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        String path = request.getArg();
        try {
            service.saveNoteBookOnFile(path);
            response.setStatusMessage(request.getCommandName(), true);
        } catch (ServiceException ex) {
            response.setStatusMessage(request.getCommandName(), false);
        }

        return response;
    }
}
