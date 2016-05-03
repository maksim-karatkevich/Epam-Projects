package service.factory;


import model.Note;
import model.NoteBook;
import service.factory.exception.ServiceException;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface NoteBookService {

    void createNoteBook();

    void addNote(String noteText);

    Note findNoteOnContent(String text);

    List<Note> findNoteOnDate(String date) throws ParseException, ServiceException;

    NoteBook loadNoteBook(String path) throws IOException, ClassNotFoundException, ServiceException;

    List<Note> showNotes();

    void saveNoteBookOnFile(String path) throws IOException, ServiceException;

}
