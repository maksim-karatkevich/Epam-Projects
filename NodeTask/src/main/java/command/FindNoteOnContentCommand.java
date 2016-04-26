package command;

import bean.Request;
import bean.Response;
import model.Note;

import model.NoteBook;
import model.NoteBookConsoleView;
import model.NoteBookProvider;

import javax.xml.soap.Node;
import java.util.Date;
import java.util.List;

/**
 * Найти записи в блокноте по содержимому
 */

public class FindNoteOnContentCommand implements Command {
    Response response;

    public Response execute(Request request) {
        response = new Response();

        for (Note note : NoteBookProvider.getInstance().getNotes()) {
            if (request.getArg().equals(note.getText())) {
                response.setStatusMassage(request.getCommandName(), true);
                return response;
            }
        }
        response.setStatusMassage(request.getCommandName(), false);
        return response;
    }

}
