package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import service.impl.NoteBookServiceImpl;
import service.factory.ServiceFactory;

/**
 * Найти записи в блокноте по содержимому
 */

public class FindNoteOnContentCommand implements Command {
    private Response response;
    private NoteBookServiceImpl service;

    public Response execute(Request request) {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        String searchContent = request.getArg();
        if (service.findNoteOnContent(searchContent) != null){
            response.setStatusMessage(request.getCommandName(), true);
        } else {
            response.setStatusMessage(request.getCommandName(), false);
        }
        return response;
    }

}
