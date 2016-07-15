import dao.impl.NoteBookDAOImpl;

public class Main {
    public static void main(String[] args) throws Exception {

//        Controller controller = new Controller();
//
//        Request request = new Request("CREATE_NOTE_BOOK_COMMAND");
//        controller.doAction(request);
//
//        request = new Request("ADD_NOTE_COMMAND","Some text");
//        controller.doAction(request);
//        request.setArg("Second");
//        controller.doAction(request);
//
//        request.setCommandName("FIND_NgOTE_ON_CONTENT_COMMAND");
//        request.setArg("Second");
//        controller.doAction(request);
//
//        request.setCommandName("FIND_NOTE_ON_DATE_COMMAND");
//        request.setArg("2016-gf04-28");
//        controller.doAction(request);
//
//        request.setCommandName("SAVE_NOTE_BOOK_IN_FILE_COMMAND");
//        request.setArg("/Users/maksim_kevich/Desktop/ideaProjects/NodeTask/src/main/resources/tmp.ser");
//        controller.doAction(request);
//
//        request = new Request();
//        request.setCommandName("LOAD_NOTE_BOOK_ON_FILE_COMMAND");
//        request.setArg("/Users/maksim_kevich/Desktop/ideaProjects/NodeTask/src/main/resources/tmp.sedr");
//        controller.doAction(request);

//        request.setCommandName("SHOW_NOTE_IN_NOTE_BOOK_COMMAND");
//        controller.doAction(request);
        NoteBookDAOImpl i = new NoteBookDAOImpl();
//        i.addNote("MASSAGE1");
//        i.addNote("MASSAGE2");
//        i.addNote("MASSAGE3");
        i.getNotes();
    }
}
