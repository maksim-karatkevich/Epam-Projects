package model;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NoteBookProvider {
    private static NoteBook instance;

    private NoteBookProvider() {
    }

    public static NoteBook getInstance() {
        if (instance == null) {
            instance = new NoteBook();
        }
        return instance;
    }

    public static NoteBook setNewInstance(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        instance = (NoteBook) in.readObject();
        return instance;
    }

}
