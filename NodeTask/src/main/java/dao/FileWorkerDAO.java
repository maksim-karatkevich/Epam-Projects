package dao;

import model.NoteBook;
import model.NoteBookProvider;

import java.io.*;

/**
 * Created by maksim_kevich on 4/29/16.
 */
public interface FileWorkerDAO {

    void saveNoteBookInDirectory(String path);

    NoteBook loadNoteBookFromDirectory(String path, NoteBook noteBook) throws IOException, ClassNotFoundException;
}
