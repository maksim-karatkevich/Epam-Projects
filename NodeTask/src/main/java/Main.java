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
        // create note book
//        Request request = new Request();
//        request.setCommandName("CreateNoteBookCommand");
//        Response response = controller.doAction(request);
//        System.out.println(response.getStatusMessage());
//
//        // add note
//        Request request1 = new Request();
//        request1.setArg("Hello this is my first Note");
//        request1.setCommandName("AddNoteCommand");
//        Response response1 = controller.doAction(request1);
//        System.out.println(response1.getStatusMessage());
//
//        // add note 2
//        Request request2 = new Request();
//        request2.setArg("Hello again now i wrote second note");
//        request2.setCommandName("AddNoteCommand");
//        Response response2 = controller.doAction(request2);
//        System.out.println(response2.getStatusMessage());
//
//        // Найти записи в блокноте по содержимому
//        Request request3 = new Request();
//        request3.setArg("Hello again now i wrote second note");
//        request3.setCommandName("FindNoteOnContentCommand");
//        Response response3 = controller.doAction(request3);
//        System.out.println(response3.getStatusMessage());
//
//        // Найти записи в блокноте по дате создания
//        Request request4 = new Request();
//        request4.setArg("2016-04-26");
//        request4.setCommandName("FindNoteOnDateCommand");
//        Response response4 = controller.doAction(request4);
//        System.out.println(response4.getStatusMessage());
//
//        // Показать записи в блокноте
//        Request request5 = new Request();
//        request5.setCommandName("ShowNoteInNoteBookCommand");
//        Response response5 = controller.doAction(request5);
//        System.out.println(response5.getStatusMessage());
//
//        // запись в файл
//        Request request6 = new Request();
//        request6.setArg("/Users/maksim_kevich/Desktop/ideaProjects/NodeTask/src/main/resources/tmp.ser");
//        request6.setCommandName("WriteNoteBookInFileCommand");
//        Response response6 = controller.doAction(request6);
//        System.out.println(response6.getStatusMessage());

//         чтение из файла
//        Request request7 = new Request();
//        request7.setArg("/Users/maksim_kevich/Desktop/ideaProjects/NodeTask/src/main/resources/tmp.ser");
//        request7.setCommandName("LoadNoteBookOnFile");
//        Response response7 = controller.doAction(request7);
//        System.out.println(response7.getStatusMessage());
//
//        //        // Найти записи в блокноте по дате создания
//        Request request4 = new Request();
//        request4.setArg("2016-04-27");
//        request4.setCommandName("FindNoteOnDateCommand");
//        Response response4 = controller.doAction(request4);
//        System.out.println(response4.getStatusMessage());

//        Request request = new Request("CREATE_NOTE_BOOK_COMMAND");
//        controller.doAction(request);
//
//        request = new Request("ADD_NOTE_COMMAND","Some text");
//        controller.doAction(request);
//        request.setArg("Second");
//        controller.doAction(request);
//
//        request.setCommandName("FIND_NOTE_ON_CONTENT_COMMAND");
//        request.setArg("Second");
//        controller.doAction(request);
//
//        request.setCommandName("FIND_NOTE_ON_DATE_COMMAND");
//        request.setArg("2016-04-28");
//        controller.doAction(request);
//
//        request.setCommandName("WRITE_NOTE_BOOK_IN_FILE_COMMAND");
//        request.setArg("/Users/maksim_kevich/Desktop/ideaProjects/NodeTask/src/main/resources/tmp.ser");
//        controller.doAction(request);
        Request request = new Request();
        request.setCommandName("LOAD_NOTE_BOOK_ON_FILE");
        request.setArg("/Users/maksim_kevich/Desktop/ideaProjects/NodeTask/src/main/resources/tmp.ser");
        controller.doAction(request);

        request.setCommandName("SHOW_NOTE_IN_NOTE_BOOK_COMMAND");
        controller.doAction(request);



//        NoteBookConsoleView.print(NoteBookProvider.getInstance().getNoteBook());
    }
}
