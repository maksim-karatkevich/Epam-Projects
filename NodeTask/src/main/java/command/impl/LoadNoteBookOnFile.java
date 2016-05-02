package command.impl;

import bean.Request;
import bean.Response;
import command.Command;
import model.NoteBookProvider;
import services.factory.impl.NoteBookServiceImpl;
import services.factory.ServiceFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Загрузить Блокнот из файла
 */
public class LoadNoteBookOnFile implements Command {
    private Response response;
    private NoteBookServiceImpl service;

    public Response execute(Request request) throws IOException, ClassNotFoundException {
        response = new Response();
        service = ServiceFactory.getInstance().getNoteBookService();
        String path = request.getArg();
        try {
            NoteBookProvider.getInstance().setInstance(service.loadNoteBook(path));
            response.setStatusMessage(request.getCommandName(), true);
        } catch (FileNotFoundException ex){
            response.setStatusMessage(request.getCommandName(), false);
            ex.printStackTrace();
        }
        return response;
    }
}
