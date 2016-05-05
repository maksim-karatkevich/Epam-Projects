import bean.Request;
import controller.Controller;
import model.Note;
import model.NoteBookProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class AddNoteTest {

    Controller controller;
    Request request;
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
    public void addNoteTest(String note) throws Exception {
        request.setCommandName("ADD_NOTE_COMMAND");
        request.setArg(note);
        controller.doAction(request);
        List<Note> list =  NoteBookProvider.getInstance().getNoteBook().getNotes();
        boolean containsOrNot = false;
        for (Note note1 : list){
            if (note1.getText().equals(note)){
                containsOrNot = true;
            }
        }
        Assert.assertTrue(containsOrNot);
    }
}
