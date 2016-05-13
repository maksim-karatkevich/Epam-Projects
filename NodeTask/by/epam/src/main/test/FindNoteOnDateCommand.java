import bean.Request;
import controller.Controller;
import model.Note;
import model.NoteBookProvider;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FindNoteOnDateCommand {
    private Date date;
    private Controller controller;
    private Request request;
    private DateFormat format;
    private List<Note> list;


    @BeforeMethod
    public void setUp() throws Exception {
        controller = new Controller();
        request = new Request();
        date = new Date();
        format = new SimpleDateFormat("yyyy-MM-dd");

        request.setCommandName("ADD_NOTE_COMMAND");
        request.setArg("First note");
        controller.doAction(request);
        request.setArg("Second note");
        controller.doAction(request);
        request.setArg("Third note");
        controller.doAction(request);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        controller = null;
        request = null;
        date = null;
        format = null;
    }



    @Test
    public void positiveTestFindNotesOnData() throws Exception {
        list = new ArrayList<>();
        for (Note n : NoteBookProvider.getInstance().getNoteBook().getNotes()){
            if (format.format(n.getData()).equals(format.format(date))){
                list.add(n);
            }
        }
        Assert.assertTrue(!list.isEmpty());
    }
    @Test
    public void negativeTestFindNotesOnData() throws Exception {
        list = new ArrayList<>();
        String wrongDate = "2000-01-24";
        for (Note n : NoteBookProvider.getInstance().getNoteBook().getNotes()){
            if (format.format(n.getData()).equals(wrongDate)){
                list.add(n);
            }
        }
        Assert.assertTrue(list.isEmpty());
    }
}
