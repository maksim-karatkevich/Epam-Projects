package dao.impl;


import dao.FileDAO;
import model.NoteBook;
import model.NoteBookProvider;

import java.io.*;

public class FileDAOImpl implements FileDAO {

    public void save(String path) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(NoteBookProvider.getInstance().getNoteBook());

    }

    public NoteBook load(String path, NoteBook noteBook) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        noteBook = (NoteBook) in.readObject();
        return noteBook;
    }
}
