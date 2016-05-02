package services.factory;


import model.Note;
import model.NoteBook;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface NoteBookService {

    void createNoteBook();

    void addNote(String noteText);

    Note findNoteOnContent(String text);

    List<Note> findNoteOnDate(String date) throws ParseException;

    NoteBook loadNoteBook(String path) throws IOException, ClassNotFoundException;

    List<Note> showNotes();

    void saveNoteBookOnFile(String path) throws IOException;

}
