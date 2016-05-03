package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import model.Note;
import service.factory.exception.ServiceException;
import service.factory.impl.NoteBookServiceImpl;
import service.factory.ServiceFactory;

import java.text.ParseException;
import java.util.List;

/**
 * Найти записи в блокноте по дате создания
 */
public class FindNoteOnDateCommand implements Command {
    private Response response;
    private NoteBookServiceImpl service;

    public Response execute(Request request) {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        List<Note> list = null;
        try {
            list = service.findNoteOnDate(request.getArg());
            if (!list.isEmpty()) {
                response.setStatusMessage(request.getCommandName(), true);
            } else {
                response.setStatusMessage(request.getCommandName(), false);

            }
        } catch (ServiceException e) {
            response.setStatusMessage(request.getCommandName(), false);

        }

        return response;
    }
}
