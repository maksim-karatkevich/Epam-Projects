package command;

import bean.Request;
import bean.Response;
import model.NoteBookProvider;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Записать Блокнот в файл
 */
public class WriteNoteBookInFileCommand implements Command {
    Response response;

    public Response execute(Request request) {
        response = new Response();
        try (FileOutputStream fileOut = new FileOutputStream(request.getArg());
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(NoteBookProvider.getInstance());
            response.setStatusMassage(request.getCommandName(), true);
        } catch (Exception ex) {
            response.setStatusMassage(request.getCommandName(), false);
        }
        return response;
    }
}
