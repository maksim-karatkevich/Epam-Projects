package test.test.commands;
import bean.Request;
import bean.Response;
import controller.Controller;
import model.NoteBookProvider;
import org.testng.annotations.*;
import java.text.ParseException;


import static org.testng.Assert.fail;

public class AddNoteCommandTest {
    Controller controller;
    Request request;
    Response response;
    int counter = 0;
    @DataProvider(name = "Notes")
    public Object[][] getNotes(){
        return new Object[][]{
                {"Firs Note"},
                {"Second Note"},
                {"Third Note"},
                {"Fourth Note"}
        };
    }

    @BeforeSuite
    public void setUp(){
        controller = new Controller();
        request = new Request();
    }




    @Test(dataProvider = "Notes")
    public void addCommandTest(String noteText) throws ParseException {
        request.setArg(noteText);
        request.setCommandName("AddNoteCommand");
        controller.doAction(request);
        if (!NoteBookProvider.getInstance().getNotes().get(counter).getText().equals(noteText)){
            fail();
        }
        counter++;
    }

    @AfterSuite
    public void close(){
        controller = null;
        request = null;
        response = null;
    }

}
