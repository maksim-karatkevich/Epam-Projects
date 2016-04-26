package command;

import bean.Request;
import bean.Response;
import model.Note;
import model.NoteBook;
import model.NoteBookProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Загрузить Блокнот из файла
 */
public class LoadNoteBookOnFile implements Command {
    Response response;

    public Response execute(Request request) {
        response = new Response();
        try {
            NoteBookProvider.setNewInstance(request.getArg());
            response.setStatusMassage(request.getCommandName(), true);

        } catch (IOException e) {
            response.setStatusMassage(request.getCommandName(), false);
        } catch (ClassNotFoundException e) {
            response.setStatusMassage(request.getCommandName(), false);
        }

        return response;
    }
}
