package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import controller.Controller;
import service.exception.ServiceException;
import service.impl.NoteBookServiceImpl;
import service.factory.ServiceFactory;

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
//            Controller.getLogger().error(ex);
            response.setStatusMessage(request.getCommandName(), false);
        }

        return response;
    }
}
