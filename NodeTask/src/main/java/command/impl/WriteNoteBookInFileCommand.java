package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import services.factory.impl.NoteBookServiceImpl;
import services.factory.ServiceFactory;

/**
 * Записать Блокнот в файл
 */
public class WriteNoteBookInFileCommand implements Command {
    private Response response;
    private NoteBookServiceImpl service;

    public Response execute(Request request) {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        service.writeNoteBookOnFile(request.getArg());
        response.setStatusMessage(request.getCommandName(), true);
        return response;
    }
}
