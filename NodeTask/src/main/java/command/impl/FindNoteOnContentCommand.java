package command.impl;

import bean.Request;
import bean.Response;

import command.Command;
import services.factory.impl.NoteBookServiceImpl;
import services.factory.ServiceFactory;

/**
 * Найти записи в блокноте по содержимому
 */

public class FindNoteOnContentCommand implements Command {
    private Response response;
    private NoteBookServiceImpl service;

    public Response execute(Request request) throws Exception {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        if (service.findNoteOnContent(request.getArg()) != null){
            response.setStatusMessage(request.getCommandName(), true);
        } else {
            response.setStatusMessage(request.getCommandName(), false);
        }
        return response;
    }

}
