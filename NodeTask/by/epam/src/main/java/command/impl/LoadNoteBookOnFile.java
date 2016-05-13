package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import controller.Controller;
import model.NoteBookProvider;
import service.exception.ServiceException;
import service.impl.NoteBookServiceImpl;
import service.factory.ServiceFactory;

/**
 * Загрузить Блокнот из файла
 */
public class LoadNoteBookOnFile implements Command {
    private Response response;
    private NoteBookServiceImpl service;

    public Response execute(Request request) {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        String path = request.getArg();
        try {
            NoteBookProvider.getInstance().setInstance(service.loadNoteBook(path));
            response.setStatusMessage(request.getCommandName(), true);
        } catch (ServiceException ex) {
//            Controller.getLogger().error(ex);
            response.setStatusMessage(request.getCommandName(), false);
        }
        return response;
    }
}
