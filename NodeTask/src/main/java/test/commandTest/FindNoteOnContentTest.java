package test.commandTest;


import bean.Request;
import controller.Controller;
import model.NoteBookProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FindNoteOnContentTest {
    Controller controller;
    Request request;
    int counter = 0;

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

    @DataProvider(name = "notes")
    public Object[][] getDate(){
        return new Object[][]{
                {"first note"},
                {"second"},
                {"third"},
                {"fourth note"}
        };
    }

    @Test(dataProvider = "notes")
    public void findNoteTest(String note) throws Exception {
        request.setCommandName("ADD_NOTE_COMMAND");
        request.setArg(note);
        controller.doAction(request);
        Assert.assertTrue(NoteBookProvider.getInstance().getNoteBook().getNotes().get(counter).getText().equals(note));
        counter++;
    }
}
