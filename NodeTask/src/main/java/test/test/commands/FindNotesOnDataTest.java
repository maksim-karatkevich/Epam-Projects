package test.test.commands;


import bean.Request;
import bean.Response;
import controller.Controller;
import model.Note;
import model.NoteBookProvider;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.text.ParseException;

public class FindNotesOnDataTest {
    Request request;
    Controller controller;

    @BeforeSuite
    public void setUp() throws ParseException {
        controller = new Controller();
        request = new Request("CreateNoteBookCommand", "");
        controller.doAction(request);
        request.setCommandName("AddNoteCommand");
        request.setArg("first note");
        controller.doAction(request);
        request.setArg("second note");
        controller.doAction(request);
    }

    @Test
    public void findNoteOnDataTest() throws ParseException {
        request.setCommandName("FindNoteOnDateCommand");
        request.setArg("2016-04-28");
        Response response = controller.doAction(request);
        Assert.assertTrue(response.getStatusMessage().contains("completed successfully"));
    }

    @AfterSuite
    public void tearDown(){
        request = null;
        controller = null;
    }


}
