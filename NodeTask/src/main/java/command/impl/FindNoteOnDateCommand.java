package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import model.Note;
import services.NoteBookService;
import services.factory.ServiceFactory;

import java.text.ParseException;
import java.util.List;

/**
 * Найти записи в блокноте по дате создания
 */
public class FindNoteOnDateCommand implements Command {
    private Response response;
    private NoteBookService service;

    public Response execute(Request request) throws ParseException {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        List<Note> list = service.findNoteOnDate(request.getArg());
        if(!list.isEmpty()){
            response.setStatusMessage(request.getCommandName(), true);
        } else {
            response.setStatusMessage(request.getCommandName(), false);

        }
        return response;
    }
}
