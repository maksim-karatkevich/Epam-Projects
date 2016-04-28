package model;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NoteBookProvider {
    private static final NoteBookProvider insrance = new NoreBookProvider();
    
    private  NoteBook noteBook;

    private NoteBookProvider() {
        noteBook = new NoteBook();
    }

    public static NoteBookProvider getInstance() {
        return instance;
    }

    public NoteBook getNoteBook(){
        return noteBook;
    }
}
