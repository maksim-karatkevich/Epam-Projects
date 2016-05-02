package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import services.factory.impl.NoteBookServiceImpl;
import services.factory.ServiceFactory;

import java.io.IOException;

/**
 * Записать Блокнот в файл
 */
public class SaveNoteBookInFileCommand implements Command {
    private Response response;
    private NoteBookServiceImpl service;

    public Response execute(Request request) throws IOException {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        String path = request.getArg();
        try {
            service.saveNoteBookOnFile(path);
            response.setStatusMessage(request.getCommandName(), true);
        } catch (Exception ex) {
            service.saveNoteBookOnFile(path);
            ex.printStackTrace();
        }

        return response;
    }
}
