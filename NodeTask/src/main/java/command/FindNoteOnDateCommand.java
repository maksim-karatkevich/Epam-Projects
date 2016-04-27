package command;

import bean.Request;
import bean.Response;
import model.Note;
import model.NoteBookProvider;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Найти записи в блокноте по дате создания
 */
public class FindNoteOnDateCommand implements Command {
    Response response;

    public Response execute(Request request) throws ParseException {
        try {
            response = new Response();
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(request.getArg());
            String t = "";
            for (Note note : NoteBookProvider.getInstance().getNotes()) {
                if (format.parse(format.format(note.getData())).compareTo(date) == 0) {
                    t += " " + note.getText();
                }
            }

            if (!t.equals("")) {
                response.setStatusMessage(request.getCommandName() + t, true);
            } else {
                response.setStatusMessage(request.getCommandName(), false);
            }
            return response;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        response.setStatusMessage(request.getCommandName(), false);
        return response;
    }
}
