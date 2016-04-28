package test.test.commands;


import bean.Request;
import bean.Response;
import controller.Controller;
import model.Note;
import model.NoteBookProvider;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.text.ParseException;

public class FindNoteOnContent {
    Controller controller;
    Request request;
    Response response;

    @DataProvider(name = "Notes")
    public Object[][] getNotes() {
        return new Object[][]{
                {"first Note"},
                {"second Note"},
                {"third Note"},
                {"fourth Note"},
                {"five Note"},
                {"six Note"},
                {"seven Note"}
        };
    }

    @BeforeSuite
    public void setUp() throws ParseException {
        controller = new Controller();
        request = new Request();
        request.setCommandName("AddNoteCommand");
        request.setArg("first Note");
        controller.doAction(request);
        request.setArg("second Note");
        controller.doAction(request);
        request.setArg("third Note");
        controller.doAction(request);
        request.setArg("fourth Note");
        controller.doAction(request);
        request.setArg("five Note");
        controller.doAction(request);
        request.setArg("six Note");
        controller.doAction(request);
        request.setArg("seven Note");
        controller.doAction(request);
    }


    @Test(dataProvider = "Notes")
    public void addCommandTest(String noteText) throws ParseException {
        boolean containsOrNot = false;
        for (Note note : NoteBookProvider.getInstance().getNotes()){
            if(note.getText().equals(noteText)) containsOrNot = true;
        }
        org.testng.Assert.assertTrue(containsOrNot);
    }

    @AfterSuite
    public void shutDown() {
        controller = null;
        request = null;
        response = null;
    }

}
