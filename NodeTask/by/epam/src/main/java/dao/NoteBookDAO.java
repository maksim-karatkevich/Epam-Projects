package dao;

import connectionPool.exeptions.ConnectionPoolException;
import model.Note;
import model.NoteBook;

import java.sql.SQLException;
import java.util.List;


public interface NoteBookDAO {
    void addNoteBook(NoteBook noteBook);

    void addNote(String massage);

    Note getNote();

    List<Note> getNotes() throws ConnectionPoolException, SQLException;

    NoteBook getNoteBook();
}
