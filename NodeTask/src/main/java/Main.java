import bean.Request;
import bean.Response;
import controller.Controller;
import model.Note;
import model.NoteBookConsoleView;
import model.NoteBookProvider;

public class Main {
    public static void main(String[] args) {
//        NoteBookProvider.getInstance().add(new Note("Some note"));
//        NoteBookProvider.getInstance().add(new Note("Some note 1"));
//        NoteBookProvider.getInstance().add(new Note("Some note 2"));
//        NoteBookProvider.getInstance().add(new Note("Some note 3"));
//        NoteBookProvider.getInstance().add(new Note("Some note 3"));
//        NoteBookConsoleView.print(NoteBookProvider.getInstance());

        Controller controller = new Controller();
        // create note book
        Request request = new Request();
        request.setCommandName("CreateNoteBookCommand");
        Response response = controller.doAction(request);
        System.out.println(response.getMassage());

        // add note
        Request request1 = new Request();
        request1.setArg("Firs note");
        request1.setCommandName("AddNoteCommand");
        Response response1 = controller.doAction(request1);
        System.out.println(response1.getMassage());

        // add note 2
        Request request2 = new Request();
        request2.setArg("Second note");
        request2.setCommandName("AddNoteCommand");
        Response response2 = controller.doAction(request2);
        System.out.println(response2.getMassage());




    }
}
