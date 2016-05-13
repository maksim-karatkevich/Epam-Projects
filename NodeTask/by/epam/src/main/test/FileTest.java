import bean.Request;
import controller.Controller;
import dao.factory.DAOFactory;
import model.NoteBook;
import model.NoteBookProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileTest {

    private Controller controller;
    private Request request;
    @BeforeMethod
    public void setUp() throws Exception {
        controller = new Controller();
        request = new Request();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        controller = null;
        request = null;
    }

    @Test
    public void loadFileTest() throws Exception {
        request.setCommandName("CREATE_NOTE_BOOK_COMMAND");
        controller.doAction(request);
        request.setCommandName("ADD_NOTE_COMMAND");
        request.setArg("First note");
        controller.doAction(request);
        request.setCommandName("SAVE_NOTE_BOOK_IN_FILE_COMMAND");
        request.setArg("/Users/maksim_kevich/Desktop/test_folder/tmp.ser");
        controller.doAction(request);
        NoteBook n1 = NoteBookProvider.getInstance().getNoteBook();
        NoteBook n2 = null;
        n2 = DAOFactory.getInstance().getFileDAOImpl().load("/Users/maksim_kevich/Desktop/test_folder/tmp.ser", n2);
        Assert.assertTrue(n1.equals(n2));
    }

}
