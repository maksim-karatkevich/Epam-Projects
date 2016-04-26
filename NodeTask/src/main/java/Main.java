import bean.Request;
import bean.Response;
import controller.Controller;
import model.Note;
import model.NoteBookConsoleView;
import model.NoteBookProvider;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Controller controller = new Controller();
        // create note book
        Request request = new Request();
        request.setCommandName("CreateNoteBookCommand");
        Response response = controller.doAction(request);
        System.out.println(response.getStatusMassage());

        // add note
        Request request1 = new Request();
        request1.setArg("Firs note");
        request1.setCommandName("AddNoteCommand");
        Response response1 = controller.doAction(request1);
        System.out.println(response1.getStatusMassage());

        // add note 2
        Request request2 = new Request();
        request2.setArg("Second note");
        request2.setCommandName("AddNoteCommand");
        Response response2 = controller.doAction(request2);
        System.out.println(response2.getStatusMassage());

        // Найти записи в блокноте по содержимому
        Request request3 = new Request();
        request3.setArg("text to");
        request3.setCommandName("FindNoteOnContentCommand");
        Response response3 = controller.doAction(request3);
        System.out.println(response3.getStatusMassage());

        // Найти записи в блокноте по дате создания
        Request request4 = new Request();
        request4.setArg("2016-04-26");
        request4.setCommandName("FindNoteOnDateCommand");
        Response response4 = controller.doAction(request4);
        System.out.println(response4.getStatusMassage());

        // Показать записи в блокноте
        Request request5 = new Request();
        request5.setCommandName("ShowNoteInNoteBookCommand");
        Response response5 = controller.doAction(request5);
        System.out.println(response5.getStatusMassage());


    }
}
