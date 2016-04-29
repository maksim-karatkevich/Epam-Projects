package dao;

import model.NoteBook;

import java.io.*;


public interface FileDAO {

    void save(String path);

    NoteBook load(String path, NoteBook noteBook) throws IOException, ClassNotFoundException;
}
