package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import model.Note;
import service.factory.impl.NoteBookServiceImpl;
import service.factory.ServiceFactory;
import view.NoteBookConsoleView;

import java.util.List;

/**
 * Показать записи в блокноте
 */
public class ShowNoteInNoteBookCommand implements Command {
    private Response response;
    private NoteBookServiceImpl service;

    public Response execute(Request request) {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        List<Note> noteList = service.showNotes();
        NoteBookConsoleView.print(noteList);
        response.setStatusMessage(request.getCommandName(), true);
        return response;
    }
}
