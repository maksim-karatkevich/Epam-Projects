package command;

import bean.Request;
import bean.Response;
import model.NoteBookProvider;

import java.io.IOException;

/**
 * Загрузить Блокнот из файла
 */
public class LoadNoteBookOnFile implements Command {
    Response response;

    public Response execute(Request request) {
        response = new Response();
        try {
            NoteBookProvider.setNewInstance(request.getArg());
            response.setStatusMessage(request.getCommandName(), true);

        } catch (IOException e) {
            response.setStatusMessage(request.getCommandName(), false);
        } catch (ClassNotFoundException e) {
            response.setStatusMessage(request.getCommandName(), false);
        }

        return response;
    }
}
