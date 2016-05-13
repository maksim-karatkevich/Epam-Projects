import bean.Request;
import controller.Controller;
import model.NoteBookProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CreateNoteBookTest {
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
    public void testCreateNoteBook() throws Exception {
        request.setCommandName("CREATE_NOTE_BOOK_COMMAND");
        controller.doAction(request);
        Assert.assertNotNull(NoteBookProvider.getInstance());
    }



}