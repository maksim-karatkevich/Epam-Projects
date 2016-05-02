package dao;

import model.NoteBook;

import java.io.*;


public interface FileDAO {

    void save(String path) throws IOException;

    NoteBook load(String path, NoteBook noteBook) throws IOException, ClassNotFoundException;
}
