package test.test.commands;


import bean.Request;
import bean.Response;
import controller.Controller;
import model.NoteBook;
import model.NoteBookProvider;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.io.*;
import java.text.ParseException;


public class SaveNoteBookTest {
    Controller controller;
    Request request;
    NoteBook noteBook;

    @BeforeSuite
    public void setUp() throws ParseException {
        controller = new Controller();
        request = new Request("CreateNoteBookCommand", "");
        controller.doAction(request);
        request.setCommandName("AddNoteCommand");
        request.setArg("Some note");
        controller.doAction(request);
        request.setArg("/Users/maksim_kevich/Desktop/temp/tmp.ser");
        request.setCommandName("WriteNoteBookInFileCommand");
        controller.doAction(request);
        noteBook = NoteBookProvider.getInstance();
    }

    @Test
    public void writeNoteBookTest() throws IOException, ClassNotFoundException {
        File file = new File("/Users/maksim_kevich/Desktop/temp/tmp.ser");
        FileInputStream fileIn = new FileInputStream("/Users/maksim_kevich/Desktop/temp/tmp.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        NoteBook instance = (NoteBook) in.readObject();
        Assert.assertTrue(instance.equals(noteBook));
    }

    @AfterSuite
    public void close() {
        controller = null;
        request = null;
        noteBook = null;
    }
}
