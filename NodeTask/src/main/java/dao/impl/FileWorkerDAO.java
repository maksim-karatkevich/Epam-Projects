package dao.impl;


import model.NoteBook;
import model.NoteBookProvider;

import java.io.*;

public class FileWorkerDAO {

    public void saveNoteBookInDirectory(String path) {
        try (FileOutputStream fileOut = new FileOutputStream(path);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(NoteBookProvider.getInstance().getNoteBook());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public NoteBook loadNoteBookFromDirectory(String path, NoteBook noteBook) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        noteBook = (NoteBook) in.readObject();
        return noteBook;
    }
}
