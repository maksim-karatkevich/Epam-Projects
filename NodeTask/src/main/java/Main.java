import bean.Request;
import bean.Response;
import controller.Controller;
import model.Note;
import model.NoteBookProvider;
import view.NoteBookConsoleView;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws Exception {

        Controller controller = new Controller();

        Request request = new Request("CREATE_NOTE_BOOK_COMMAND");
        controller.doAction(request);

        request = new Request("ADD_NOTE_COMMAND","Some text");
        controller.doAction(request);
        request.setArg("Second");
        controller.doAction(request);

        request.setCommandName("FIND_NOTE_ON_CONTENT_COMMAND");
        request.setArg("Second");
        controller.doAction(request);

        request.setCommandName("FIND_NOTE_ON_DATE_COMMAND");
        request.setArg("2016-04-28");
        controller.doAction(request);

        request.setCommandName("WRITE_NOTE_BOOK_IN_FILE_COMMAND");
        request.setArg("/Users/maksim_kevich/Desktop/ideaProjects/NodeTask/src/main/resources/tmp.ser");
        controller.doAction(request);

        request = new Request();
        request.setCommandName("LOAD_NOTE_BOOK_ON_FILE");
        request.setArg("/Users/maksim_kevich/Desktop/ideaProjects/NodeTask/src/main/resources/tmp.ser");
        controller.doAction(request);

        request.setCommandName("SHOW_NOTE_IN_NOTE_BOOK_COMMAND");
        controller.doAction(request);

        NoteBookConsoleView.print(NoteBookProvider.getInstance().getNoteBook());
    }
}
