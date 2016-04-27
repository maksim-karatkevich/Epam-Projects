package test.test.commands;
import bean.Request;
import bean.Response;
import controller.Controller;
import model.Note;
import model.NoteBookProvider;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.text.ParseException;

public class AddNoteCommandTest {
    Controller controller;
    Request request;
    Response response;

    @DataProvider(name = "Notes")
    public Object[][] getNotes(){
        return new Object[][]{
                {new Note("Firs Note")},
                {new Note("Second Note")},
                {new Note("Third Note")},
                {new Note("Fourth Note")}
        };
    }

    @BeforeSuite
    public void setUp(){
        controller = new Controller();
        request = new Request();
        request.setCommandName("AddNoteCommand");
        request.setArg("Node for test");
    }

    @Test(dataProvider = "Notes")
    public void addCommandTest(Note note) throws ParseException {
//        request.setArg("Hello this is my first Note");
//        request.setCommandName("AddNoteCommand");
//        response = controller.doAction(request);
//        request.setArg("Second Note");
//        request.setCommandName("AddNoteCommand");
//        response = controller.doAction(request);
        for (Note note1 : NoteBookProvider.getInstance().getNotes()){
            System.out.println(note.getText());
        }
    }

    @AfterSuite
    public void shutDown(){
        controller = null;
        request = null;
        response = null;
    }

}
